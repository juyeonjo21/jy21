package api.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		//시간을 자바에서 처리하는 방법
		//[1] System 클래스
		//[2] Date 클래스  			-> 자바 최초의 시간관리 클래스(1900기준)
		//[3] Calendar 클래스	-> 연도 기준 변경, 날짜 계산 기능 추가
		//[4] java.time 패키지	-> 기존의 시간 관리 문제점 대폭 개선(풀 체인지)
		
		Date a = new Date();
		Date b = new Date(2023,7,11); //-> 년도가 두자리 수 기준, year+1900 이 기본 값이라 계산이 맞지 않음. *비추천.
		
		System.out.println(a.toString());
		System.out.println(b);
		
		//시간을 원하는 형식으로 출력하려면?
		//[1] 내가 직접 형식을 만드는 방법
		//[2] 형식을 만들어주는 도구를 이용하는 방법
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		
		String time = fmt.format(a);
		
		System.out.println("time = " + time);
		
	}

}
