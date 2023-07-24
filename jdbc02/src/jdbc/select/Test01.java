package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.PocketmonDto;
import jdbc.mapper.PocketmonMapper;
import jdbc.util.JdbcUtils;

public class Test01 {
	public static void main(String[] args) {
		// JDBC 조회(Select)
		// - 두 가지 준비물이 필요하다
		// - 첫번쨰는 조회 결과 중 한 줄을 담을 객체(DTO)
		// - 두번쨰는 조회 결과를 DTO에 옮겨담는 방법을 가진 객체(Mapper)
		
		String sql = "select * from pocketmon order by no asc"; // 홀더 없음(준비할 데이터가 없단 소리)
		
		//Mapper 준비
		PocketmonMapper mapper = new PocketmonMapper();
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		List<PocketmonDto> list = jdbcTemplate.query(sql,mapper);
		
		System.out.println("조회 결과 : " + list.size());
		for(PocketmonDto dto : list) {
			System.out.println(dto);
		}
	}

}
