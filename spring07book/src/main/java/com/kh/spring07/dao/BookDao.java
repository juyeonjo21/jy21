package com.kh.spring07.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring07.dto.BookDto;
import com.kh.spring07.mapper.BookMapper;

@Repository
public class BookDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BookMapper mapper;
	
	
	//등록
	public void insert(BookDto dto) {
		String sql = "insert into book(book_id, book_title, "
				+ "book_author, book_publication_date, "
				+ "book_price, book_publisher, book_page_count, "
				+ "book_genre ) "
				+ "values(book_seq.nextval,?, ?, ?, ?, ?, ?, ?)";
		Object[] data = {dto.getTitle(), dto.getAuthor(),
				dto.getDate(),dto.getPrice(), dto.getPublisher(),
				dto.getPageCount(),dto.getGenre()};
		
		jdbcTemplate.update(sql,data);
	}
	//변경
	public boolean update(BookDto dto) {
		String sql = "update book set book_title=?, book_author=?,book_price=?"
				+ " where book_id=?";
		Object[] data = {
				dto.getTitle(),dto.getAuthor(),dto.getPrice(),dto.getId()
		};
		return jdbcTemplate.update(sql,data) > 0;
	}
	//삭제
	public boolean delete(int id) {
		String sql = "delete book where book_id=?";
		Object[] data = {id};
		return jdbcTemplate.update(sql,data) > 0;
	}
	//목록
	public List<BookDto> selectList(){
		String sql = "select * from book order by book_id asc";
		return jdbcTemplate.query(sql,mapper);
	}
	//상세
	public BookDto selectOne(int id) {
		String sql = "select * from book where book_id=?";
		Object[] data = {id};
		List<BookDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}

}
