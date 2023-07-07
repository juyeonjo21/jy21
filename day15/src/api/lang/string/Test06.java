package api.lang.string;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		//[Q] 쿵쿵따 게임 만들기
		// 제시어 - 바나나
		//입력한 단어는 제시어와 이어져야 합니다
		//입력한 단어는 3글자여야 합니다
		//위 조건을 만족하지 않을 경우 게임오버가 되며, 프로그램 종료
		//단어를 정상적으로 입력한 경우 제시어가 입력한 단어로 바뀝니다
		//반복적으로 위 작업을 진행합니다
		Scanner sc = new Scanner(System.in);

		String text = "바나나";
		System.out.println("제시어 :" + text );
		System.out.println("입력 : ");
		String user = sc.next();
		
		char ch = text.charAt(2);
		
		if( ch > '나' ) {
			System.out.println("제시어와 이어지지 않습니다.");
		}
		else  if(user.length() > 3 ) {
			System.out.println("3글자만 입력 가능.");
		}
		else if(ch > '나' && user.length() > 3 ) {
			System.out.println("게임오버!");
		}
		else if(ch >= '나' && ch == user.indexOf(2)) {
			ch --;
			   System.out.println("제시어 : ");	
		}
		else {
	   }

	}

}
