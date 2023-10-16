package com.kh.spring16;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.dto.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test01 {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		sqlSession.insert("customer.add",CustomerDto.builder()
				.customer_id("testuser2")
				.customer_contact("010-1234-1234")
				.customer_join("2023-01-01")
				.customer_purchase("2023-10-01")
				.customer_mileage(1000)
				.customer_level("일반")
				.build());
	}

}
