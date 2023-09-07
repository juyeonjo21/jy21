package com.kh.springhome.controller;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.springhome.dao.BoardDao;
import com.kh.springhome.dao.MemberDao;
import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.BoardListDto;
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.error.AuthorityException;
import com.kh.springhome.vo.PaginationVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardDao boardDao;
	
	@Autowired
	private MemberDao memberDao;
	
	//등록(새글 or 답글)
	//- boardParent라는 항목의 유무에 따라 새글과 답글을 구분하여 처리
	@GetMapping("/write")
	public String write(Model model, @RequestParam (required = false)Integer boardParent) {
		
		//답글이라면 원본글 정보를 화면에 전달
		if(boardParent != null) { //답글이라면
			BoardDto originDto = boardDao.selectOne(boardParent);
			model.addAttribute("originDto", originDto);
			model.addAttribute("isReply", true);
		}
		else { //새글이라면
			model.addAttribute("isReply", false);
		}
		return "/WEB-INF/views/board/write.jsp";
	}
	
	@PostMapping("/write")
	public String write(
			@ModelAttribute BoardDto boardDto,
			HttpSession session) {
		int boardNo = boardDao.sequence();//번호를 구해서
		boardDto.setBoardNo(boardNo);//dto에 추가하고
		
		String memberId = (String) session.getAttribute("name");//id부르고
		boardDto.setBoardWriter(memberId);
		
		//글 등록 전에 새글/답글에 따른 그룹,상위글,차수를 계산
		if(boardDto.getBoardParent() == null) { //새글일 경우
		boardDto.setBoardGroup(boardNo);//그룹번호는 글번호로 설정
		//boardDto.setBoardParent(null); //상위글번호는 null로 설정(null은 따로 없어도 null이 나옴)
		//boardDto.setBoardDepth(0); //차수 0으로 설정(얘도 따로 설정 안 해도 0)
		}
		else {//답글일 경우
		BoardDto originDto = boardDao.selectOne(boardDto.getBoardParent());
		boardDto.setBoardGroup(originDto.getBoardGroup());//그룹번호는 원본글 그룹번호와 동일
		//boardDto.setBoardParent(originDto.getBoardNo()); //상위글 번호는 원본글 번호와 동일
		boardDto.setBoardDepth(originDto.getBoardDepth()+1); //차수는 원본글+1
		}
		
		
		//이 사용자의 마지막 글 번호를 조회
		Integer lastNo = boardDao.selectMax(memberId);
		
		//글을 등록하고
		boardDao.insert(boardDto);
		
		//포인트 계산 작업
		//- lastNo가 null이라는 것은 처음 글을 작성했다는 의미
		//- lastNo가 null이 아니면 조회한 다음 시간차를 비교
		if(lastNo == null){ //처음 작성한 글이라면
		memberDao.increaseMemberPoint(memberId, 10);//10점 부여	
		}
		else{//글 작성이 처음이 아니라면 시간 차이를 계산
			BoardDto lastDto = boardDao.selectOne(lastNo);
			Timestamp stamp = new Timestamp(
					lastDto.getBoardCtime().getTime());
			LocalDateTime lastTime = stamp.toLocalDateTime();
			LocalDateTime currentTime = LocalDateTime.now();
			
			//시간차 계산
			Duration duration = Duration.between(lastTime, currentTime);
			long seconds = duration.getSeconds(); //지금작성시간-마지막작성시간의 차이
			if(seconds > 300) { //시간차가 300초보다 크다면(=5분초과)
				memberDao.increaseMemberPoint(memberId, 10); //10점부여
			}
		}
		
		 return "redirect:detail?boardNo="+boardNo;
	}
	//상세
	@RequestMapping("/detail")
	public String detail(@RequestParam int boardNo, Model model,
							HttpSession session) {
		
//		조회수 중복 방지를 위한 마스터플랜
//		1.세션에 History라는 이름의 항목을 추출
//		2.없으면 생성, 있으면 추출
//		3.지금 읽는 글 번호가 history에 존재하는지 확인
//		4.없으면 추가하고 다시 세션에 저장
//		
//		Set<Integer> history;
//		if(session.getAttribute("history") != null) { //있으면(1)
//			history = (Set<Integer>) session.getAttribute("history");//(2)
//		}
//		else {//없으면(1)
//			history = new HashSet<>();//(2)
//		}
//		
//		boolean isRead = history.contains(boardNo); //=history에 boardNo가 있냐?
//		
//		if(isRead == false) {//읽은 적이 없으면(4)
//			history.add(boardNo);//글 번호를 추가하고
//			session.setAttribute("history", history);//session 갱신
//		}
//		log.debug("history = {}", history); //확인용 테스트 코드
//		
//		//조회수 중복 방지
//		if(isRead == false) { //읽은 적이 없을 때만 증가 시켜라
//		boardDao.updateReadcount(boardNo); //조회수 증가
//		}
//		
		BoardDto boardDto = boardDao.selectOne(boardNo);//조회
		model.addAttribute("boardDto", boardDto);
		
		//작성자의 회원정보 추가
		String boardWriter = boardDto.getBoardWriter();
		if(boardWriter != null){
			MemberDto memberDto = memberDao.selectOne(boardWriter);
			model.addAttribute("writerDto", memberDto);
		}
		return "/WEB-INF/views/board/detail.jsp";
	}
	
	//목록 + 검색
	//- 검색일 경우에는 type과 keyword라는 파라미터가 존재
	//- 목록일 경우에는 type과 keyword라는 파라미터가 없음
	//- 만약 불완전한 상태(type이나 keyword만 있는 경우) -> 목록으로 처리
	//(추가)페이징 관련 처리
