package loop3;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//[Q] 사용자에게 숫자를 입력받아 합계와 평균을 구하여 출력하는 프로그램 구현
		//(단, 사용자가 0을 입력할 경우 프로그램을 종료합니다)
		Scanner sc = new Scanner(System.in);

		int total = 0 ;
		int count = 0;
		
		while(true ) {
			System.out.println( "숫자를 입력하세요 : " );
			int user = sc.nextInt();
		
		if(user == 0 ) { //0이면
				break;
			}
		else { //0뺴고 나머지
			total += user;
		    count++;
		}
	}
		sc.close();
		
		double average = (double) total / count ; //float (float)
		
		System.out.println("총 합계 : " + total );
		System.out.println("횟수 : " + count );
		
		System.out.println("총 평균 : " + average );
		
	}

}
