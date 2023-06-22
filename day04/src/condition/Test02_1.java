package condition;

import java.util.Scanner;

public class Test02_1 {
	public static void main(String[] args) {
		//입력
		Scanner sc= new Scanner(System.in);
		
		System.out.print("출생년도 4자리 : ");
		int birth = sc.nextInt();
		
		sc.close();
		
		//계산
		int year = 2005;
		int age = 2023 - birth +1 ;
		
		//int age = 19;
		//System.out.println(age);
		
		//출력
	if(age == 19 ) {
			System.out.println("이벤트 대상입니다.");
		}
		//if(age != 19 ) {
	else {
			System.out.println("이벤트 대상이 아닙니다.");
		}
	}

}
