package oop.method4;

public class CoffeeShopMenu {

	String name;
	String type;
	int price; //할인 전 금액이 입력되어야 함.
	boolean event; //원래 값을 입력 후에 나머지를 계산해서 넣어야 함.
	
	
	//setup의 2종류로 구현(= 메소드 오버로딩 : method overloading)
	//[1] 3개의 데이터가 들어오면 이벤트는 안 하는 걸로 생각하여 처리
	//[2] 4개의 데이터가 들어오면 이벤트 정보도 설정하는 걸로 처리
	void setup(String name, String type, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.event = false;   //원래 boolean 기본값이 false이므로 굳이 쓰진 않아도 됨.
	}
	void setup(String name, String type, int price, boolean event) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.event = event;
	}
	
	//*할인은 출력시에 넣어서 쓴다.
	void show() {
		System.out.println("< 커피숍 메뉴 정보 >");
		
		System.out.print("메뉴 이름 : " + this.name);
		if(this.event) {
			System.out.print("(행사중)");
		}
		System.out.println();
		System.out.println("분류 : " + this.type);
		
		if(this.event) { //행사중이면
			System.out.print("가격 : " + this.price*80 / 100  + "원"); //20%할인율 적용
			System.out.print("(원가 : " + this.price + "원)" );  
			System.out.println();
		}
		else { //행사중이 아니면
			System.out.println("가격 : " + this.price + "원");	
		}
		
		//System.out.println("행사 여부 : " + this.event ); true,false 같은 값은 굳이 출력될 필요 없으므로 지움


	}
}
