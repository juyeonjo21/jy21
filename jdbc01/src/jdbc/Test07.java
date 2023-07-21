package jdbc;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test07 {
	public static void main(String[] args) {

		String title = "테스트";
		String content = "테테스스트트";
		String writer = "testuser111";

		
		String sql = "insert into board(board_no, board_title, board_content,"
				+ "board_writer, board_readcount)"
				+ "values(board_seq.nextval, ?, ?, ?, 0)"; //default 굳이 안 쓰고 0 쓰면 됨
		
		Object[] data = {title, content, writer};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver"); 
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); 
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, data);
		
		System.out.println("게시판에 새 글이 등록되었습니다.");
	}

}
