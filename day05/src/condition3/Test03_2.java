package condition3;

public class Test03_2 {
	public static void main(String[] args) {
		//switch로 풀이(java 13 이상에서만 가능)
		int month=5;
		//입력
		int days;
		switch(month) {
		case 1 , 3, 5, 7, 8, 10, 12 : //큰달
			days = 31;
		break;
		case 4, 6, 9, 11 : //작은달
			days = 30;
		break;
		default : //28일까지 있는 2월
			days = 28;
		break;
		}
		
		//출력
		System.out.println(days + "일");
		
	}

}
