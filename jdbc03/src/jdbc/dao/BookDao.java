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
}
