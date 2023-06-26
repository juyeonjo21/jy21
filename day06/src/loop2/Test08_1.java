package loop2;

public class Test08_1 {
	public static void main(String[] args) {
		//[Q}현명한 노인 문제 풀이
		
		//[1] 일자별로 받는 돈
		long money = 1L; //1원으로 시작
		long total = 0L; //합계는 최초 0

		for(int day = 1; day <= 40; day++) {
			System.out.println(day+ "일차 =" + money + " 원" );
			total += money; //돈을 누적시켜라
			
			money *= 2;	//위치가 중요함**		
		}		
		System.out.println("총 받는 금액 = " + total + "원");
	
		
	}

}
