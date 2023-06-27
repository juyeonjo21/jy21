package random;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		//모두의 마블 문제
		//-한 턴에 주사위 두 개를 던집니다
		//-주사위 두 개가 같은 값이 나오면 '더블'이라고 부르며 한 번 더 던질 수 있습니다

		//[1] 100턴 동안 주사위를 던졌을 때 더블이 몇 번 나오는지 카운트해서 출력		
		Random r = new Random();
        
		int count = 0;
		
		for(int i = 0; i < 100; i ++ ) {
			
		int dice = r.nextInt(6) +1 ;
		int dice2 = r.nextInt(6)+1 ;
		System.out.println("주사위 = " + dice + " , " +  dice2 );
		 
		if(dice == dice2 ) {
			System.out.println( " 더블 ! ");		
			count++;
		}
		
		
		//System.out.println("더블은 총 : " + count );
		
		
			
		
		
		
		
		
		
		
		
		//한턴-2개 / 두개가 같은 값 = 더블! + 1 / 100턴동안 주사위 더블 총 카운트
		}
	}
}

