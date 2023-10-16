package com.kh.spring18;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring18.dao.SecureMemberDao;
import com.kh.spring18.dto.SecureMemberDto;

import lombok.extern.slf4j.Slf4j;

//통합테스트 - 서로 다른 환경의 두가지를 합쳐서 테스트

@Slf4j
@SpringBootTest
public class MemberJoinTest {
	
	@Autowired
	private SecureMemberDao dao;
	
	@Test
	public void test() {
		dao.insert(SecureMemberDto.builder()
				.memberId("hello1234")
				.memberPw("password1234")
				.build());
		
	}

}
