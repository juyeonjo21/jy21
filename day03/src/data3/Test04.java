package data3;

public class Test04 {
	public static void main(String[] args) {
		//청소년 판정 프로그램
		//=14세 이상 19세 이하
		
		int age = 5;
		
		//boolean teen = 14 <= age <= 19; ->안됨.
		boolean teen = 14 <= age && age <= 19 ;    //true true -> true
		
		boolean free = age < 8 || age >= 65; //8세 미만 또는 65세 이상 
		//둘 중 하나
		
		//논리연산 - 논리끼리 계산하기 위한 기호
		
       //&& : 앤드연산(논리연산)- 왼,오 모두 참인 경우 참. 참참참~~ /  <= : 비교연산
		// || : (or 연산) - 왼쪽과 오른쪽이 모두 거짓인 경우 거짓.
		System.out.println(teen);
		System.out.println(free);
		
	
		
		
	}		
}
