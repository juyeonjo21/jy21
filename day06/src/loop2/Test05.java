package loop2;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//[Q]구구단게임
		//정답 오답 판정 후 출력
		//1. 사용자에게 원하는 단을 입력받으면 해당 단의 구구단을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 : ");
		int dan = sc.nextInt();
		
		int count;
		for(int i = 1; i <= 9 ; i++ ) {
			System.out.print(dan + "x" +i + "=" );
			int dan2 = sc.nextInt();
		if(dan2 == dan * i ) {
			System.out.println("정답입니다. ");
		}
		else {
			System.out.println("오답입니다. ");
		}		
		}
		sc.close();
		System.out.println("정답의 개수는 : ");
}
}

