package jdbc2;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test02 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			
			System.out.println("수정할 번호 : ");
			int bookId = sc.nextInt();
			System.out.println("수정할 제목 : ");
			String title = sc.next();

			System.out.println("수정할 가격 : ");
			double price = sc.nextDouble();

			sc.close();
			//DB 처리 - 자바는 자동 commit 모드를 사용한다
			String sql = "update book set book_title =?, book_price=? where book_id =?";
			Object[] data = {title, price, bookId};

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

