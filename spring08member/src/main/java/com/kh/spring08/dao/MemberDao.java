package com.kh.spring08.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring08.dto.MemberDto;
import com.kh.spring08.mapper.MemberMapper;

@Repository
public class MemberDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private MemberMapper mapper;
	
	//등록
	public void insert(MemberDto dto) {
		String sql = "insert into member(member_id, member_pw, member_nickname,"
				+ "member_birth, member_email, member_contact, member_level,"
				+ "member_point, member_join)"
				+ "values(?,?,?,?,?,?,default,0,sysdate)";
		Object[] data = {
				dto.getId(),dto.getPw(),dto.getNick(),dto.getBirth(),dto.getEmail(),
				dto.getContact(),dto.getLevel(),dto.getPoint(),dto.getJoin()
		};
		
		jdbcTemplate.update(sql,data);
	}
	//비밀번호 변경
	//
	public boolean update(MemberDto dto) {
		String sql = "update member set member_pw=? where member_id=?";
		Object[] data = {dto.getPw()};
		return jdbcTemplate.update(sql,data) > 0;
	}
	//개인정보 변경
	public boolean updateinfo(MemberDto dto) {
		String sql = "update member set member_nickname=?,member_birth=?,"
				+ "member_contact=?,member_email=? "
				+ "where member_id=?";
		Object[] data = {dto.getNick(), dto.getBirth(),
				dto.getContact(), dto.getEmail()};
		return jdbcTemplate.update(sql,data) > 0;
	}
	
	//삭제(회원탈퇴)
	public boolean delete(String id) {
		String sql = "delete member where member_id=?";
		Object[] data = {id};
		return jdbcTemplate.update(sql,data) > 0;
	}
	//목록
	public List<MemberDto> selectlist(){
		String sql = "select * from member order by member_id asc";
		return jdbcTemplate.query(sql, mapper);
	}
	//상세
	public MemberDto selectOne(String id) {
		String sql = "select * from member where member_id=?";
		Object[] data = {id};
		List<MemberDto> list = jdbcTemplate.query(sql, mapper,data);
		return list.isEmpty() ? null : list.get(0);
	}
}
