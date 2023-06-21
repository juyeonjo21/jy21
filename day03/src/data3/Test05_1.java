package data3;

public class Test05_1 {
	public static void main(String[] args) {
		//건강검진은 30세 이상인 사람들을 대상을 2년에 한 번씩 진행합니다.
		//올해가 짝수 해라면, 짝수년도 출생자가 대상.
		//올해가 홀수 해라면, 홀수년도 출생자가 대상.
		//[Q]어떤 사람의 출생년도(ex.1985)를 입력 값으로 두고,  이 사람이 올해 건강검진 대상인지 판정 출력.
		//결론 = 30세 이상 && (짝수해이면서 짝수년생 || 홀수해이면서 홀수년생)*
		//       =condition1 && (condition2 || condition3) *
		//입력
		int birth = 1985;
		int year = 2023;
		
		//계산
		//boolean condition1 = 30세 이상인가?;
		//boolean condition2 = 짝수년도이면서 짝수년생인가?;
		//boolean condition3 = 홀수년도이면서 홀수년생인가?;
		
		//boolean condition = condition1 && (condition2 || condition3) ;
		
		
		
		//출력
		System.out.println();
		
		
		//풀이 방법.
		
		
		//boolean check = year % 2 == 1;
		//System.out.println(check);
		
		
	}

}
