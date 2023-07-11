package api.time;

import java.time.LocalDate;
import java.time.Period;

public class Test08 {
	public static void main(String[] args) {
		//java.time 패키지(Java 8+)
		// - 완전히 새롭게 구축된 시간 관련된 클래스 모음
		// - 기존의 시간 클래스들은 날짜와 시간을 따로 생각할 수 없다.(분리 안됨)
		// 	- 날짜만 쓰고 싶으면 LocalDate를 써라!
		// 	- 시간만 쓰고 싶으면 LocalTime을 써라!
		// 	- 날짜와 시간 모두 쓰고 싶으면 LocalDateTime을 써라!
		//- 월을 1~12로 관리하도록 개선됨.
		// - 명령을 단순화 함
		// - 불변으로 관리하도록 설정(=문자열처럼 관리됨) -> 다중쓰레드 환경에서 안전함
		
		//LocalDate 사용
		LocalDate a = LocalDate.of(2000, 1, 1); //년,월,일 of -> 수치
		System.out.println("a = " + a);
		System.out.println("년도 = " + a.getYear());
		System.out.println("월 = " + a.getMonthValue());
		System.out.println("일 = " + a.getDayOfMonth());

		LocalDate b = LocalDate.parse("2023-11-29"); //parse -> 해석
		System.out.println("b = " + b);  //꼭 숫자가 아니고 문자여도 만들 수 있음.
		
		LocalDate c = LocalDate.now(); //now -> 지금
		System.out.println("c = " + c);
		
		//이전 - 이후 비교
		// = 오늘은 수료일보다 이전입니까?
		System.out.println(c.isBefore(b));  //-> true/false 로 판단 가능 c(현재날짜)가 b(수료일)이전이니?
		System.out.println(b.isAfter(c)); // b(수료일)이 지금 날짜에서 지났냐?
		
		//윤년
		System.out.println(a.isLeapYear());
		System.out.println(b.isLeapYear());
		System.out.println(c.isLeapYear());

		//계산
		//[Q]수료일 100일 전은 언제입니까?
		LocalDate before100 = b.minusDays(100L); //long으로 쓰라고 뜸.
		System.out.println(before100);
		
		//두 날짜의 차이 (캘린더,데이트에서는 명령으로 x)
		// = 유틸리티 클래스인 period를 사용하여 차이를 구한다
		// ex. 오늘과 수료일의 차이

		Period period = Period.between(c, b); //오늘,수료일 -> 이 사이를 구해서 기간으로 저장해라.
		System.out.println(period);
		System.out.println(period.getYears()); //0년 남음
		System.out.println(period.getMonths()); //4개월 남음
		System.out.println(period.getDays()); // 0년 4개월 18일 남음
	}

}
