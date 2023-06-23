package condition3;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//큰달(31) 1, 3 , 5, 7, 8 ,10, 12
		//작은달(30) 4, 6, 9, 11
		//2월 - 28일까지
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 : ");
		int month = sc.nextInt();
		
		sc.close();
		
		switch(month) { //**java 13 이후부터 가능한 문법
		case 1: case 3: case 5:  case 7 :  case 8: case 10 : case 12 : //큰달
			System.out.println( "31일");
		break;
		case 4: case 6: case 9: case 11 : //작은달
			System.out.println( "30일");
		break;
		default : //28일까지 있는 2월
			System.out.println("28일");	
		break;
		}
		
		/*switch(month) { //**java 13 이후부터 가능한 문법
		case 1 , 3, 5, 7, 8, 10, 12 : //큰달
			System.out.println( "31일");
		break;
		case 4, 6, 9, 11 : //작은달
			System.out.println( "30일");
		break;
		default : //28일까지 있는 2월
			System.out.println("28일");	
		break;
		}*/
	
			
	}

}
