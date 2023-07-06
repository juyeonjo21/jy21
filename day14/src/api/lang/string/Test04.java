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
		
		System.out.println("닉네임 : ");
		String name = sc.next();
		
		if(name.length() >=2 && name.length() <= 10) {
			System.out.println();
		}
		 
	}
}
