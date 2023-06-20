package data;

public class Test11_1 {
	public static void main(String[] args) {
		
		//pc방에서 게임을 9시 40분에 시작해서 12시 25분까지 했습니다.
		//한 시간당 1200원일 때, 이용요금과 이용시간을 각각 출력하세요.

		//입력
		int startHour = 9 , startMin = 40;
		int finishHour = 12 , finishMin = 25;
		int price = 1200;
		
		
		
		//계산		
		int startTime = startHour * 60 + startMin;
		int finishTime = finishHour * 60 + finishMin;
		
		int useTime = finishTime - startTime;
		
		int useHour = useTime / 60;
		int useMin = useTime % 60;
		
		int pricePerMin = price / 60;
		int usePrice = useTime * pricePerMin;
		
		
		//출력
		System.out.println(useHour);
		System.out.println(useMin);
		
		System.out.println(usePrice);
		
	}

}
