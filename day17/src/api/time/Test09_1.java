package api.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test09_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜 입력 ");
		String input = sc.next();
		
		//LocalDate a = LocalDate.parse(input, 해석기준);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd"); // ' - '가 아니여도 되는지 확인
		LocalDate a = LocalDate.parse(input, fmt);
		

		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("y년 M월 d일 ");
		long[] days = new long[] {
				100L,200L,300L,365L,400L,500L,600L,700L,365L*2,800L,900L,1000L,365L*3,365L*4,365L*5,365L*6,365L*7,365L*8,365L*9,365L*10
		};
		
		for(int i = 0; i < days.length; i++ ) {
			LocalDate future = a.plusDays(days[i]);
			if(days[i] % 365 == 0 ) {
				System.out.println(days[i]/365 + "년 뒤 = " + future.format(fmt2));
			}
			System.out.println(days[i] + "일 뒤 = " + future.format(fmt2));
		}
		
		
		System.out.println("기념일 = " + a.format(fmt2)); // 슬러시로 바꾼 걸 출력까지 나오게 하는 방법
		
		LocalDate after100 = a.plusDays(100L);
		System.out.println("100일 = " + after100.format(fmt2) );
		
		LocalDate after200 = a.plusDays(200L);
		System.out.println("200일 = " + after200.format(fmt2) );
		
		LocalDate after300 = a.plusDays(300L);
		System.out.println("300일 = " + after300.format(fmt2) );
		
		LocalDate after1 = a.plusYears(1L);
		System.out.println("1주년 = " + after1.format(fmt2) );
		
		LocalDate after2 = a.plusYears(2L);
		System.out.println("2주년 = " + after2.format(fmt2) );
		
		LocalDate after10 = a.plusYears(10L);
		System.out.println("10주년 = " + after10.format(fmt2) );

	}

}
