package loop2;

public class Test02 {
	public static void main(String[] args) {
		//[Q] 1부터 99 사이의 숫자 중 7이 포함된 숫자의 갯수를 구하여 출력
		
		int count = 0;
		
		for(int i = 1; i <= 99; i ++ ) {
			if(i / 10 == 7 || i % 10 == 7 ) {
				count ++;
				//System.out.println(i);
			}
		}
		System.out.println(count);
	}

}
