package loop3;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		//while의 활용
		//= 주사위가 6이 나올 떄까지 던지는 코드 = 1부터 6개
		
		Random r = new Random();
		
		while(true) {// = for(;;){ 이거랑 같음 //while 옆엔 특별한 일 아님 true 적어줌(무한 출력)
			int dice = r.nextInt(6) + 1;
			System.out.println("주사위 : " + dice);
			
		//만약 주사위 값이 6이라면 반복을 종료하도록 조건을 설정(필수)
			if(dice == 6 ) {
				break; //while문에선 꼭 필요. 
			}
		}
	}

}
