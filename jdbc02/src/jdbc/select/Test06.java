package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.MemberDto;
import jdbc.mapper.MemberMapper;
import jdbc.util.JdbcUtils;

public class Test06 {
	public static void main(String[] args) {
		// Member 로그인 프로그램
		// = SQL 구문 : select * from member where member_id = ? (권장)
		// = SQL 구문 : select * from member where member_id = ? member_pw = ? (비추천)
		// = Primary Key로 항목을 조회하는 것을 '단일조회'라고 한다
		// = 모든 테이블은 단일 조회가 가능해야한다
		// = 단일 조회는 결과가 없거나 한 개이다 -> MemberDto / 여러개 -> List<MemberDto>
		
		//데이터
		String id = "testuser1";
		String pw = "Test1234!";
		
		//DB처리
		String sql = "select * from member where member_id = ?";
		Object[] data = {id};
		MemberMapper mapper = new MemberMapper();
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		List<MemberDto> list = jdbcTemplate.query(sql, mapper, data);
		//list.size() == 0 or 1
		
//		MemberDto dto;
//		if(list.isEmpty()) {
//			dto = null; 
//		}
//		else {
//			dto = list.get(0); // 맨 앞에 있는 거 꺼내라
//		}
		MemberDto dto = list.isEmpty() ? null : list.get(0); // 3항 연산사(if문 축소) 위랑 똑같음
//		System.out.println(dto);
		
//		boolean isLogin = dto가 null이 아니면서 dto의 비밀번호와 사용자 비밀번호가 일치하는가?
		boolean isLogin = dto != null && dto.getPw().equals(pw);
		System.out.println(isLogin);
		
	}

}
