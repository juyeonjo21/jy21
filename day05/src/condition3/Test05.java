package condition3;

public class Test05 {
	public static void main(String[] args) {
		//[Q]1부터 99 사이에 369 게임에서 박수치는 숫자만 필터링하여  출력
		
		for(int i = 1; i <=99; i ++) {
			int ten = i / 10;
			int one = i % 10;
		if(ten == 3 || ten == 6 || ten == 9) {
			System.out.println(i);
		}
		else if(one ==3 || one == 6 || one == 9) {
			System.out.println(i);
			
			
		/* boolean ten = i / 10 ==3 || i / 10 == 6 || i / 10 ==9;
		 boolean one = i % 10 == 3 || i % 10 == 6 || i % 10 == 9;
		 boolean clap = ten || one;
		 booleanClap = ten && one;
		 
		 if(doubleClap){
		  System.out.println("짝짝");
		  }
		 else if(clap) {
			 System.out.println("짝");
		 }
		 else {
		 }
		 }
		 */ //이렇게 응용할 수 있음.
			}
		}
	}

}
