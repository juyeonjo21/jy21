package oop.method5;

public class OnlineShop {
	
	String name;
	String type;
	int price;
	boolean early;
	boolean event;
	
	void setup(String name, String type, int price) {
		this.setup(name, type, price, false, false);
	}
    void setup(String name, String type, int price, boolean early, boolean event) {
    	this.name = name;
		this.type = type;
		this.price = price;
		this.early = early;
		this.event = event;
    }	
    //void setup(String name, String type, int price, boolean event) {
 
	
	
	void show() {
		System.out.println("< 온라인 쇼핑몰 상품 정보 >");
		System.out.println("상품명 : " + this.name);
		System.out.println("분류 : " + this.type);
		
		if(this.event) {
			System.out.println("판매가 : " + this.price * 90 / 100 + "원");
			System.out.print("원가 : " + this.price + "원");
			System.out.println();
		}
		else {	
			System.out.println("판매가 : " + this.price + "원");
			
		if(this.early) {
			System.out.println("*새벽배송 가능(+ 2500 원)" );	
		}
		else {
			System.out.println("* 새벽배송 불가 " );
		}

		}	
	}

}
