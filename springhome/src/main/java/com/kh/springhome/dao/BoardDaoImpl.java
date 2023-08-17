package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.mapper.BoardMapper;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BoardMapper mapper;
	
	@Autowired
	private BoardMapper listMapper;
	
	//시퀀스생성
	public int sequence() {
		String sql = "select board_seq.nextval from dual";
		return jdbcTemplate.queryForObject(sql,int.class);
	}
	
	//등록
	@Override
	public void insert(BoardDto boardDto) {
		String sql = "insert into board(board_no, board_title, board_content, board_writer) "
				+ "values(?,?,?,?)";
		Object[] data = {
				boardDto.getBoardNo(), boardDto.getBoardTitle(), boardDto.getBoardContent(),
				boardDto.getBoardWriter()
		};
		jdbcTemplate.update(sql, data);
}

	@Override
	public BoardDto selectOne(int boardNo) {
		String sql = "select * from board where board_no=?";
		Object[] data = {boardNo};
		List<BoardDto> list = jdbcTemplate.query(sql, mapper, data);
		
		return list.isEmpty() ? null : list.get(0);
	}

	@Override
	public List<BoardDto> selectList() {
//		String sql = "select * from board order by board_no desc";
		String sql = "select "
				+ "board_no, board_writer,"
				+ "board_title, board_content,"
				+ "board_readcount, board_likecount, board_replycount,"
				+ "board_utime, board_ctime "
				+ "from board order by board_no desc";
		return jdbcTemplate.query(sql, listMapper);
	}

	@Override
	public boolean delete(int boardNo) {
		String sql = "delete board where board_no=?";
		Object[] data = {boardNo};
		return jdbcTemplate.update(sql, data) >0;
	}
	//수정
	@Override
	public boolean update(BoardDto boardDto) {
		String sql = "update board set board_title=?, board_content=?,"
				+ "board_utime=sysdate where board_no=?";
		Object[] data = {boardDto.getBoardTitle(), boardDto.getBoardContent(),boardDto.getBoardNo()};
		return jdbcTemplate.update(sql, data) > 0;
	}

	@Override
	public boolean updateReadcount(int boardNo) {
		String sql = "update board set "
				+ "board_readcount = board_readcount+1 "
				+ "where board_no=?";
		Object[] data = {boardNo};
		return jdbcTemplate.update(sql, data) > 0;
	}

	@Override
	public Integer selectMax(String boardWriter) {
		String sql = "select max(board_no) from board "
				+ "where board_writer =?";
		Object[] data = {boardWriter};
		return jdbcTemplate.queryForObject(sql, Integer.class, data);
	}

	//검색창 생성
	@Override
	public List<BoardDto> selectList(String type, String keyword) {
		//한방에 처리하는 구문(추천)
		String sql = "select * from board "
				+ "where instr("+type+",?) > 0 " 
				+ "order by board_no desc"; 
	
			Object[] data = {keyword};
			return jdbcTemplate.query(sql, listMapper, data);
	}
//		String sql = "select * from board "
//				+ "where instr(board_writer,?) > 0 " //type을 지정하느냐 홀더로 쓰느냐 구분해서 쓰는 구문
//				+ "order by board_no desc";
		//그냥 확실하게 if문으로(비추천-갯수만큼 써줘야 함)
//		String sql;
//		if(type.equals("board_title")) { //type이 제목인 경우
//			sql = "select * from board "
//					+ "where instr(board_title,?) > 0 " 
//					+ "order by board_no desc"; 
//		}
//		else { //type이 작성자인 경우
//			sql = "select * from board "
//					+ "where instr(board_writer,?) > 0 " 
//					+ "order by board_no desc"; 
//		}
//		Object[] data = {keyword};
//		return jdbcTemplate.query(sql, listMapper, data);
//	}
	
	}
