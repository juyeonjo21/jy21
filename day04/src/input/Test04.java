package input;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//강의장 입실시각과 퇴실시각을 입력받아
		//실제 수업에 참여한 시간을 계산하여 출력
		//입실시각 입력 : 0925
		//퇴실시각 입력 : 1830
		//수업에 참여한 시간은 9시간 5분입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입실시각(hhmm) : ");
		int enter = sc.nextInt();
		
		System.out.println("퇴실시각(hhmm) : ");
		int leave = sc.nextInt();
		
		sc.close();
	
		
		
		
		/*int enter= 925;
		int leave = 1830;*/
		
		int enterHour = enter / 100;
		int enterMin = enter % 100;
		
		int leaveHour = leave / 100;	
		int leaveMin = leave % 100;
		//SYstem.out.println("enterHour =" + enterHour);
		//System.out.println("enterMin =" + enterMin );
		

		
		int enterTime = enterHour*60 + enterMin ;
		int leaveTime = leaveHour*60 + leaveMin;
		
		int time = leaveTime - enterTime;
		
		int hour = time / 60;
		int minute = time % 60;
		
		System.out.println("참여 시간은 " +hour + "시간" +minute +  "분"+ "입니다.");
	}

}
