package api.lang.string;

public class Test07 {
	public static void main(String[] args) {
		//문자열 편집
		//= 주어진 문자열을 원하는 목적에 맞게 변형
		//= 문자열은 불면이므로 편집하면 신규 문자열이 생김
		
		//대소문자 변환(->이것도 편집으로 본다)
		String url = "HTTP://WWW.NAVER.COM";
		System.out.println(url.toLowerCase()); //소문자로 변형(신규 문자열 생성)-주소를 바꾸는 건 아님
		
		System.out.println(url);
		url = url.toLowerCase();
		System.out.println(url);
		
		url = url.toUpperCase(); //대문자
		System.out.println(url);

		//불필요한 공백 제거(=유의미한 첫글자 '앞'과 마지막글자 '뒤')
		String google ="                         http://google.com        "; //단순 띄어쓰기를 지우는 것이 아닌
		
		//공백 제거하는 명령 2가지
		System.out.println(google.trim()); //=아스키코드 공백만 제거(기존)
		System.out.println(google.strip());// = 유니코드 공백도 제거(신규) -java 구버전엔 strip 없음.
		
		//문자열 치환(찾아바꾸기)
		String line = "나는 피자가 좋아요";
		System.out.println(line.replace("피자", "자바"));
		System.out.println(line.replace("피자", "자바").replace("좋아", "싫어"));
		
	
	
	
	}

}
