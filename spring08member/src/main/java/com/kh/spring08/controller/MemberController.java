package com.kh.spring08.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring08.dao.MemberDao;
import com.kh.spring08.dto.MemberDto;

@RestController
@RequestMapping("/member") //공용주소
public class MemberController {
	@Autowired
	private MemberDao dao;

	//등록
	@RequestMapping("/join")
	public String join(@ModelAttribute MemberDto dto) {
		return "회원 정보 등록 완료!";
	}
	//목록
	//테스트주소 http://localhost:8080/member/list
	@RequestMapping("/list")
	public String list() {
		List<MemberDto> list = dao.selectlist();
		StringBuffer buffer = new StringBuffer();
		for(MemberDto dto : list) {
			buffer.append(dto.getId());
			buffer.append("[");
			buffer.append(dto.getLevel());
			buffer.append("]");
		}
		return buffer.toString();
	}
	//상세
//	테스트주소 http://localhost:8080/member/detail?id=testuser
	@RequestMapping("/detail")
	public String detail(@RequestParam String id) {
		MemberDto dto = dao.selectOne(id);
		if(dto == null) {
			return "존재하지 않는 회원입니다";
		}
		else {
			StringBuffer buffer = new StringBuffer();
			buffer.append("아이디 : " + dto.getId());
			return buffer.toString();
		}
	}
	//비밀번호 변경
	//비밀번호를 변경할 때는 아이디, 바꿀 비밀번호만 있으면 된다
	//하지만, 여러가지 확인을 위해 추가정보를 요구할 수도 있다
	//(ex) 기존비밀번호(o),비밀번호확인(x)
	@RequestMapping("/password")
	public String password(@RequestParam String id,
							@RequestParam String memberpw,
							@RequestParam String changepw) {
		//일단 아이디로 DB의 회원정보를 불러온다
		MemberDto originDto = dao.selectOne(id);
		if(originDto.getPw().equals(memberpw)) {
		MemberDto changeDto = new MemberDto();
		changeDto.setId(id);
		changeDto.setPw(changepw);
		
		boolean result = dao.update(changeDto);
		if(result) {
			return "변경 완료";
		}
		else {
			return "존재하지 않는 회원";
		}
		}
		else {
			return "비밀번호가 일치하지 않습니다";
		}	
	}
	
	//개인정보 변경 시 비밀번호를 추가로 전달받아 검사 후 변경
	@RequestMapping("/change")
	public String change(@ModelAttribute MemberDto changeDto) {
		//비밀번호 검사를 위한 원 정보 조회
		MemberDto originDto = dao.selectOne(changeDto.getId());
		if(originDto == null) {
			return "아이디 없음";
		}
		if(originDto.getPw().equals(changeDto.getPw())==false) {
			return "비밀번호 불일치";
		}
		//다 통과한 경우
		dao.updateinfo(changeDto);
			return "변경 완료";
		}
	
	//회원은 탈퇴시에도 비밀번호를 검사해야 한다
	@RequestMapping("/exit")
	public String exit(@RequestAttribute MemberDto inputDto) {
		MemberDto originDto = dao.selectOne(inputDto.getId());
		if(originDto == null) {
			return "아이디 없음";
		}
		if(originDto.getPw().equals(inputDto.getPw())==false) {
			return "비밀번호 불일치";
		}
		dao.delete(inputDto.getId());
		return "안녕히가세요";
	}
}
