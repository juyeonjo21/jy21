package jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.BookDto;

public class BookMapper implements RowMapper<BookDto>{

	@Override
	public BookDto mapRow(ResultSet rs, int idx) throws SQLException {
		BookDto dto = new BookDto();
		dto.setId(rs.getInt("book_id"));
		dto.setTitle(rs.getString("book_title"));
		dto.setAuthor(rs.getString("book_author"));
		dto.setPublication(rs.getDate("book_publication_date"));
		dto.setPrice(rs.getDouble("book_price"));
		dto.setPublisher(rs.getString("book_publisher"));
		dto.setPageCount(rs.getInt("book_page_count"));
		dto.setGenre(rs.getString("book_genre"));
		return dto;
		
	}

}
