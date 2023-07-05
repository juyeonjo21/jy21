package oop.inherit6;

public class Samsung extends Phone{
	
	public Samsung(String number, String color) {
		super(number, color);
	} //에러 : 생성자가 있기 때문에 뜸. 

	//갤럭시 공통 기능
	public void samsungPay() {
		System.out.println("삼성페이 기능 실행");
	}

}
