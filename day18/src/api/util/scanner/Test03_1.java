package api.util.scanner;

import java.util.Scanner;

public class Test03_1 {
	public static void main(String[] args) {
		//Scanner와 정규표현식을 결합하여 패턴을 분석
		//[Q]
		
		String color = "빨강/주황+노랑=초록-파랑%남색*보라";
		
		Scanner sc = new Scanner(color);
		
		//sc에 '+'를 구분자(delimiter)로 지정 -> "\\+"
		sc.useDelimiter("[\\/\\+\\=\\-\\%\\*]");   // -> [ ] 대박스 안에 \붙여서 하면 불필요한 특수문자 제거 가능.
		
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		
		sc.close();
	}

}
