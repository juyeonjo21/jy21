package random;

import java.util.Random;

public class Test03_1 {
	public static void main(String[] args) {
		//[Q] 윷놀이 문제
		//윷놀이는 빽도/도/개/걸/윷/모 중 하나가 랜덤으로 나옵니다.
	
		// [1] 랜덤을 이용하여 윷놀이 1턴의 결과를 출력하도록 구현하세요.	
		//(약속) 빽도=0,도=1/2/3 개=4/5/6/7/8/9 걸= 10/11/12/13 윷=14 모=15
		Random r = new Random();
		int yut = r.nextInt(16);
		
		switch(yut) {
		case 0: 
			System.out.println("빽도"); break;
		case 1,2,3: 	
			System.out.println("도"); break;
		case 4,5,6,7,8,9:	
			System.out.println("개"); break;
		case 10,11,12,13:	
			System.out.println("걸"); break;
		case 14:	
			System.out.println("윷"); break;
		case 15:	
			System.out.println("모"); break;
		}

		
	}
	

}
