package loop2;

import java.util.Scanner;

public class Test09_1 {
	public static void main(String[] args) {
		//사용자에게 숫자를 10개 입력받아서 다음을 계산
		// 1) 홀수의 갯수 2)짝수의 갯수 3) 전체 합계 4) 전체 평균
		
		Scanner sc = new Scanner(System.in);
		
		int odd = 0;
		int even = 0;
		int total = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("숫자 입력 : ");
			int number = sc.nextInt();
		     total += number;
		     
		if(number % 2 !=0 ) {	
			odd ++;
		}
		else {			
			even ++;
		}
	
		
		}	
		double average = (double)total / 10;
		
		System.out.println("홀수의 갯수는 " + odd + "개 입니다.");
		System.out.println("짝수의 갯수는 " + even + "개 입니다.");
		System.out.println("전체 합계는 " + total + " 입니다.");
		System.out.println("전체 평균은 " + average + " 입니다.");
					
	}
}
