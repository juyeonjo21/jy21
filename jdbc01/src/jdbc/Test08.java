package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test08 {
	public static void main(String[] args) {
		//회원가입 프로그램 문제
		
		// 데이터 - 6개(아이디,비밀번호,닉네임,생년월일,이메일,연락처)
		//(Tip) 오라클에 추가하는 문자열은 null이든 ""이든 모두 null로 추가됨
		String id = "testuser1";
		String pw = "Test1234!";
		String nickName = "테스트유저";
		String birth = "1995-03-01";
		String email = "";
		String contact = "01012341234";

	

		String sql = "insert into member(member_id, member_pw, member_nickname,"
				+ "member_birth, member_email, member_contact, member_level, member_point, member_join) "
				+ "values(?, ?, ?, ?, ?, ?, default, 0, default)";
		
		Object[] data = {id, pw, nickName, birth, email, contact};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver"); 
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); 
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, data);
		
		System.out.println("회원 정보가 입력되었습니다.");
	}

}
