package api.lang.string2;

import java.util.Scanner;

public class Test07_1 {
	public static void main(String[] args) {
		//회원가입 프로그램
		//'Member'라는 클래스를 만들고 다음 정보를 보관할 수 있도록 구현합니다.
		//[1] 회원아이디(memberId) - 8~20자 알파벳+숫자로 구성
		//[2] 비밀번호(memberPw) - 8~15자 알파벳+숫자+특수문자 반드시 포함
		//[3]회원등급(memberLevel) - 관리자 / 우수회원 / 일반회원 중 하나로 설정, '기본값-일반회원'
		//[4] 회원포인트(memberPoint)- 최초 100점을 부여, 0이상만 가능
		
		Scanner sc = new Scanner(System.in);

		System.out.println("아이디 입력 : ");
		String memberId = sc.next();
		System.out.println("비밀번호 입력 : ");
		String memberPw = sc.next();
		System.out.println("이름 입력 : ");
		String memberName = sc.next();

		sc.close();

		Member01 a = new Member01 (memberId, memberPw, memberName);
	

		a.show();

	}

}
