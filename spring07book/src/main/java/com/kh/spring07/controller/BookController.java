package com.kh.spring07.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring07.dao.BookDao;
import com.kh.spring07.dto.BookDto;

@RestController
public class BookController{

	@Autowired
	private BookDao dao;
	
	@RequestMapping("/save")
	public String save(@ModelAttribute BookDto dto) {
		dao.insert(dto);
		return "도서 정보 등록 완료!";
	}
	@RequestMapping("/edit")
	public String edit(@ModelAttribute BookDto dto) {
		boolean result = dao.update(dto);
		if(result) {
			return "도서 정보 변경 완료";
		}
		else {
			return "해당 도서가 존재하지 않습니다";
	}
}
		@RequestMapping("/delete")
		public String delete(@RequestParam int id) {
			boolean result = dao.delete(id);
			if(result) {
				return "도서 정보 삭제완료";
			}
			else {
				return "해당 도서 정보가 존재하지 않습니다";
		}
	}
	@RequestMapping("/list")
	public String list() {
		List<BookDto> list = dao.selectList();
		StringBuffer buffer = new StringBuffer();
		for(BookDto dto : list) {
			buffer.append(dto);
			buffer.append("<br>");
		}
		return buffer.toString();
	}
	@RequestMapping("/detail")
	public String detail(@RequestParam int id) {
		BookDto dto = dao.selectOne(id);
		if(dto == null) {
			return "존재하지 않는 도서입니다";
		}
		else {
			StringBuffer buffer = new StringBuffer();
			buffer.append("제목 : " + dto.getTitle());
			buffer.append("<br>");
			buffer.append("저자 : " + dto.getAuthor());
			buffer.append("<br>");
			buffer.append("가격 : " + dto.getPrice() + " $");
			return buffer.toString();
		}
	}		
}

