package random;

import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		//[Q] 윷놀이 문제
		//윷놀이는 빽도/도/개/걸/윷/모 중 하나가 랜덤으로 나옵니다.
	
		// [1] 랜덤을 이용하여 윷놀이 1턴의 결과를 출력하도록 구현하세요.	
		//(약속) 빽도=0,도=1,개=2,걸=3,윷=4,모=5
		Random r = new Random();
		int game = r.nextInt(5);
		
		if(game == 0 ) {
			System.out.println( "빽도 입니다. " ); 
		}
		else if(game == 1 ) {
			System.out.println( " 도 입니다. " );
		}
		else if(game == 2 ) {
			System.out.println(" 개 입니다. " ); //제일 많이 나옴
		}
		else if(game == 3 ) {
			System.out.println(" 걸 입니다. " ); 
		}
		else if(game == 4 ) {
			System.out.println(" 윷 입니다. " ); 
		}
		else {
			System.out.println(" 모 입니다. " );
		}
		//[2] 경우의 수
		// = 발생할 수 있는 모든 상황
		
	}
	

}
