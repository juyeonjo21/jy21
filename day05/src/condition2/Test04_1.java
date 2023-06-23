package condition2;

import java.util.Scanner;

public class Test04_1 {
	public static void main(String[] args) {
		//여행사 프로모션3   *풀이

		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 :  ");
		int people = sc.nextInt();
		System.out.print("여행예정(월): ");
		int month = sc.nextInt();
		System.out.print("여행기간(일): ");
		int days = sc.nextInt();
		
		sc.close();
		//계산
		int total = 100000* people * days ;
		//int rate = 20 or 10 or 30 or 5;
		
		
		int rate;
	
		if(month == 3 || month == 4 || month ==5)  { //spring
			rate = 20;
		}
		else if(month == 6 || month == 7 || month ==8) { //summer
			rate = 10;
		}
		else if(month == 9 || month == 10 || month ==11) { //autumn
			rate = 30;
		}
		else { //winter
			rate = 5;
		}
		
		int discount = total * rate / 100; //할인 금액
		int result = total - discount; //최종 경비

		System.out.println("\n예상 경비 :  " + result + "원");
		System.out.println("할인율 : " + rate + "%" );
		System.out.println("할인 금액 : "+ discount + "원" );
		System.out.println("최종 경비 : " + result + "원");
		
		
		
		}
	}


