package condition3;

public class Test02 {
	public static void main(String[] args) {
		//switch ~ case 구문 (*if문이 더 중요한 아이)
		//비유하자면 switch = 책 , case = 책갈피 -> 끝내는 구간이 없음. 
		//끝내는 부분을 표시하는 애 = break
		
		//입력 - 월 정보
		int month = 2;
		
		switch(month) { //month에 있는 값을 토대로 실행 지점을 찾겠다.
		case 12 :
		case 1 :
		case 2 ://month가 2인 경우 실행할 곳
			System.out.println("겨울");
			break; //그만 하고 나가라!			
		case 3 : //month가 3인 경우 실행할 곳
			System.out.println("봄");
		case 4 :	
		case 5 :
			System.out.println("봄");
			break;
		case 6 :	
		case 7 :	
		case 8 :	
			System.out.println("여름");
	        break;
	    default: //else와 같은 의미
	    	 System.out.println("가을");
	       break;
		}
			

			
		}
		
	}


