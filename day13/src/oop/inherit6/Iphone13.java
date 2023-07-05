package oop.inherit6;

public class Iphone13 extends Apple{
	
	public Iphone13(String number, String color) {
		super(number, color);
	}

	public void itunes() {
		System.out.println("IPhone13 아이튠즈 기능 실행");
	}

	@Override
	public void siri() {
		System.out.println("IPhone13 음성 인식 기능 실행");
	}

	@Override
	public void call() {
		System.out.println("IPhone13 전화 기능 실행");
	}

	@Override
	public void sms() {
		System.out.println("IPhone13 문자 기능 실행");
	}

	
}
