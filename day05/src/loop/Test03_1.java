package loop;

public class Test03_1 {
	public static void main(String[] args) {
	//[Q] 1부터 100 사이의 홀수를 출력

		//불규칙적인 수를 출력할 때
		
		for(int i = 1; i <= 100; i ++) {
			if(i % 2 != 0 ) { //i가 홀수면
			System.out.println(i);
			//조건은 커버리지 확인은 디버그
			}
		}
	}

}