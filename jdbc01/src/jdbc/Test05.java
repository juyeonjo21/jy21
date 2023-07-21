package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05 {
	public static void main(String[] args) {
		//[Q] 'Account' 테이블에 사용자가 입력한 정보가 등록될 수 있도록 프로그래밍 하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("예금주 :  ");
		String owner = sc.next();
		System.out.println("납입기간(년) : ");
		int period = sc.nextInt();
		//int count = period*12 + 1;
		int count = 0;
		System.out.println("월 납입금액 : ");
		int payment = sc.nextInt();
		long balance = 0L;
		
		sc.close();

		//DB처리
		String sql = "insert into account(account_owner, account_period, account_count,"
				+ "account_payment,account_balance) values(?, ?, ?, ?, ?)";
		
		Object[] data = {owner, period, count, payment, balance};
		
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver"); //DB종류
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); //DB위치 + 연결방식
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, data);
		
		System.out.println("계좌가 개설되었습니다.");

		
	}

}
