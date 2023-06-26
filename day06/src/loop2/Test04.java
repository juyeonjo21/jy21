package loop2;

public class Test04 {
	public static void main(String[] args) {
		//5는 소수이다 ( 1, 5 뺴고 딱 떨어지는 수가 없음)
		//6은 소수가 아니다 ( 1, 6 빼고도 2, 3 등 나누어 떨어지는 수가 있음)
		//[Q] 사용자가 2 이상의 어떤 숫자를 입력했을 때 소수인지 아닌지 판정 출력
		//0이 몇번 나오느냐 소수를 나머지 값을 구할 때 공식을 찾아라
		//소수 탐색 프로그램 문제 풀이
		//*출력 먼저 하기 - 그 다음에 판정 계산하고 출력.
		
		int number = 6;
				
		int count = 0;
		
		for(int i = 2; i <= number; i++) {
			if(number % 1 ==0 ) {
			//System.out.println(number % 1);
			count++;
		}
	}
	System.out.println("number = " + number);
	System.out.println("count = " + count);
	
	if(count == 2) {
		System.out.println("소수가 아닙니다");
	}
	else {
		System.out.println("소수가 아닙니다");
	}
	}
}
