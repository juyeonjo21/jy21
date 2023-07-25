package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BoardDto;
import jdbc.util.JdbcUtils;
//게시글을 CRUD 처리하는 도구
public class BoardDao {
	//등록 기능
/*	public void insert(String  title, String content, String writer) {

		String sql = "insert into Board(board_no, board_title, board_content, board_writer)"
				+ "values(board_seq.nextval, ?, ?, ?)";
		Object[] data = {title, content, writer};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql, data);

	}*/

	public void insert(BoardDto dto) {
		String sql = "insert into Board(board_no, board_title, board_content, board_writer)"
				+ "values(board_seq.nextval, ?, ?, ?)";
		Object[] data = {dto.getTitle(), dto.getContent(), dto.getWriter()};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql, data);
	}
	
	//수정
	public boolean update(BoardDto dto) {
		String sql = "update board set board_title=?, board_content=? where board_no=?";
		Object[] data = {
				dto.getTitle(), dto.getContent(), dto.getNo()
		};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		int result = jdbcTemplate.update(sql,data);
	
		return result >0;
		// == return jdbcTemplate.update(sql,data) > 0;
	}
	
	//게시글 삭제
	public boolean delete(int no) {
		String sql = "delete Board where board_no=?";
		Object[] data = {no};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql,data) > 0;
	}
}
