package data3;

public class Test07_1 {
	public static void main(String[] args) {
		//윤년 계산기 만들기 풀이
		
		//4의 배수인 해는 윤년이다 (include조건)
		//100의 배수인 해는 4의 배수일지라도 윤년이 아니다 *100의 배수가 아니여야 한다. (exclude 조건)
		//400의 배수인 해는 100의 배수일지라도 윤년이다  (include조건)

		//입력
		int year = 2002;
		
		//계산
		boolean fourYear = year % 4 ==0 ; // [1]
		boolean  hundredYear = year % 100 != 0 ; //[2]
		boolean  fourHundredYear = year % 400 == 0 ; //[3]
	
		//boolean leapYear =  fourYear && hundredYear  || fourHundredYear ; 
		boolean leapYear =  fourHundredYear || hundredYear && fourYear;
		//** [3]번의 조건이 제일 중요하므로 앞 쪽에 배치해야 함. 앞 뒤 순서가 중요.
		

		System.out.println(leapYear);
	
		
	}
}
