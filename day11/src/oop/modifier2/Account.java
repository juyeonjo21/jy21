package oop.modifier2;

//적금계좌 클래스 풀이
public class Account {
	//멤버필드
	private String name; //예금주
	private int year; //납입기간
	private int count; //납입회차
	private int pay; //월 납입금
	private int balance; //총 잔액   *금액이 20억이 넘어가면 long 써야함
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getYear() {
		return year;
	}
	void setYear(int year) {
		switch(year) {
		case 1: case 2: case 3: case 5: case 10:
			this.year = year;
		}
	}
	int getCount() {
		return count;
	}
	void setCount(int count) {
		if(count < 1) return;
		if(count > this.getTotalCount()) return;
		this.count = count;
	}
	int getPay() {
		return pay;
	}
	void setPay(int pay) {
		if(pay <= 0 ) return;
		this.pay = pay;
	}

	int getBalance() {
		return balance;
	}
	void setBalance(int balance) {
		if(balance <= 0 )return;
		this.balance = balance;
	}
	public int getMonth() {
		return this.year * 12;
	}
	public int getTotalCount() {
		return this.getMonth() + 1;
	}
	//만기인지 아닌지 판정하는 메소드
	//*참고 - 논리가 반환값인 getter 메소드는 get이 아니라 is로 시작하게 작명
	public boolean  isFinish() {
//		if(this.getTotalCount() == this.getCount()) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return this.getTotalCount() == this.getCount();   //위 코드랑 같은 뜻임
		//판정해서 알아서 반환해라
	}
	
	
	public void show() {
		System.out.println("<KH 내집마련 적금통장 가입자 정보>");
		System.out.println("예금주 : " + this.name);
		System.out.println("총 납입기간 : " + this.year + " 년" + " (   +개월)");
		System.out.println("현재 납입회차 : " + this.count + " 회차");
		System.out.println("월 납입금액 : " + this.pay + " 원");
		System.out.println("총 잔액 : " + this.balance + " 원" );
		
		if(this.isFinish()) {
			System.out.println(" *해당 적금은 만기되었습니다* ");
		}
		System.out.println();
	}
	
	//생성자
	public Account(String name, int year, int pay ) {
		this(name, year, pay, 1, 0);
	}
	public Account(String name, int year, int pay, int count, int balance ) {
		this.setName(name);
		this.setYear(year);
		this.setPay(pay);
		this.setCount(count);
		this.setBalance(balance);
		
	}

}
