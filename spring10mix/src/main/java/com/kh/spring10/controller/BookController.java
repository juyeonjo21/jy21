package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.BookDao;
import com.kh.spring10.dto.BookDto;

@Controller
@RequestMapping("/book") //공용주소
public class BookController {
	
	@Autowired
	private BookDao dao;
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int id, Model model) {
		BookDto dto = dao.selectOne(id);
		model.addAttribute("dto", dto);
		
		return "/WEB-INF/views/book/detail.jsp";
	}
	//목록
	@RequestMapping("/list")
	public String list(Model model) {
		List<BookDto> list = dao.selectList();
		model.addAttribute("list", list);
		return "/WEB-INF/views/book/list.jsp";
		
	}

}