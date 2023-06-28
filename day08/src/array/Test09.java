package array;

import java.util.Random;

public class Test09 {

	public static void main(String[] args) {
		//[Q] 로또 문제 1000번 추첨 
		//[1] 1~45 숫자들의 각자 나온 횟수 출력
		Random r = new Random();
		
		int[] countList = new int[45]; //변수를 대신하는 것


		for(int i = 0; i < 1000; i++ ) {
			int lotto = r.nextInt(45) +1;
			countList[lotto-1]++; // ex : n = [n-1] ++ 이게 공식임
		}	
		for(int i = 0; i < countList.length;  i++ ) {
			System.out.println( (i+1) +"의 나온 횟수 : " + countList[i] );
		
	}

		}
}

