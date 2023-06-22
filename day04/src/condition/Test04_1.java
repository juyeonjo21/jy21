package condition;

import java.util.Scanner;

public class Test04_1 {
	public static void main(String[] args) {
		//여행사 두번째 문제 *풀이
		//필요한 정보 - 여행인원 / 여행가는 월, 일자
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 : ");
		int people = sc.nextInt();
		System.out.print("기간(일) : ");
		int days = sc.nextInt();
		System.out.print("예정 월 : ");
		int month = sc.nextInt();
		
		//계산
		int price = 100000 * people * days;
		
		//boolean summer = 6월 또는 7월 또는 8월입니까?
		boolean summer = month == 6 || month ==7 || month == 8;
		int discount;
		
		//출력
		if(summer) { // summer == true
			discount = price * 25 / 100;
		}
		else {
			discount = 0;
		}
		int result = price - discount;
		
		System.out.println("판매가 = " + result + "원");
		System.out.println("정상가 = " + price + "원");
		}
		
	}


