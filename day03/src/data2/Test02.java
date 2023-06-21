package data2;

public class Test02 {
	public static void main(String[] args) {
		//키 180cm 몸무게 80kg BMI지수를 구하세요. (성별,나이 제거하고)
		
		//입력
		int cm = 180;            //주어진 제시 값을 꼭 입력해야하므로 정수로 입력.
		int kg = 80;
		//계산
		//int m = cm / 100;
		//float m = cm / 100f;
		//double m = cm / 100d;             3가지 다 같음
		double m = (double)cm / 100d;
		
		double bmi = kg / (m*m) ;  //곱셈 먼저 계산되도록 해야 함. 괄호 사용.
		//double bmi = kg / m / m; (같은 거긴 하지만 이렇게 사용x)
		
		System.out.println(bmi);
	
	
		
		
	}

}
