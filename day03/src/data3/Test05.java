package data3;

public class Test05 {
	public static void main(String[] args) {
		//건강검진은 30세 이상인 사람들을 대상을 2년에 한 번씩 진행합니다.
		//올해가 짝수 해라면, 짝수년도 출생자가 대상.
		//올해가 홀수 해라면, 홀수년도 출생자가 대상.
		//[Q]어떤 사람의 출생년도(ex.1985)를 입력 값으로 두고,  이 사람이 올해 건강검진 대상인지 판정 출력.
		
		int birth = 1985;
		int year = 2023;
		
		
		boolean even = birth % 2 == 1 && year % 2 == 1;
		System.out.println(even);
		
		//boolean check = year % 2 == 1;
		//System.out.println(check);
		
		
	}

}
//내가 푼 거.