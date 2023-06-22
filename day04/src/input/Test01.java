package input;

import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		//표준 입력
		//- Systerm.in 을 사용하여 처리
		//- 사용자가 입력해주기를 기다려야 한다.
		//- ACII 코드를 입력받는다.
		//콘솔 창에 입력하는 문자 or 숫자를 아스키코드로 입력함
		int a = System.in.read(); 
		System.out.println("a = " + a );
		
	}

}
