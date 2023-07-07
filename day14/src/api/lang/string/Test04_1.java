package api.lang.string;

import java.util.Scanner;

public class Test04_1 {
	public static void main(String[] args) {
		//[Q] 문자열 문제 과제 *풀이*
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("닉네임 입력 : ");
		String nickname = sc.next();
		
		
		if( nickname.length() < 2 || nickname.length() > 10) {
			System.out.println("닉네임은 2글자 이상, 10글자 이하여야 합니다.");
		}
		else if(nickname.contains("운영자")) {
			System.out.println("닉네임엔 '운영자'라는 단어는 사용 불가합니다.");
		}
		else {
			System.out.println("닉네임 설정이 완료되었습니다.");
		}
	
		 
	}
}
