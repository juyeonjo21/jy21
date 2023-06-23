package condition2;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//사용자에게 '초'를 입력 받아서 기준에 따라 게시글 시간 형식을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초를 입력하세요. ");
		int time;
		
		
		
		int sec=10;
		
		if(sec > 10 ) {//방금 전-10초 미만

		}
		else if(sec >= 10 || sec < 60 ) { //10초 이상 1분 미만
		}
		
		else if(sec >= 60 || sec < 3600 ) { //1분 이상 1시간 미만
		}
		else if(sec >= 3600 || sec < 216000 ) { //1시간 이상 1일 미만
		}
		else { //1일이상
		}
		
		
}
}