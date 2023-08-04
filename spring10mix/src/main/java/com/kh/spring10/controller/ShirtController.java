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

import com.kh.spring10.dao.ShirtDao;
import com.kh.spring10.dto.ShirtDto;

@Controller
@RequestMapping("/shirt")
public class ShirtController {

	@Autowired
	private ShirtDao dao;
	
	//등록
	@RequestMapping("/add")
	public String add() {
		return "/WEB-INF/views/shirt/add.jsp";
	}
	@PostMapping("/add")
	public String add(@ModelAttribute ShirtDto dto) {
		int shirtNo = dao.sequence(); //번호 구하고
		dto.setShirtNo(shirtNo); //dto에 추가
		dao.insert(dto); //등록
		
		return "redirect:detail?shirtNo=" + shirtNo;
	}
	
	//조회(목록)
	@RequestMapping("/list")
	public String list(Model model) {
		List<ShirtDto> list = dao.selectList();
		model.addAttribute("list", list);
		return "/WEB-INF/views/shirt/list.jsp";
	}
	
	//상세조회
	@RequestMapping("/detail")
	public String detail(@RequestParam int shirtNo, Model model) {
		ShirtDto dto = dao.selectOne(shirtNo);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/shirt/detail.jsp";
	}
	
	//변경
	@GetMapping("/edit")
	public String edit(@RequestParam int shirtNo, Model model) {
		ShirtDto dto = dao.selectOne(shirtNo);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/shirt/edit.jsp";
	}
	@PostMapping("/edit")
	public String edit(@ModelAttribute ShirtDto dto) {
		boolean result = dao.update(dto);
		if(result) {
			return "redirect:detail?shirtNo=" + dto.getShirtNo();
		}
		else {
			return "redirect:에러페이지";
		}
	}
	//삭제
	@RequestMapping("/delete")
	public String delete(@RequestParam int shirtNo) {
		boolean result = dao.delete(shirtNo);
		if(result) {
			return "redirect:list";
		}
		else {
			return "redirect:에러페이지";
		}
	}
	@RequestMapping("/delete/{shirtNo}")
	public String delete2(@PathVariable int shirtNo) {
		boolean result = dao.delete(shirtNo);
		if(result) {
			return "redirect:/board/list";
		}
		else {
			return "redirect:에러페이지";
		}
	}
}
