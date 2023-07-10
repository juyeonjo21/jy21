package api.lang.string3;

public class Test02_1 {
	public static void main(String[] args) {
		//문자열 덧셈 성능 측정
		
		//스톱워치
		long start = System.currentTimeMillis(); //측정시작
		
		StringBuffer buffer = new StringBuffer();
		for(int i = 0; i < 100000000; i++) { //문자열덧셈에 비해 속도가 더 빠름. 효율적.
			buffer.append("*");
		}
		String star = buffer.toString();
	
		
		long finish = System.currentTimeMillis(); //측정완료
		
		long time = finish - start;
		System.out.println("time = " + time);
	}

}
