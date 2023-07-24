package jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.BoardDto;

public class BoardMapper implements RowMapper<BoardDto> {

	@Override
	public BoardDto mapRow(ResultSet rs, int idx) throws SQLException {
		BoardDto dto = new BoardDto();
		dto.setNo(rs.getInt("board_no"));
		dto.setTitle(rs.getString("board_title"));
		dto.setContent(rs.getString("board_content"));
		dto.setWriter(rs.getString("board_writer"));
		dto.setReadcount(rs.getInt("board_readcount"));
		return dto;
	}

}
