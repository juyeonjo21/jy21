package jdbc.select;

public class Test06_1 {
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
//		MemberHelper helper = new MemberHelper();
//		boolean result = helper.login(id,pw);
//		System.out.println("로그인 결과 = " + result);
		
	}

}
