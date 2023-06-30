package oop.method3;

public class MobilePlan {
	//멤버필드
	String name, telecom;
	int price, data, call, sms;
	
	//멤버메소드
	void setup(String name, String telecom,
			int price, int data, int call, int sms){
		this.name = name;
		this.telecom = telecom;
		this.price = price;
		this.data = data;
		this.call = call;
		this.sms = sms;
	}
	
	void show() {
		System.out.println("< 요금제 정보 >");
		System.out.println("통신사 : " + this.telecom);
		System.out.println("이름 : " + this.name);
		System.out.println("월 요금 : " + this.price);
		System.out.println("데이터 : " + this.data);
		System.out.println("통화 : " + this.call);
		System.out.println("문자 : " + this.sms);


	}
}
