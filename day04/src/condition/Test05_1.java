package condition;

import java.util.Scanner;

public class Test05_1 {
	public static void main(String[] args) {
		//과속단속 카메라 프로그램 *풀이
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("속도(km) : ");
		int speed = sc.nextInt();
		
		sc.close();
		
		//입력
		int limit = 50;
		
		//계산
		int overSpeed = speed - limit;
		boolean over = speed > limit;
		
		//int base = 30000;   //기본벌금
		//int add = 10000;   //추가벌금
		
		int fine;

		if(over ) { //(over == true)
			fine = 30000 + overSpeed / 10 * 10000; 
		}
		
		else {
			fine = 0;
		}
		
		//출력
		System.out.println("벌금 : " + fine + "원" );
		
	}
	
}
