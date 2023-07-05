package oop.inherit3;

public class Browser {
	//필드
	private String URL;
	
	//setter getter 메소드
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = URL;
	}
	public void refresh() {
		System.out.println("새로고침");
	}
	
	public void move() {
		System.out.println("페이지 이동");
	}	
}

