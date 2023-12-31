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
	//등록
	@GetMapping("/insert")
	public String insert() {
		return "/WEB-INF/views/book/insert.jsp";
	}
	@PostMapping("/insert")
	public String insert(@ModelAttribute BookDto dto) {
		dao.insert(dto);
		return "redirect:/book/list";
	}
	@GetMapping("/edit")
	public String edit(@RequestParam int id, Model model) {
		BookDto dto = dao.selectOne(id);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/book/edit.jsp";
	}
	@PostMapping("/edit")
	public String edit(@ModelAttribute BookDto dto) {
		boolean result = dao.update(dto);
		if(result) {
			return "redirect:detail?id=" + dto.getId();
		}
		else {
			return "redirect:에러페이지";
		}
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam int id) {
		boolean result = dao.delete(id);
		if(result) {
			return "redirect:list";
		}
		else {
			return "redirect:에러페이지";
		}
	}
	@RequestMapping("/delete/{id}")
	public String delete2(@PathVariable int id) {
		boolean result = dao.delete(id);
		if(result) {
			return "redirect:/book/list";
		}
		else {
			return "redirect:에러페이지";
		}
	}
}

