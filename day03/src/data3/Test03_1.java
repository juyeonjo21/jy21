package data3;

public class Test03_1 {
	public static void main(String[] args) {
		//[Q]어떤 숫자 (ex. 17)가 주어졌을 때, 이 숫자가 짝수인지 판정하여 출력.
		//*짝수 판정 문제 풀이
		
		//입력
		int num = 17;
		
		//계산
		int mod =  num % 2;
		//boolean zero =  mod가 0과 같습니까?
		boolean zero = mod == 0; 
		//boolean even = num % 2 == 0;      *보통은 이렇게 간략하게 많이 씀.
		//System.out.println(even);
		
		//출력
		System.out.println(zero);
			 
		 }
		
	}


