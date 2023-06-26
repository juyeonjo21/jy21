package loop2;

public class Test06 {
	public static void main(String[] args) {
		//누적 합계 구하기
		//[Q1] 10을 10번 더하면 얼마?
		
		int total = 0;
		//total += 10; //10이 늘어나는 것 
		for(int i = 0; i < 10; i++ ) { //10이 얼마?
			total += 10;
		}
		
		System.out.println(total);
		
		//[Q2] 1부터 10까지 더하면 얼마?
		int total2 = 0;  //변수로 만들어주고
		for(int i = 0; i <= 10; i ++ ) {
			total2 += i; //1부터 10까지 더하는 거니까 i를 늘어나게 넣어줌
		}
		
		System.out.println(total2);
		
	}

}
