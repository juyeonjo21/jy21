package com.kh.spring10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

}
