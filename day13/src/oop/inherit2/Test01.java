package oop.inherit2;

public class Test01 {
	public static void main(String[] args) {
		Iphone13 a = new Iphone13();
		a.call(); //상속
		a.camera(); //상속
		a.siri(); //새로생성
	
		Iphone14 b = new Iphone14();
		b.call(); //상속
		b.camera(); //상속
		b.facetime(); //새로생성
		}
	}

