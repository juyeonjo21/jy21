package condition;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출생년도 4자리 : ");
		int birth = sc.nextInt();
		System.out.print("국밥 그릇 수 : ");
		int foodCount = sc.nextInt();
		
		
		int year = 1959;
		int age = 2023 - year +1;
		int foodPrice = 7500;
		int rate = 30;
		
		
		if(age >= 65) {
			System.out.println(( foodPrice * rate )+ "원" );			
		}
		else {
			System.out.println( foodPrice + "원");
		}
		
		
	
		//System.out.println(age);
		
		
	}

}
