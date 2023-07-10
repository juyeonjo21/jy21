package api.exception;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {	
//		try {        
//		플랜 A 
//	}
//	catch{
//		플랜 B - 입력 길이가 짧을 때
//	}
//		catch{
//			플랜 B2- 숫자 변환이 안될 때
//		}	
		
		//입력
		try {  //플랜A
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생년월일 : ");
		String input = sc.next();
		
		sc.close();

		//계산
		String part1 = input.substring(0,4);   //2023-07-10
		String part2 = input.substring(5,7);
		String part3 = input.substring(8,10);
		
		int year = Integer.parseInt(part1);
		int month = Integer.parseInt(part2);
		int day = Integer.parseInt(part3);
		
		System.out.println("출생년도  : " + year);
		System.out.println("출생 월  : " + month);
		System.out.println("출생 일 : " + day);
		
		}
	catch(StringIndexOutOfBoundsException e) {  //플랜B
		System.out.println("입력 값이 너무 짧습니다.");
	}
		catch(NumberFormatException e){   //플랜B
			System.out.println("올바른 숫자가 입력되지 않았습니다.");
			
		}
	}	
}



