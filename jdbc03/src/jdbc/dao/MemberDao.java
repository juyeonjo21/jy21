package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.MemberDto;
import jdbc.util.JdbcUtils;

public class MemberDao {
	
	public void insert(MemberDto dto) {
		String sql = "insert into Member(member_id, member_pw, member_nickname, member_birth,"
				+ "member_email, member_contact)"
				+" values(?, ?, ?, ?, ?, ?)";
		Object[] data = { dto.getId(), dto.getPw(), dto.getNickname(), dto.getBirth(), dto.getEmail(),
				dto.getContact()};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql,data);
	}
	
	//비밀번호 변경 기능
	// 1 기존비번과 신규비번을 입력받아 검사 후 변경
	// 2 임시비번 변경하는 기능
	// 3 아이디에 맞는 계정의 비번을 변경하는 기능
// 	[1]public boolean updateMemberPassword(MemberDto dto, String newPw) {
//		[2]public boolean updateMemberPassword(String memberId) {
//		[3]public boolean updateMemberPassword(String memberId, String memberPw) {
	
	public boolean updateMemberPassword(MemberDto dto) {
		String sql = "update member set member_pw=? where member_id=?";
		Object[] data = {dto.getPw(), dto.getId()};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		int result = jdbcTemplate.update(sql,data);
		
		return result > 0;
	}
	//회원정보 변경
	public boolean updateMemberInfo(MemberDto dto) {
		String sql = "update member set  member_nickname=?, member_contact=?,"
				+ " member_birth=?, member_email=? where member_id=?";
		Object[] data = {
				dto.getNickname(), dto.getContact(), dto.getBirth(), dto.getEmail(), dto.getId()
		};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		int result = jdbcTemplate.update(sql,data);
		
		return result > 0;
	}
	//회원 탈퇴
	public boolean delete(String id) {
		String sql = "delete Member where member_id=?";
		Object[] data = {id};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql,data) > 0;
		
	}
}
