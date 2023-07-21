package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test06 {
	public static void main(String[] args) {
		//[Q] book 테이블에 사용자가 입력한 도서 정보가 등록될 수 있도록 프로그래밍하세요
		Scanner sc = new Scanner(System.in);
		
		//데이터 - bookId는 준비하지 않는다 (시퀀스 활용)
		System.out.println("책 제목 : ");
		String title = sc.next();
		
		System.out.println("작가 : ");
		String author = sc.next();
		
		System.out.println("책 출간일 : ");
		String date = sc.next();
		
		System.out.println("책 가격 : ");
		double price = sc.nextDouble();
		
		System.out.println("출판사 : ");
		String bookPublisher = sc.next();
		
		System.out.println("페이지 수 : ");
		int pageCount = sc.nextInt();
		
		System.out.println("장르 : ");
		String genre = sc.next();
		
		sc.close();
		
		//DB처리
		String sql = "insert into book( book_id, book_title, book_author,"
				+ "book_publication_date, book_price, book_publisher, book_page_count, book_genre)"
				+ " values(book_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		
		Object[] data = {title, author, date, price, bookPublisher, pageCount, genre};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver"); 
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); 
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, data);
		
		System.out.println("도서 정보가 등록되었습니다.");
	}

}
