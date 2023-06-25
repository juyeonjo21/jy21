package test;

public class Test04 {
		public static void main(String[] args) {
		//[Q] 1부터 99 사이에 5가 포함되어 있는 숫자만 필터링하여 출력

			for(int i = 0; i <= 99; i ++ ) {
				if(i  % 10 ==5 || i / 10 ==5 ) { 
				System.out.println(i);
				}
			}
		}
	}	
	
