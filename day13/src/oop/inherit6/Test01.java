package oop.inherit6;

public class Test01 {
	public static void main(String[] args) {
		
		Galaxy23s p1 = new Galaxy23s("010-1234-5678", "실버");
		p1.show();
		p1.call();
		p1.sms();
		p1.samsungPay();
		p1.bixby();
		
		GalaxyFold4 p2 = new GalaxyFold4("010-1233-5566", "블랙");
		p2.show();
		p2.call();
		p2.sms();
		p2.samsungPay();
		p2.iris();
		
		Iphone13 p3 = new Iphone13("010-1111-2222","핑크");
		p3.show();
		p3.call();
		p3.sms();
		p3.siri();
		p3.itunes();
		
		Iphone14 p4 = new Iphone14("010-1122-3344","레드");
		p4.show();
		p4.call();
		p4.sms();
		p4.siri();
		p4.faceTime();
		
		
		
	}

}
