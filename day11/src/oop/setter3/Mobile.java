package oop.setter3;

public class Mobile {
	
	String phone; //이름
	String telecom; //통신사
	int price; //가격
	int contract; //약정 개월
	
	void setPhone(String phone) {
		this.phone = phone;
	}
	
	void setTelecom(String telecom) {
		switch(telecom) {
		case "SK":   //소문자는 안됨.
		case "KT":
		case "LG":
			this.telecom = telecom;
		}
	}
	
	void setPrice(int price) {
		if(price < 0 ) {   //차단 조건을 적는 것이 더 쓸 일이 많음. (*0보다 작으면 차단해라)
			return;
		}
		 this.price = price;
		}
	
	
	void setContract(int contract) {
		switch(contract) {
		case 0: case 24: case 36:
			this.contract = contract;
		}
	}
	
	//메소드 오버로딩(method overloading)** 중요함
	void setup(String phone, String telecom, int price) { 
		this.setup(phone, telecom, price, 0);
	}
	void setup(String phone, String telecom, int price, int contract) {
		this.setPhone(phone);
		this.setTelecom(telecom);
		this.setPrice(price);
		this.setContract(contract);
	}
	
	void show() {
		System.out.println("< 휴대폰 판매 정보>");
		System.out.println("이름 : " + this.phone);
		System.out.println("통신사 : " + this.telecom);
		
		if(this.contract == 0) { //약정이 없다면
			int discount = this.price * 5 / 100;    //약정 없을 때 5% 할인 적용
			int result = this.price - discount;
			System.out.print("가격 : " + result + " 원" );
			System.out.println("(원가 " + this.price+ " 원)" );
		}
		else {//약정이 있다면
		int contractPrice = this.price / this.contract;
		System.out.print("판매가 : " + this.price + " 원" );
		System.out.println("(월 " + contractPrice + "원)" );
	}
		
		if(this.contract == 0 ) {
			System.out.println("약정 없음");
		}
		else {
			System.out.println("약정 기간 : " + this.contract + " 개월" );
	
		}
 }
}
