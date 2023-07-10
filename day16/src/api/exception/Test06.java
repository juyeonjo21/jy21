package api.exception;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		//만나이 계산기 과제
		//시간계산은 작은 단위로 바꾸어서 계산하면 됨. (=개월로 변경)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출생 년도 & 월 : ");
		String input = sc.next();
		sc.close();
		
		String part1 = input.substring(0, 4); //년도
		String part2 = input.substring(5, 6); //월
		
		int year = Integer.parseInt(part1);
		int month = Integer.parseInt(part2);
		
		int birthMonth ;
		
		
		
		
//		int currentAge = 2023 - year +1 ; //현재나이
//		int age = 2023 - year -1;  //만 나이
			
		}
		
		


	}

}
