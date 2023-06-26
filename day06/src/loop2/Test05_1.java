package loop2;

import java.util.Scanner;

public class Test05_1 {
	public static void main(String[] args) {
		//[Q]구구단게임
		//정답 오답 판정 후 출력
		//**문제 풀이
	
		Scanner sc = new Scanner(System.in);
		System.out.print("단 : ");
		int dan = sc.nextInt();
		
		int ok = 0; //위치 기억
		int nok = 0; //위치 기억
		int combo = 0;
		
		//for(1부터 9까지){
		for(int i = 1; i<= 9; i++) {
			System.out.print(dan + "x " + i + "=" );
			int user = sc.nextInt();
			
		if(dan* i == user) {
			System.out.println("정답");
			ok++ ; //위치 기억
			combo ++;
			System.out.println(combo + "콤보!");
		}
		else {
			System.out.println("오답");
			nok++ ; //위치 기억
			combo = 0;
		}
	}
		
		sc.close();//위치기억

		System.out.println("맞은 갯수 = " + ok );
		System.out.println("틀린 갯수 = " + nok );
		System.out.println("콤보 갯수 = " + combo );
}
}

