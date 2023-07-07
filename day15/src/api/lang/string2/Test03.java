package api.lang.string2;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//사용자에게 전화번호를 입력받아 유효한지 아닌지 판정하여 출력
		//- 대시는 작성x
		//- 010 / 011 / 016 / 017 / 018 / 019 로 시작
		//- 가운데는 3~4 자리의 숫자입니다.
		//- 마지막 자리는 4자리 입니다.
		
		//정규표현식(REGular EXpression)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("전화번호를 입력하세요 : ");
		String number = sc.next();
		
		String regex =  "^01[016-9][0-9]{3,4}[0-9]{4}$";
		
		//boolean isValid = Pattern.matches(regex, number);
		boolean isValid = number.matches(regex);
		//System.out.println("isValid = " + isValid );
		
		if(isValid) {
			System.out.println("유효한 전화번호 입니다.");
		}
		else {
			System.out.println("잘못된 전화번호 입니다.");
		}
	
	}

}
