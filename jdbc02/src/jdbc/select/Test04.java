package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BookDto;
import jdbc.mapper.BookMapper;
import jdbc.util.JdbcUtils;

public class Test04 {
	public static void main(String[] args) {
		
		String sql = "select * from book order by book_id asc";
		
		BookMapper mapper = new BookMapper();
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		List<BookDto> list = jdbcTemplate.query(sql, mapper); //만약 데이터가 있다면 세번째에 넣음 됨
		
/*		if(list.isEmpty()) {
			System.out.println("해당 책이 존재하지 않습니다");
		}
		else { */
		
		System.out.println("조회 결과 수 : " + list.size());
		for(BookDto dto : list) {
			System.out.println(dto);
	}
	}
}
