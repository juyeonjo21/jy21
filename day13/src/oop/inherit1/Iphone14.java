package oop.inherit1;

public class Iphone14 {
	//필드 - 데이터 저장
	private String number; //전화번호
	private String color; //색상
	private int price; //가격
	
	//메소드 - 기능
	//setter, getter 생략
	public void call() {
		System.out.println("전화 걸기");
	}
	public void camera() {
		System.out.println("사진 찍기");
	}
	public void facetime() {
		System.out.println("영상통화");
	}
}
