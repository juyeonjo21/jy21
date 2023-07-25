package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BookDto;
import jdbc.mapper.BookMapper;
import jdbc.util.JdbcUtils;

public class BookDao {

	public void insert(BookDto dto) {
		String sql = "insert into book(book_id, book_title, book_author, book_publication_date, "
				+ "book_price, book_publisher, book_page_count, book_genre)"
				+ "values(book_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		Object[] data = {dto.getTitle(), dto.getAuthor(), dto.getPublication(), dto.getPrice(),
				dto.getPublisher(), dto.getPageCount(), dto.getGenre()};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql,data);
	}
	
	//가격수정
	public boolean updateBookPrice(BookDto dto) {
		String sql = "update book set book_price=? where book_id=?";
		Object[] data = {dto.getPrice(), dto.getId()};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		int result = jdbcTemplate.update(sql,data);
		
		return result>0;
	}
	//나머지 정보 수정(제목,저자,출판사)
	public boolean updateBookInfo(BookDto dto) {
		String sql = "update book set book_title=?, book_author=?, book_publisher=? where book_id=?";
		Object[] data = {
				dto.getTitle(), dto.getAuthor(), dto.getPublisher(), dto.getId()
		};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		int result = jdbcTemplate.update(sql,data);
		
		return result >0;
	}
	//도서 삭제
	public boolean delete(int id) {
		String sql = "delete book where book_id=?";
		Object[] data = {id};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql,data) > 0;
	}
	
	//도서 목록 전체 조회
	private BookMapper mapper = new BookMapper();
	
	public List<BookDto> selectList(){
		String sql = "select * from book order by book_id asc";
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.query(sql, mapper);
	}
}
