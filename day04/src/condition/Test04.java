package condition;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//여행사 두번째 문제
		//필요한 정보 - 여행인원 / 여행가는 월, 일자
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("여행가는 월 : ");
		int season = sc.nextInt();
		
		System.out.print("여행가는 일 수 : ");
		int day = sc.nextInt();
		
		System.out.print("총 인원 수 : ");
		int people = sc.nextInt();
		
		sc.close();
		
		
		
		int price = 100000;
		

		int total = price * day * people ;
		int seasonEvent = season / 3;
		
		
		int discount;
		
		if (seasonEvent == 2 ){
			discount = total * 25 / 100;			
		}
		else {
			discount = 0;
		}
		
		int result = total - discount;
		
		System.out.println("할인 금액 : " + discount );
		System.out.println("총 예상 경비 :" + result );
		
	}

}
