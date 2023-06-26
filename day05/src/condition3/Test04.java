package condition3;

public class Test04 {
		public static void main(String[] args) {
		//[Q] 1부터 99 사이에 5가 포함되어 있는 숫자만 필터링하여 출력

			/*for(int i = 1; i <= 99; i ++);
			boolean ten = i / 10 == 5;
			boolean one = i % 10 == 5;
			boolean five = ten || one;
			if(five){
			System.out.println("i = " + i);*/ //이렇게 풀어도 가능
			
			for(int i = 1; i <= 99; i ++ ) { //최대한 주어진 숫자로 하기
				if(i  % 10 ==5 || i / 10 ==5 ) { 
				System.out.println(i); //System.out.println(" i = " + i); 
				}
			}
		}
}
