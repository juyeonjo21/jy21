package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import java.util.Scanner;

public class Test07_1 {

	public static void main(String[] args) {
		// 사용자에게 연도와 월을 입력받아 해당하는 달 달력의 시작 날짜를 출력
		Calendar c = Calendar.getInstance();
//		Scanner sc = new Scanner(System.in);
		
//		System.out.println("연도 / 월 : " );
//		int input = sc.nextInt();
		
		
		int year = 2023;
		int month = 7;
		
		int week = c.get(Calendar.DAY_OF_WEEK);
		//System.out.println("start = " + week);
		c.set(year, month-1 , 1);
		c.add(Calendar.DATE, -(week -1));
		
		//달력 출력 - 42번
		int count = 0;
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i = 0; i < 42; i++) {
			Date d = c.getTime();
			SimpleDateFormat f = new SimpleDateFormat("d");
			System.out.print(f.format(d));
			System.out.print("\t");
			
			c.add(Calendar.DATE, 1);
			count ++;
			if(count % 7 == 0 ) {
				System.out.println();
			}
		}

	}

}
