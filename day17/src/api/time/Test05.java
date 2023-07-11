package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Test05 {

	public static void main(String[] args) {
		//[Q] 캘린더 문제
		//[1]올해 중에서 랜덤으로 하루를 추첨하여 출력(오늘 제외. 내일부터~)
		Calendar a = Calendar.getInstance();
		Random r = new Random();	
		
		//계산
		int value = r.nextInt(365)+1 ;
		a.set(2023, 0, value); //value -> 0~ 28/29/30/31
		
		//출력
		Date d = a.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd E");
		System.out.println(fmt.format(d));
		
	}

}
