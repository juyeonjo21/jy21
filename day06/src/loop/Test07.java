package loop;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("분 : ");
		int min = sc.nextInt();
		System.out.print("초 : ");
		int sec = sc.nextInt();
		
		sc.close();
		
		//String time;
		for(int m = 120 /60;  m >= 0; m --) {
			System.out.println(m + "분 ");
		}

			
		}
	}


