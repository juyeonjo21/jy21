package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test04 {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		int count = sqlSession.update("book.edit", BookDto.builder()
				.bookTitle("바꾼제목")
				.bookAuthor("바꾼저자")
				.bookPrice(88.88f)
				.bookPageCount(88)
				.bookPublicationDate("2023-10-13")
				.bookPublisher("바꾼출판사")
				.bookGenre("바꿈")
				.bookId(1)
			.build());
	log.debug("count = {}", count);
	}

}
