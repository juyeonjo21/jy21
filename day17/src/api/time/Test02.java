package api.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {

	public static void main(String[] args) {
		//[Q] 현재 시간으로 구하여 출력
		//[1] 2023년 7월 11일
		//[2] ex) 오후 1시 1분 -> 출력 시, 시간 말하는 거임
		//[3] 13:01:05
		//[4] 2023-07-11 화 13:01:05
		
		Date a = new Date();
		Date b = new Date();
		Date c = new Date();
		Date d = new Date();
		
				
		SimpleDateFormat fmt1 = new SimpleDateFormat("y년 M월 d일");
		String time1 = fmt1.format(a); //변수 생략하고 바로 넣어서 출력해도 됨.
		System.out.println("현재 날짜 : " + time1 );
		
		SimpleDateFormat fmt2 = new SimpleDateFormat("a h시 m분");		
		String time2 = fmt2.format(b);
		System.out.println("현재 시각 : " + time2);
	
		SimpleDateFormat fmt3 = new SimpleDateFormat("HH:mm:ss"); //H:mm:ss
		String time3 = fmt3.format(c);
		System.out.println(time3);
		
		SimpleDateFormat fmt4 = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
		String time4 = fmt4.format(d);
		System.out.println(time4);
	}

}
