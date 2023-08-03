package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.BoardDao;
import com.kh.spring10.dto.BoardDto;

@Controller
@RequestMapping("/board") //공용주소
public class BoardController {
	
	@Autowired
	private BoardDao dao;
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int no, Model model) {
		BoardDto dto = dao.selectOne(no);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/board/detail.jsp";
	}
	//목록
	@RequestMapping("/list")
	public String list(Model model) {
		List<BoardDto> list = dao.selectList();
		model.addAttribute("list", list);
		return "/WEB-INF/views/board/list.jsp";
	}
	//등록
	@RequestMapping("/write")
	public String write() {
		return "/WEB-INF/views/board/write.jsp";
	}
	@PostMapping("/write")
	public String write(@ModelAttribute BoardDto dto) {
		int no = dao.sequence();//번호를 구해서
		dto.setNo(no);//dto에 추가하고
		dao.insert(dto); //등록
		
		//방금 등록한 번호의 게시글 상세 페이지로 강제 이동!(redirect)
		return "redirect:detail?no=" + no;
	}
	//수정
	@GetMapping("/edit")
	public String edit(@RequestParam int no, Model model) {
		BoardDto dto = dao.selectOne(no);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/board/edit.jsp";
	}
	@PostMapping("/edit")
	public String edit(@ModelAttribute BoardDto dto) {
		boolean result = dao.update(dto);
		if(result) {
			return "redirect:detail?no=" + dto.getNo();
		}
		else {
			return "redirect:에러페이지";
		}
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam int no) {
		boolean result = dao.delete(no);
		if(result) {
			return "redirect:list";
		}
		else {
			return "redirect:에러페이지";
		}
	}
	//경로변수(Path Variable)매핑 처리
	//-경로 중간에 변수로 사용할 영역을 지정하는 방식
	//-주소를 간단하게 만들기 위해서 사용
	//-전달할 값이 많으면 안 쓰는 게 좋다
	//- @PathVariable로 처리하며 [경로의 끝지점(endpoint)이 달라진다]
	@RequestMapping("/delete/{no}")
	public String delete2(@PathVariable int no) {
		boolean result = dao.delete(no);
		if(result) {
			return "redirect:/board/list";
		}
		else {
			return "redirect:에러페이지";
		}
	}
}
