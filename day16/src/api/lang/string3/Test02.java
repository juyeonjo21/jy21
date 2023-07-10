package api.lang.string3;

public class Test02 {
	public static void main(String[] args) {
		//문자열 덧셈 성능 측정
		
		//스톱워치
		long start = System.currentTimeMillis(); //측정시작
		
		String star = "";
		for(int i = 0; i < 100000; i++) { //성능이 좋지 않음. 숫자가 커질수록 속도가 너무 느려짐.
			star += "*";
		}
		/*star += "*";
		star += "*";
		star += "*";
		star += "*";
		star += "*";*/
		
		
		long finish = System.currentTimeMillis(); //측정완료
		
		long time = finish - start;
		System.out.println("time = " + time);
	}

}
