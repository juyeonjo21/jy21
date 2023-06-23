package condition2;

import java.util.Scanner;

public class Test05_2 {
	public static void main(String[] args) {
		//사용자에게 '초'를 입력 받아서 기준에 따라 게시글 시간 형식을 출력
		
		//입력
		int time = 75;
		
		//계산
		//String result = "방금 전" or "초 전" or "분 전" or "시간 전" or "일 전"
		String result;
		if(time < 10)  {
			result = "방금 전";
		}
	    else if(time < 1 * 60) {
	    result = time /60 + "분 전";
	    }
	    else if(time < 1 * 60 * 60) {
	    	result =time /60 /60  +  "시간 전";
	    }
	    else if(time < 1 * 24 * 60 * 60) {
	    	result = time / 60 / 60 / 24 + "일 전";
	    }
	    else if(time < 1* 365 * 24 * 60 * 60) {
	    	result = time / 60 / 60 / 60 + "오래 전";
	    }
		
		/*if(time < 10 ) {//방금 전-10초 미만
			System.out.println("방금 전");
		}
		else if(time < 60 ) { //10초 이상 1분 미만
			System.out.println(time + "초 전");
		}
		else if(time < 1 * 60 * 60 ) { //1분 이상 1시간 미만
			System.out.println(time /60 + "분 전");
		}
		else if(time < 1 * 24 * 60 * 60 ) { //1시간 이상 1일 미만
			System.out.println(time/60/60 + "시간 전");
		}
		else if(time < 1 * 365 * 24 * 60 * 60) { //1일이상
			System.out.println(time / 60/ 60 / 24/ 365 + "일 전");
		}*/
		
		
		//출력
		System.out.println("방금 전");
		System.out.println(time + "초 전");
		System.out.println(time / 60 + "분 전");
		System.out.println(time / 60 / 60 + "시간 전");
		System.out.println(time / 60 /60 / 24 /365 + "일 전");
		
		
}
}