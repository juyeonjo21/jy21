package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BoardDto;
import jdbc.mapper.BoardMapper;
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
	
	//게시글 목록 전체 출력
	private BoardMapper mapper = new BoardMapper();
	
	public List<BoardDto> selectList(){
		String sql = "select * from board order by board_no desc";
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.query(sql, mapper);
	}
	// 게시글 한페이지 당 10개씩 출력
	//(심화) 페이징 목록 조회
	public List<BoardDto> selectListByPage(int page) {
		int end = page * 10;
		int begin = end - 9;
		
		String sql = "select * from ("
				+ "select rownum rn, TMP.* from("
						+ "select * from board oder by board_no DESC" 
						+	")TMP"
						+") where rn between 1 and 10 ";
		Object[] data = {begin, end};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.query(sql, mapper, data);
	}
	//상세 조회
	public BoardDto selectOne(int no) {
		String sql = "select * from board where board_no=?";
		Object[] data = {no};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		List<BoardDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
}
