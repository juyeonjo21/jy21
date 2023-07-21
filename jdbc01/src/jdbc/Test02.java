package jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test02 {
	public static void main(String[] args) {
		//JDBC(Java DataBase Connectivity)
		// = 자바를 이용해서 데이터베이스 작업을 하는 것
		// = 데이터베이스 구문을 프로그램에 작성하여 처리하도록 중계
		
		//(ex) 포켓몬스터 테이블에 데이터를 등록하는 작업
		
		//[1] 구문을 세미콜론 제외하고 준비
		String sql = "insert into pocketmon(no, name, type)" 
													+ "values(43, '뚜벅초','풀')";
		
		// 실제로 연결해서 보내는 작업
		//[2] 연결 도구 생성 및 연결에 필요한 정보를 설정
		DriverManagerDataSource dataSource = new DriverManagerDataSource(); //연결도구
		dataSource.setUsername("C##KH"); //계정정보
		dataSource.setPassword("KH"); //비번정보
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver"); //드라이버파일 정보(db정보)
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); //연결
		
		//[3] 구문 전송 도구 생성 및 전송
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource); //얘만 해주면 알아서 끌어다 뽑아냄
		jdbcTemplate.update(sql);
		
		System.out.println("임무완료");
		
		
		
		
	}
}
