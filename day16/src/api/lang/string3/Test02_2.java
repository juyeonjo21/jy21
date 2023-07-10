package api.lang.string3;

public class Test02_2 {
	public static void main(String[] args) {
		//문자열 덧셈 성능 측정
		
		//스톱워치
		long start = System.currentTimeMillis(); //측정시작
		
		StringBuilder buffer = new StringBuilder(); //변수명은 다른거여도 굳이 상관 없음.
		for(int i = 0; i < 100000; i++) { //StringBuffer보다 속도가 빠름.
			buffer.append("*");
		}
		String star = buffer.toString();
	
		
		long finish = System.currentTimeMillis(); //측정완료
		
		long time = finish - start;
		System.out.println("time = " + time);
	}

}
