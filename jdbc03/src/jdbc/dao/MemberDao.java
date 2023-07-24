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

}
