package com.kh.spring10.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.spring10.dto.BoardDto;

@Component
public class BoardDetailMapper implements RowMapper<BoardDto> {

	@Override
	public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardDto dto = new BoardDto();
		dto.setNo(rs.getInt("board_no"));
		dto.setTitle(rs.getString("board_title"));
		dto.setContent(rs.getString("board_content"));
		dto.setWriter(rs.getString("board_writer"));
		dto.setReadcount(rs.getInt("board_readcount"));
		return dto;
	}

}
