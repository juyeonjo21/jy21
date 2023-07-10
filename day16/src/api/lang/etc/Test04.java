package api.lang.etc;

import java.io.IOException;

public class Test04 {
	public static void main(String[] args) throws IOException {
		//Runtime 클래스
		// = 직접 객체 생성은 안되지만, "생성 명령"을 사용할 수 있도록 구성
		// = 생성 방법을 제작자가 원하는 방향대로 진행하기 위해 이와 같이 구성
		// = 경우에 따라 객체 개수 제한, 객체에 설정하는 정보 제한 등.. 다양한 목적이 있다.
		
		//Runtime rt = new Runtime(); //직접생성
		Runtime rt = Runtime.getRuntime(); //생성의뢰
		
		//메소드
		//rt.exec("실행할 명령"); -> 운영체제로 명령을 쏨
		//rt.exec("notepad"); //메모장(window) -> 에러. 이게 실행이 될지 불분명. 윈도우에서만 되기 때문.(맥일 수도 있으니까)
		//-> throws IOExeption 하면 에러 사라지고 명령한 게  켜짐
		//rt.exec("calc"); //계산기(window)
		//rt.exec("mspaint"); //그림판(window)
		rt.exec("cmd /c start https:// www.google.com");
		

		
		
		
	}

}
