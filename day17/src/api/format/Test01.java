package api.format;

import java.text.DecimalFormat;

public class Test01 {

	public static void main(String[] args) {
		//DecimalFormat
		// = 10진수를 출력하는 형식 클래스
		// = 0은 자리수를 확보할 때 필요한 기회(소수점)
		// = #은 0인 경우는 자리를 출력하지 않음
		// = 콤마는 한 개만 작성해도 패턴으로 인식됨
		
		double a = 1234.56789;
		DecimalFormat fmt = new DecimalFormat("#,##0.00"); //= 1,234.57 소수점 제어가 편리해짐.(수를 늘리거나,줄이거나)
		System.out.println(fmt.format(a));
	}

}
