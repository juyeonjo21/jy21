package oop.inherit6;

//클래스에 final이 붙으면 이후에 추가 상속 불가능(여기서 상속 끝)
public class Galaxy23s extends Samsung{
	
	public Galaxy23s(String number, String color) {
		super(number, color);
	}

	public void bixby() {
		System.out.println("갤럭시23s 빅스비 기능 실행");
	}

	//[override] 마음에 안 드는 기능을 재정의
	@Override
	public void samsungPay() {
		System.out.println("갤럭시23s 삼성페이 기능 실행");
	}

	@Override
	public void call() {
		System.out.println("갤럭시23s 전화 기능 실행");
	}

	@Override
	public void sms() {
		System.out.println("갤럭시23s 문자 기능 실행");
	}	
	
	}

