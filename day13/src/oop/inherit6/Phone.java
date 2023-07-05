package oop.inherit6;
//최상위 클래스
public class Phone {
	//공통 필드 - 접근제한(별 이유 없으면 protected)
	protected String number;
	protected String color;
	//setter & getter
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//공통메소드
	public void call() {
		System.out.println("전화 실행");
	}
	public void sms() {
		System.out.println("문자 실행");
	}
	//생성자
	public Phone(String number, String color) {
		this.setNumber(number);
		this.setColor(color);
	}
	//출력메소드 - 재정의 금지 처리(final)
	public final void show() {
		System.out.println("< 휴대폰 정보 >");
		System.out.println("번호 : " + number);
		System.out.println("색상 : " + color);

	}
}
		
	

