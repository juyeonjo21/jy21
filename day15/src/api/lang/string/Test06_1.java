package api.lang.string;

import java.util.Scanner;

public class Test06_1 {

	public static void main(String[] args) {
		//[Q] 쿵쿵따 게임 만들기 - 풀이
		
		Scanner sc = new Scanner(System.in);

		String text = "바나나";
		//System.out.println("제시어 :" + text );
		System.out.println( text + "! 쿵쿵따!");
		String user = sc.next();
		
		sc.close();
		
		//[1] 3글자인지 판정
		//[2] 이어지는지 판정
		if( user.length() != 3) {
			System.out.println("게임오버!");
		}
		else  if(user.charAt(2) != user.charAt(0) ) {
			System.out.println("게임오버!");
		}
		else {
			System.out.println("합격!");
	   }

	}

}
