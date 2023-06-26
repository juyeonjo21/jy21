package loop2;

public class Test07 {
	public static void main(String[] args) {
		//1)30일동안 매일 하루에 20개씩 푸시업을 한다.
		//2) 30일동안 첫날은 10개, 둘쨋날부터는 3개씩 늘려가며 푸시업을 한다.
		//각각의 푸시업 갯수 합계 구하여 출력
		
		//[1] 30일 동안 매일 하루에 20개씩 푸시업한 갯수
		
		int total = 0;
		for(int day = 1; day <= 30 ; day ++ ) {
			System.out.println(day + "일차 : 20개" );
			total += 20;
		}
		System.out.println("합계 = " + total + "개" ); //하루 20개씩 30일 동안의 갯수
		
		//[2] 30일동안 첫날은 10개, 둘쨋날부턴 3개씩 증가한 갯수
		
		int total2 = 0;
		int pushUp = 10; //시작은 열개. - 추천
		
		for(int day = 1; day <= 30; day++ ) {
			//int pushUp = day * 3 + 7; -비추천
			//int pushUp = 10 + (day -1 ) -비추천
			System.out.println(day + "일차 : " + pushUp + "개" );
			total2 += pushUp; //total을 pushUp 갯수만큼 증가 처리
			pushUp += 3; //3개씩 증가
		}
		System.out.println("총 푸쉬업 갯수 = " + total2 + "개" );
	}
	}


