package jdbc2;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test03 {
		public static void main(String[] args) {
			//게시글 정보 수정 프로그램 풀이
			Scanner sc = new Scanner(System.in);

			System.out.println("수정할 번호 : ");
			int no = sc.nextInt();
			System.out.println("수정할 제목 : ");
			String title = sc.next();
			System.out.println("수정할 내용 : ");
			String content = sc.next();
	//		System.out.println("수정할 작성자명 : "); -> 작성자는 거의 바꿀 일이 없음
	//		String writer = sc.next();
			
			sc.close();

			String sql = "update board set board_title =?, board_content=? where board_no =?";
			Object[] data = {title, content, no};

			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("oracle.jdbc.OracleDriver"); 
			dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); 
			dataSource.setUsername("C##KH");
			dataSource.setPassword("KH");

			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

			jdbcTemplate.update(sql, data);

			int result = jdbcTemplate.update(sql,data);
			System.out.println("result = " + result);

			if(result > 0) {
			System.out.println("성공!");
			}
			else {
				System.out.println("실패");
			}
		}
	}

