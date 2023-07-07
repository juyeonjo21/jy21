package api.lang.string;

import java.util.Scanner;

public class Test08_1 {
	public static void main(String[] args) {
		//욕설 필터링 프로그램 *풀이*
		//필터링할 욕설은 -> 수박씨, 신발끈, 개나리, 십장생, 시베리아, 주옥, 조카, 개불, 10원 - 9개
		//욕설이 있다면 ' * '로 바꾸어서 출력.
		System.out.println("입력 : " );
		
		Scanner sc = new Scanner(System.in);
		String user = sc.next();

		String[] data = new String[]  {"수박씨","신발끈","개나리","십장생","시베리아","주옥","조카","개불","10원"};
		
		String line = "이런 수박씨 신발끈 개나리같은 십장생!!!";
		String star = "*";
		
		
		for(int i = 0; i < data.length; i++ ) {
			int count = data[i].length();
			line = line.replace(data[i], star.repeat(count) );
		}
		
		System.out.println(line);

		}
	}
	

/*line = line.replace( data[0], "***");
line = line.replace( data[1], "***");
line = line.replace( data[2], "***");
line = line.replace( data[3], "***");
line = line.replace( data[4], "***");
line = line.replace( data[5], "***");
line = line.replace( data[6], "***");
line = line.replace( data[7], "***");*/


