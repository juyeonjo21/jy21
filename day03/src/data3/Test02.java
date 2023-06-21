package data3;

import java.util.Calendar;

public class Test02 {
	public static void main(String[] args) {
		//KH편의점에서는 한국 나이로 20세 이상에게만 술,담배를 팝니다.
		//어떤 사람의 출생년도가 2003년일 때, 이 사람에게 술 담배를 팔아도 되는지 판정 후 출력하시오.
		//(한국 나이는 태어났을 때부터 1살이며, 만 나이와 다름)
		//[성인 판정 문제]
		
		 
         
		//입력
		int birth=  2003;
		
		
		
		//계산
		int age = 2023 - birth + 1;
		System.out.println(age);
		
		boolean adult = age >= 20;
		System.out.println(adult);
		
	}

}

//나이
//=태어난 해부터 올해까지 살아온 연도 수
//= 올해 - 태어난 해 +1
//->A부터 B사이의 숫자 갯수 구하는 방식.