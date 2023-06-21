package data2;

public class Test01 {
	public static void main(String[] args) {
		//실수가 필요한 상황
		//[Q]국어점수-75점,영어점수-80점일 때 평균 점수는?
		
		int korean = 75;
		int english = 80;
		int average = (korean + english) / 2;
		//int average = (korean + english) / 2.0;  - 앞에 int이기 떄문에 오류남. 뒤에 실수면 double로 기입해야함.
		
		System.out.println(average);
		
		
		//실수는 2가지 종류가 있다.
		//- float, double
		//-소수점 표시 가능한 숫자 자리수 차이가 존재
		//-double을 기본 값으로 인식하며, float는 표시해야 함.(뒤에 f 붙이기)
		//-자리수 제한으로 부정확하다.
		//실수를 메인으로 계산하지 않는다.
		//자바에선 부동소수점 방식을 주로 쓴다.
		float a  = 3.1433434343434343434343f;
		double b = 3.14452345343434555465565656565464565; //뒤에 d 붙여도 되고 안 붙여도 되는데, 거의 안 붙임.
		System.out.println(a);
		System.out.println(b);
		
		//(*중요*) 실수가 한 개라도 있는 계산은 결과가 실수.
		//ex) 정수 + 정수 + 정수 + 실수 = 실수
		System.out.println(10 / 3);
		System.out.println(10 / 3.0);
		System.out.println(10.0 / 3);
		System.out.println(10 / 3f);
		System.out.println(10 / 3d);       //끝에 숫자 안 맞는 건 원래 그럼. 신경x


		
		
		
	}

}
