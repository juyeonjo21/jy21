package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test01 {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
//		BookDto dto = new BookDto();
//		dto.setBook_title("소나기");
//		dto.setBook_author("황순원");
//		dto.setBook_publication_date("1953-01-01");
//		dto.setBook_price(12.11);
//		dto.setBook_publisher("신문학");
//		dto.setBook_page_count(320);
//		dto.setBook_genre("단편소설");
//		sqlSession.insert("book.add",dto);
//		log.debug("dto = {}", dto);
		sqlSession.insert("book.save", BookDto.builder()
				.bookTitle("테스트서적")
				.bookAuthor("테스트저자")
				.bookPublicationDate("2023-10-12")
				.bookPrice(99.99f)
				.bookPublisher("테스트출판사")
				.bookPageCount(99)
				.bookGenre("교양")
				.build());
	}

}
