package loop2;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		//사용자에게 숫자를 10개 입력받아서 다음을 계산
		// 1) 홀수의 갯수 2)짝수의 갯수 3) 전체 합계 4) 전체 평균
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int count2 = 0;
		int total = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("숫자 : ");
			int number = sc.nextInt();
		     total += number;
		     
		if(number % 2 !=0 ) {	
			count ++;
		}
		else {			
			count2 ++;
		}
		}	
		System.out.println("홀수의 갯수는 " + count + "개 입니다.");
		System.out.println("짝수의 갯수는 " + count2 + "개 입니다.");
		System.out.println("전체 합계는 " + total + " 입니다.");
		System.out.println("전체 평균은 " + total / 10 + " 입니다.");
		
	
	
				
	}
	/*System.out.println();
	System.out.println();
	System.out.println();*/


}
