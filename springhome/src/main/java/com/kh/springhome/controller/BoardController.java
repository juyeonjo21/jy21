package com.kh.springhome.controller;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

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
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.error.AuthorityException;
import com.kh.springhome.error.NoTargetException;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardDao boardDao;
	
	@Autowired
	private MemberDao memberDao;
	
	//작성
	@GetMapping("/write")
	public String write() {
		return "/WEB-INF/views/board/write.jsp";
	}
	@PostMapping("/write")
	public String write(@ModelAttribute BoardDto boardDto, HttpSession session) {
//		String boardWriter = (String) session.getAttribute("name");
		int boardNo = boardDao.sequence();//번호를 구해서
		boardDto.setBoardNo(boardNo);//dto에 추가하고
		
		String memberId = (String) session.getAttribute("name");//id부르고
		boardDto.setBoardWriter(memberId);
		
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
	public String detail(@RequestParam int boardNo, Model model) {
		boardDao.updateReadcount(boardNo); //조회수 증가
		
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
	@RequestMapping("/list")
	public String list(Model model,
			@RequestParam(required = false) String type,
			@RequestParam(required = false) String keyword) {
		boolean isSearch = type != null && keyword != null; //type과 keyword가 둘 다 있어야하니 null이 아니면 true
		
		if(isSearch) { //검색일 경우
			List<BoardDto> list = boardDao.selectList(type,keyword);
			model.addAttribute("list",list);
			model.addAttribute("isSearch", true);
		}
		else { //목록일 경우
		List<BoardDto> list = boardDao.selectList();
		model.addAttribute("list", list);
		model.addAttribute("isSearch", false);
//		model.addAttribute("list",boardDao.selectList());
		}
		return "/WEB-INF/views/board/list.jsp";
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
}
