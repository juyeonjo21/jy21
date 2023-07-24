package jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.MemberDto;

public class MemberMapper implements RowMapper<MemberDto>{

	@Override
	public MemberDto mapRow(ResultSet rs, int idx) throws SQLException {
		MemberDto dto = new MemberDto();
		dto.setId(rs.getString("member_id"));
		dto.setPw(rs.getString("member_pw"));
		dto.setNickname(rs.getString("member_nickname"));
		dto.setBirth(rs.getString("member_birth"));
		dto.setEmail(rs.getString("member_email"));
		dto.setContact(rs.getString("member_contact"));
		dto.setLevel(rs.getString("member_level"));
		dto.setPoint(rs.getInt("member_point"));
		dto.setJoin(rs.getDate("member_join"));
		
		return dto;
	}

}
