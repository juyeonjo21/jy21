package api.lang.string;

import java.util.Random;
import java.util.Scanner;

public class Test06_2 {

	public static void main(String[] args) {
		//[Q] 쿵쿵따 게임 만들기 - 풀이		
		
		Scanner sc = new Scanner(System.in);

		String[] list = new String[] {
				"강아지","가로수","각설탕","나팔꽃","눈송이","도너츠"
		};
		
		Random r = new Random();
		int index = r.nextInt(list.length); //랜덤 추가 예시
		
		String text = list[index];
		
	
		while(true) {
			System.out.println( text + "! 쿵쿵따!");
			
		String user = sc.next();
		
	
		//[1] 3글자인지 판정
		//[2] 이어지는지 판정
		boolean a =  user.length() == 3;
		boolean b = user.charAt(2) == user.charAt(2);
		
		if( a && b ) {
			System.out.println("합격!");
			text = user;
		}
		else {
			System.out.println("게임오버!");
			break;
	   }
	}
}
}


