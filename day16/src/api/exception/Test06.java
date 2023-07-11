package api.exception;

import java.util.Calendar;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
			//만나이 계산기 과제
		
			try { //플랜A
				Scanner sc = new Scanner(System.in);
				
				System.out.println("출생년-월 (yyyy-mm) : " );
				String input = sc.nextLine();
				sc.close();
				
				if(input.length() < 7 ) {
					throw new Exception("입력 값이 너무 짧습니다.");
				}
				
				int birthYear = Integer.parseInt(input.substring(0,4)); //user 출생 년도
				if(birthYear < 1900 ) {
					throw new Exception("년도는 1900년도 초과여야 합니다.");
				}
				
				int birthMonth = Integer.parseInt(input.substring(5, 7)); //user 출생 월
				if(birthMonth < 1 || birthMonth > 12 ) {
					throw new Exception("월은 1~12월만 입력 가능합니다.");
				}
				
				Calendar cal = Calendar.getInstance();
				int year = 	cal.get(Calendar.YEAR); //현재 년도
				int month = cal.get(Calendar.MONTH) +1 ; //현재 달
				
				boolean wrong = year <= birthYear || month < birthMonth;
				
				if(wrong) {
					throw new Exception("입력 값이 올바르지 않습니다.");
				}
						
				int currentAge = year - birthYear +1; //현재나이
				int americanAge = year - birthYear -1;  //만 나이
				if(month >= birthMonth ) {
					americanAge += 1;  // 생일 달이거나, 지났다면 = 만나이 +1
	  }
				
				System.out.println("현재 나이 : " + currentAge + " 세" );
				System.out.println("만 나이 : " + americanAge + " 세" );
}		
			catch(Exception e ) {   //플랜B
				if(e.getMessage() == null ) {
					System.out.println("입력 오류");
				}
				else {
					System.err.println(e.getMessage());
			   }
	   }	
	}
}