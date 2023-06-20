package data;

public class Test08 {
	public static void main(String[] args) {
		//정수의 특징
		
		//[1] 정수는 소수점이 없는 수이다.
		// ex) int a = 3.14;   X에러
		int a = 3;
		
		//[2] 정수는 크기에 따라 여러 종류로 나뉜다.
		//-byte,short,int,long
		byte b = 10; 
		
		//[3] 크기를 벗어나면 저장이 안된다.
		//byte c = 150;  byte : 127까지만 됨. 숫자보단 파일에 많이 씀
		//int d = 1000000000o; //int 10억까지는 됨
		long e = 1000000000L; //long은 표시를 해야한다 (끝에 L 붙여줌/L은 구분만 하고 출력되는 값은 아님.)
		System.out.println(e);
		
		//[4] 정수는 순환형 구조를 가진다.
		//int f = 1234567 * 1234567;
		long f = 1234567L * 1234567L;  //숫자만 계산하면 앞에 long으로 해도 int로 간주됨. 끝에 꼭 L 붙이기.
		System.out.println(f);
		
		//[5] *중요* 정수끼리 계산하면 정수가 나온다. (특히 나눗셈 소수점 표시x)
		int v1 = 10;
		int v2 = 3;
		System.out.println(v1 / v2); //몫
		System.out.println(v1 % v2); //나머지
		
		
		
	}
	

}
