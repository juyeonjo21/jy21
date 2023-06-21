package data3;

public class Test06 {
	public static void main(String[] args) {
		//어떤 두 자리 이하의 수(ex.95)가 주어졌을 때
		//이 숫자에 3, 6, 9가 포함되어 있는지 판정 후 출력하세요.
		//(369 게임에서 박수치는 숫자인지 아닌지 판정)
		
		//입력
		int num = 95;
		//95에 3,6,9가 포함되는가  10 / 95 : 
		//9 = 3,6,9 |  5 = 3,6,9  9와 5 를 나머지와 몫으로 나누어서 판정.
		
		int ten = num / 10;
		int one = num % 10 ;
		
		//계산
		boolean tenclap = ten == 3 || ten == 6 || ten == 9;           //십의 자리에 3 or 6 or 9
		boolean oneclap = one == 3 || one == 6 || one == 9;        //일의 자리에 3 or 6 or 9
		boolean clap = tenclap || oneclap;
		//boolean clap = 십의 자리에 369 또는 일의 자리에 369;

		//출력
		System.out.println(clap);
		

		

	}

}
