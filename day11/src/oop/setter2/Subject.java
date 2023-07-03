package oop.setter2;

public class Subject {
	
	String title; //강좌명
	int time; //강의시간
	int price; //수강료
	String type; //구분
	
	//강좌명 별도 조건 없음, 강의시간은 30시간 단위로만, 수강료는 음수 x, 구분은 온,오프,혼합 세가지
	
	void setTitle(String title) {
		this.title = title;
	}
	void setTime(int time) {
		if(time > 0 && time % 30 == 0) {
			this.time = time;
		}
	}
	/*void setPrice(int price) {
		if(price >= 0 ) {
		this.price = price;
	}
}*/ //(= 둘 다 같은 코드지만 밑엔 조건이 더 많은 경우 사용하기 좋다)
	void setPrice(int price) {
		if(price < 0) {
			return; //반환은 없지만 중지하세요!
		}
		this.price = price; //조건이 많을 때 사용
	}
	void setType(String type) {
		switch(type) {
		case "온라인":
		case "오프라인":
		case "혼합":
			this.type = type;
		}
	}
	void setup(String title, int time, int price, String type) {
		this.setTitle(title);
		this.setTime(time);
		this.setPrice(price);
		this.setType(type);
	}
	
	void show() {
		System.out.println("< 강좌 정보 >");
		System.out.println("이름 : " + this.title);
		System.out.println("시간 : " + this.time);
		System.out.println("가격 : " + this.price);
		System.out.println("구분 : " + this.type);



	}
	}

