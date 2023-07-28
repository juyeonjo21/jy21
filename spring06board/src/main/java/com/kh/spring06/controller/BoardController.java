package com.kh.spring06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring06.dao.BoardDao;
import com.kh.spring06.dto.BoardDto;

@RestController
public class BoardController {
	
	@Autowired
	private BoardDao dao;
	
	@RequestMapping("/insert")
	public String insert(
			@ModelAttribute BoardDto dto) {
		dao.insert(dto);
		return "게시글 등록 완료!";
	}
	@RequestMapping("/update")
	public String update(@ModelAttribute BoardDto dto) {
		boolean result = dao.update(dto);
		
		//if(dao.update(dto))
		if(result) {
			return "게시글 정보 변경 완료";
		}
		else {
			return "게시글이 존재하지 않습니다";
		}
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam int no) {
		boolean result = dao.delete(no);
		
		if(result) {
			return "게시글 삭제완료";
		}
		else {
			return "존재하지 않는 게시글";
		}
	}
	
	@RequestMapping("/list")
	public String list() {
		List<BoardDto> list = dao.selectList();
		StringBuffer buffer = new StringBuffer();//safe
		//StringBuilder builder = new StringBuilder(); //non-safe
		for(BoardDto dto : list) {
			buffer.append(dto);
			buffer.append(dto.getNo());
			buffer.append(dto.getTitle());
			buffer.append(dto.getWriter());
			buffer.append("<br>");
		}
		return buffer.toString();
	}
	@RequestMapping("/detail")
	public String detail(@RequestParam int no) {
		BoardDto dto = dao.selectOne(no);
	if(dto == null) {
		return "존재하지 않는 게시글";
	}
	else {
		//return dto.toString();
		StringBuffer buffer = new StringBuffer();
		buffer.append("[제목]" + dto.getTitle());
		buffer.append("(" + dto.getWriter() + ")");
		buffer.append("<br>");
		buffer.append("-------------------");
		buffer.append("<br>");
		buffer.append(dto.getContent());
		buffer.append("<br>");
		return buffer.toString();
	}
	}
}
