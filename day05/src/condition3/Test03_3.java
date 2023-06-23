package condition3;

public class Test03_3 {
	public static void main(String[] args) {
		//switch로 풀이
		
		int year = 2004;
		int month=2;
		//입력
		int days;
		switch(month) {
		case 1 , 3, 5, 7, 8, 10, 12 : //큰달
			days = 31;
		break;
		case 4, 6, 9, 11 : //작은달
			days = 30;
		break;
		//case 2 :
		default : //28일까지 있는 2월
			boolean leapYear = year % 400  == 0 || year % 4 == 0  && year % 100 !=0 ;
			if(leapYear) {
			days = 29;
			}
			else {
				days=28;
			}
		break;
	}
		
		//출력
		System.out.println(days + "일");
		
	}

}
