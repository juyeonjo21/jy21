package random;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
//		다음 요구하는 랜덤값을 구하여 화면에 출력하도록 코드를 구현하시오.
//		 1. 무작위 로또 번호 1개
//		 2. 무작위 두자리 정수 1개
//		 3. 무작위 otp 번호 1개(otp 번호는 총 6자리로 구성되어 있습니다)
//		 4. 무작위로 앞/뒤 출력
//		 5. 무작위로 가위/바위/보 출력
		Random r = new Random();
		
		//[1] 로또 번호 1개 랜덤
		int lotto = r.nextInt(45)+ 1;
		System.out.println("lotto 번호 = " + lotto );
		//[2] 두자리 정수 1개 랜덤 // 10부터 99까지 중 하나 = 10부터 90개 중 하나
		//**컴퓨터에서는 그냥 숫자를 구할 때 갯수로 세어 계산.
		int num = r.nextInt(90) +10 ; //헷갈리기 쉬움**
		System.out.println("두자리 정수 = " + num );
		
		//[3] otp 6자리 랜덤 / 0부터 1000000개 - *맨 앞 0이 나올 수 있게 해주는 도구는 따로 있음.
		int otp = r.nextInt(1000000) ;
		System.out.println("otp = " + otp );
		
		//[4] 앞 뒤 랜덤
		//(약속) 앞면은 
		int coin = r.nextInt(2);
		if(coin == 0 ) {
			System.out.println("동전 = 앞면 ");
		}
		else {
			System.out.println("동전 = 뒷면 ");
		}
		
		//[5] 가위바위보 랜덤
		//(약속) 가위=0,바위=1,보=2
		int rsp = r.nextInt(3);
		if(rsp == 0 ) {
			System.out.println("가위 가 나왔습니다" );
		}
		else if(rsp == 1 ) {
			System.out.println("바위 가 나왔습니다" );
		}
		else {
		System.out.println("보 가 나왔습니다" );
		}
	}

}