//	@RequestMapping("/list")
//	public String list(Model model,
//			@RequestParam(required = false) String type,
//			@RequestParam(required = false) String keyword,
//			@RequestParam(required = false, defaultValue = "1") int page) {
//		boolean isSearch = type != null && keyword != null; //type과 keyword가 둘 다 있어야하니 null이 아니면 true
//		
//		//페이징과 관련된 값들을 계산하여 JSP로 전달
//		int begin = (page -1) / 10 * 10 +1;
//		int end = begin + 9;
//		//int count = 지금 상황에 해당하는 전체 데이터 갯수;
//		//int count = 목록갯수 or 검색 결과수;
//		int count = isSearch ?  boardDao.countList(type, keyword): boardDao.countList();
//		int pageCount = (count-1)/10+1; //10개씩 끊었을 때의 페이지가 넘어가는 식 // total = 131page
//		model.addAttribute("page",page);
//		model.addAttribute("begin",begin);
//		//end랑 pageCount 값을 비교 계산해서 마지막 페이지로는 더 적은 값을 써야한다.(페이지 더 안 넘어가게 하려면)
//		model.addAttribute("end",Math.min(pageCount, end));
//		model.addAttribute("pageCount", pageCount);
//		
//		if(isSearch) { //검색일 경우
//			List<BoardListDto> list = boardDao.selectListByPage(type,keyword, page);
//			model.addAttribute("list",list);
//			model.addAttribute("isSearch", true);
//		}
//		else { //목록일 경우
//		List<BoardListDto> list = boardDao.selectListByPage(page);
//		model.addAttribute("list", list);
//		model.addAttribute("isSearch", false);
////		model.addAttribute("list",boardDao.selectList());
//		}
//		return "/WEB-INF/views/board/list.jsp";
//}
	//(추가)ModleAttribute로 받은 데이터는 이름만 정하면 자동으로 화면으로 넘어감
	//- ModelAttribute(name="vo")는 model.addAttribute("vo",??)와 같다
	@RequestMapping("/list")
	public String list(@ModelAttribute(name="vo") PaginationVO vo,
						Model model) {
		int count = boardDao.countList(vo);
		vo.setCount(count);
				
	List<BoardListDto> list =  boardDao.seleListByPage(vo);
	model.addAttribute("list", list);
	
		return "/WEB-INF/views/board/list2.jsp";
	}
	
	//삭제
	//-만약 소유자 검사를 추가한다면
	//-현재 로그인 한 사용자와 게시글 작성자가 같다면 소유자로 판정
	@RequestMapping("/delete")
	public String delete(@RequestParam int boardNo, HttpSession session) {
		BoardDto boardDto = boardDao.selectOne(boardNo);
		String boardWriter = boardDto.getBoardWriter();
		
		String memberId = (String) session.getAttribute("name");
		
		if(memberId.equals(boardWriter)) { //소유자라면
			boardDao.delete(boardNo);
			return "redirect:list";
		}
		else {
			//return "redirect:에러페이지";
			throw new AuthorityException("없는 게시글 번호");
		}
	}

	
	//수정
	@GetMapping("/edit")
	public String edit(@RequestParam int boardNo, Model model, HttpSession session){
		String memberId = (String) session.getAttribute("name");
//		BoardDto findDto = boardDao.selectOne(boardNo);
		BoardDto boardDto = boardDao.selectOne(boardNo);
		if(boardDto.getBoardWriter().equals(memberId)) {
//			model.addAttribute("findDto", findDto);
			model.addAttribute("boardDto", boardDto);
			return "/WEB-INF/views/board/edit.jsp";
		}		
		else {
			throw new AuthorityException();
		}
	}
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute BoardDto boardDto, HttpSession session) {
		String memberId = (String) session.getAttribute("name");
		BoardDto findDto = boardDao.selectOne(boardDto.getBoardNo());
		if(findDto.getBoardWriter().equals(memberId)) {
		boolean result = boardDao.update(boardDto);
		if(result) {
			return "redirect:detail?boardNo=" + boardDto.getBoardNo();
		}
		else {
			return "redirect:에러페이지";
		}
		}
		else {
			throw new AuthorityException();
		}
	}
	
	//관리자가 이용하는 선택삭제 기능
	@PostMapping("/deleteByAdmin")
	public String deleteByAdmin(@RequestParam List<Integer> boardNoList) {
		for(int boardNo : boardNoList) {
			boardDao.delete(boardNo);
		}
		return "redirect:list";
	}
	
}
