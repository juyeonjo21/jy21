package api.lang.string;

public class Test05 {
	public static void main(String[] args) {
		//문자열 검사
		//= 전부 또는 일부분에 대한 검사를 위한 명령
		
		String nickname = "운영자입니다운영자"; // [0] [1] [2] [3] [4] [5] [6] [7] [8] 
		
		//운영자가 포함되어 있습니까? 
		System.out.println(nickname.contains("운영자")); //-> 정보 부족
		
		//운영자가 어디 있습니까? -> 글자의 시작점이 나와야 함. 배열의 처음 부분.
		//= 문자열은 배열처럼 0부터 시작하도록 구성되어 있다.
		System.out.println(nickname.indexOf("운영자")); //좌측부터 탐색
		System.out.println(nickname.lastIndexOf("운영자")); //우측부터 검색
		
		System.out.println(nickname.indexOf("없는 글자")); //존재할 수 없는 위치(=없으면 -1)
		
		//시작과 종료 글자 검사
		String url = "https://www.naver.com"; // -> 이 주소가 홈페이지냐?
		
		//http가 있는 위치가 0입니까?
		System.out.println(url.indexOf("http") == 0 );
		//http로 시작합니까?
		System.out.println(url.startsWith("http"));
		// .com으로 종료합니까?(끝 글자)
		System.out.println(url.lastIndexOf(".com") == url.length() - ".com".length()); //비추천
		System.out.println(url.endsWith(".com")); //맞는 명령어(추천)
		
		//글자의 원하는 위치 추출
		String text = "안녕하세요";
		System.out.println(text.charAt(0)); //-> 0번 위치의 글자를 추출해라 (= '안')
		
		char ch = text.charAt(0); //아스키코드 참고만(찾아 쓰긴 어려움)
		//boolean isAlphabet = (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122);
		boolean isAlphabet = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
		System.out.println("isAlphabet = " + isAlphabet);
		
		boolean isKorean =  ch >= '가' && ch <= '힣'; //'가' -> 44032 / '힣' -> 55203
		System.out.println("isKorean = " + isKorean);

		
		
	}

}
