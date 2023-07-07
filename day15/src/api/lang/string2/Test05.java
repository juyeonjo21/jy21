package api.lang.string2;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//사용자에게 생년월일 입력받아 검사 후 출력
		// YYYY - MM - DD 구성
		//연도는 1900년대부터 2099년까지만 가능
		//월은 01~12까지만 가능
		//일은 난이도에 따라 다음과 같이 처리
		//-'하' : 무조건 31일까지  / '중' : 큰달,작은달 구분하여 처리(2월29일) / '상' : 윤년을 고려하여 처리
		Scanner sc = new Scanner(System.in);
		System.out.println("생년월일 입력 : ");
		String birth = sc.next(); 
		
		String regex = "^(19[0-9][0-9]|20[09][09]{4})\\-(0[1-9]|1[012]{2})\\-(0[1-9]|[12][1-9]|3[01]{2})$";

		if(birth.indexOf(6) == 2 && birth.indexOf(9) ==9 ) {
			System.out.println("2월은 29일까지 있습니다.");
		}

			System.out.println();
		}
	}

