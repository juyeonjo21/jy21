package data3;

public class Test07 {
	public static void main(String[] args) {
		//윤년 계산기 만들기 test
		//4의 배수인 해는 윤년이다
		//100의 배수인 해는 4의 배수일지라도 윤년이 아니다
		//400의 배수인 해는 100의 배수일지라도 윤년이다

		int year = 2002;
		
		boolean fourYear = year % 4 == 0 ;   //4의 배수
		boolean  hundredYear = year % 100 != 0 ; // 100의 배수
		boolean  fourHundredYear = year % 400 == 0 ; //400의 배수
	
		boolean leapYear =  fourYear && hundredYear  || fourHundredYear ;

		System.out.println(leapYear);
	
	}
}
