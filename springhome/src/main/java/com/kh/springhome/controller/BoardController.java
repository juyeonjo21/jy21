package com.kh.springhome.controller;

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
import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.error.AuthorityException;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardDao boardDao;
	
	@GetMapping("/write")
	public String write() {
		return "/WEB-INF/views/board/write.jsp";
	}
	@PostMapping("/write")
	public String write(@ModelAttribute BoardDto boardDto, HttpSession session) {
		String boardWriter = (String) session.getAttribute("name");
		int boardNo = boardDao.sequence();//번호를 구해서
		boardDto.setBoardNo(boardNo);//dto에 추가하고
		boardDto.setBoardWriter(boardWriter);//보드 작성자 넣고
		boardDao.insert(boardDto); //등록
		 return "redirect:detail?boardNo="+boardNo;
	}
	@RequestMapping("/detail")
	public String detail(@RequestParam int boardNo, Model model) {
		boardDao.updateReadcount(boardNo); //조회수 증가
		BoardDto boardDto = boardDao.selectOne(boardNo);
		model.addAttribute("boardDto", boardDto);
		return "/WEB-INF/views/board/detail.jsp";
	}
	@RequestMapping("/list")
	public String list(Model model) {
		List<BoardDto> list = boardDao.selectList();
		model.addAttribute("list", list);
		return "/WEB-INF/views/board/list.jsp";
}
	@RequestMapping("/delete")
	public String delete(@RequestParam int boardNo) {
		boolean result = boardDao.delete(boardNo);
		if(result) {
			return "redirect:list";
		}
		else {
			return "redirect:에러페이지";
		}
	}
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
