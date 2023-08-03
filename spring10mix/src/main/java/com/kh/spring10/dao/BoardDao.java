package com.kh.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.dto.BoardDto;
import com.kh.spring10.mapper.BoardDetailMapper;
import com.kh.spring10.mapper.BoardListMapper;

@Repository
public class BoardDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BoardDetailMapper detailmapper;
	
	@Autowired
	private BoardListMapper listMapper;

	//등록과 번호 생성 가능
	//select board_seq.nextval from dual
	//insert into board(...)values(?,?,?,?,0)
	public int sequence() {
		String sql = "select board_seq.nextval from dual";
		return jdbcTemplate.queryForObject(sql,int.class);
	//return jdbcTemplate.queryForObject(sql,integer.class);
	}
	
	public void insert(BoardDto dto) {
		String sql = "insert into board("
				+ "board_no, board_title, board_content,"
				+ "board_writer, board_readcount"
				+ ") values(?,?,?,?,0)";
		Object[] data = {
			dto.getNo(), dto.getTitle(), dto.getContent(),
			dto.getWriter()
		};
		jdbcTemplate.update(sql,data);
	}
	
	
	
	public boolean update(BoardDto dto) {
		String sql = "update board "
				+ "set board_title=?, board_content=?"
				+ "where board_no=?";
		Object[] data = {
				dto.getTitle(), dto.getContent(), dto.getNo()
		};
		return jdbcTemplate.update(sql,data) > 0;
	}
	public boolean delete(int no) {
		String sql = "delete board where board_no=?";
		Object[] data = {no};
		return jdbcTemplate.update(sql,data) > 0;
	}
	public List<BoardDto> selectList(){
		String sql = "select "
				+ "board_no, board_title, "
				+ "board_writer, board_readcount "
				+ "from "
				+ "board order by board_no desc";
		return jdbcTemplate.query(sql, listMapper);
	}
	public BoardDto selectOne(int no) {
		String sql = "select * from board where board_no=?";
		Object[] data = {no};
		List<BoardDto> list = jdbcTemplate.query(sql, detailmapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
}
