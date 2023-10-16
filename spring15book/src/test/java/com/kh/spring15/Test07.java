package com.kh.spring15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test07 {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		Map<String, Object> param = new HashMap<>();
//		param.put("bookId", 1);
//		param.put("bookTitle", "테스트2");
//		param.put("bookAuthor", "테스트2");
//		param.put("bookPublisher", "테스트작가2");
//		param.put("bookPriceMin", "10");
//		param.put("bookPriceMax", "1000");
//		param.put("bookPublicationBegin", "2023-01-01");
//		param.put("bookPublicationEnd", "2023-12-31");
//		param.put("bookPageMin", 100);
//		param.put("bookPageMax", 400);
//		param.put("bookGenre", "판타지");//장르가 한개였다면..(x)
//		param.put("bookGenreList", List.of("판타지","공포","코미디")); //장르가 여러개라면..(o)
//		param.put("bookGenreList", List.of("판타지"));
//		param.put("bookGenreList", List.of("판타지","공포"));
		
//		param.put("orderList", List.of("book_id asc"));//번호순
//		param.put("orderList", List.of("book_publication_date desc","book_id asc"));//최근 출간순
		
//		param.put("begin", 1);
//		param.put("end", 10);
		
		List<BookDto> list = sqlSession.selectList("book.complexSearch", param);
		log.debug("검색 결과 = {}개", list.size());
		for(BookDto dto:list) {
		log.debug("dto = {}", dto);
	}
	}
}
