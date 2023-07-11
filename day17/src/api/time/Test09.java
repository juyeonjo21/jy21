package api.time;

import java.time.LocalDate;
import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜 입력 ");
		String input = sc.next();
		
		LocalDate a = LocalDate.parse(input);
		
		System.out.println("기념일 = " + a);
		
		LocalDate after100 = a.plusDays(100L);
		System.out.println("100일 = " + after100 );
		
		LocalDate after200 = a.plusDays(200L);
		System.out.println("200일 = " + after200 );
		
		LocalDate after300 = a.plusDays(300L);
		System.out.println("300일 = " + after300 );
		
		LocalDate after1 = a.plusYears(1L);
		System.out.println("1주년 = " + after1 );
		
		LocalDate after2 = a.plusYears(2L);
		System.out.println("2주년 = " + after2 );
		
		LocalDate after10 = a.plusYears(10L);
		System.out.println("10주년 = " + after10 );

		

	}

}
