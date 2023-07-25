package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BookDto;
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
}
