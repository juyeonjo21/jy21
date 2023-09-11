package com.kh.springhome.rest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.springhome.dao.ReplyDao;
import com.kh.springhome.dto.ReplyDto;

//@CrossOrigin
@RestController
@RequestMapping("/rest/reply")
public class ReplyRestController {
	
	@Autowired
	private ReplyDao replyDao;
	
	//댓글 등록
	//- 사용자가 입력한 내용을 특정 번호의 게시글 아래로 등록하도록 구현
	//- 사용자는 댓글내용(rpelyContent)만 작성*
	//- 작성자(replyWriter)는 세션에서 조회
	//- 작성일(repltTime)은 DB에서 sysdate로 등록
	//- 원본글번호(reply_origin)은 사용자 몰래 전송시켜야 한다*
	@PostMapping("/insert")
	public void insert(@ModelAttribute ReplyDto replyDto, HttpSession session) {
		int replyNo = replyDao.sequence();
		replyDto.setReplyNo(replyNo);
		
		String memberId = (String) session.getAttribute("name");
		replyDto.setReplyWriter(memberId);
		
		replyDao.insert(replyDto);
	}

}
