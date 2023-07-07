package api.lang.string;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//[Q] 문자열 문제 과제
		//사용자에게 프로그램 내에서 사용할 닉네임을 입력받도록 구현
		//단, 다음과 같은 상황일 경우 오류 메세지를 출력
		// 1. 닉네임에 2글자 이상 10글자 이하가 아닌경우
		// 2. 닉네임에 '운영자'라는 단어가 포함된 경우
		//-> 모든 검사를 통과했다면, '닉네임 설정이 완료되었습니다' 라는 메세지 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("닉네임 입력 : ");
		String nickname = sc.next();
		
		boolean a = nickname.length() >= 2 && nickname.length() <= 10;
		
		
		if(a == false) {
			System.out.println("닉네임은 2글자 이상, 10글자 이하여야 합니다.");
		}
		else if(nickname.contains("운영자")) {
			System.out.println("닉네임엔 '운영자'라는 단어는 사용 불가합니다.");
		}
		else {
			System.out.println("닉네임 설정이 완료되었습니다.");
		}
	
		  //이렇게 하면 안 해도 되는 것 까지 실행되어서 느려짐. 조건은 if문에 넣는 게 좋음.
	}
}
