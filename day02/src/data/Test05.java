package data;

public class Test05 {
	public static void main(String[] args) {
		//변수를 의미있는 이름으로 작성하여 만들기
		//변수 이름 지을 때의 규칙 - 띄어쓰기x,언더바o, 자바는 두 번째 단어 첫 글자를 대문자로 함
		//[1]문제에서 주어진 값을 먼저 저장
		int  noodlePrice = 7000; //자바는 대소문자를 구분하는 언어이므로 언더바x
		int champongPrice = 8000;
		int noodleCount = 2;
		int champongCount = 3;
		
		//[2] 1번의 데이터로 계산
		int noodleTotal = noodlePrice * noodleCount;
		int champongTotal = champongPrice * champongCount;
		int allTotal = noodleTotal + champongTotal;
		
		//[3] 1,2,번의 데이터로 문제에서 원하는 결과를 출력
		System.out.println(noodleTotal);
		System.out.println(champongTotal);
		System.out.println(allTotal);
		
		
	}

}
