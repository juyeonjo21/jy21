package condition;

import java.util.Scanner;

public class Test03_2 {
	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출생년도 4자리: ");
		int birth = sc.nextInt();
		
		System.out.print("국밥 개수: ");
		int count = sc.nextInt();
		
		sc.close();
		
		
		int year = 2023;
		int price = 7500;
		
		
		//계산
		int age = year - birth +1;
		int total = price*count; //int discount = 0 또는 30%금액;
		
		int discount;
		
		if(age >= 65) { //어르신이면 할인 
			discount = total  * 30 / 100;
		}
		
		else { //아니면 일반 가격
			discount = 0;
		}
		
			int result =  total - discount;
	
		//출력
			System.out.println("나이 : " + age + "세");
			System.out.println("금액 :" + result + "원");

		
		
	}

}
