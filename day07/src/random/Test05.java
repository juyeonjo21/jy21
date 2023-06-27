package random;

import java.util.Random;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//사용자에게 랜덤으로 2단부터 9단 사이의 구구단 문제를 10개 제출합니다.
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
			
		//int count = 0;
		int ok = 0;
		int nok = 0;
		
		for(int i = 1; i <=10; i++ ) {
			int x = r.nextInt(8)+2;
			int y = r.nextInt(9) +1;
			System.out.print(x + "x" + y + "=" );
			
			int dan = x * y;
			int user = sc.nextInt();
			//count ++;
			
		if( user  == dan ) {
			System.out.println("정답 입니다." ); //굳이 중간 출력 안해도 됨.
			ok++;
		}
		else {
			System.out.println( "오답 입니다.");
			nok++;
		}
    	}
		System.out.println("총 정답 개수 :" + ok + "개 입니다." );
		System.out.println("총 오답 개수 :" + nok + "개 입니다. ");
	}
}
