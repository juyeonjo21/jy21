package oop.modifier2;

public class BankBook {
	private String name; //이름
	private int period; //납입기간
	private int round; //납입회차
	private int monthPay; //월납입금액
	private int total; //총잔액
	
	public String getName() {
		return name;
	}
	public void setName(String name) { 
		this.name = name;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) { 
		switch(period) {
		case 1: case 2: case 3: case 5: case 10:

		if(period > 1 && period >= 13) {
			return;
		}
		this.period = period;
	 }
	}
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		if(round == 0 ) {
			this.round = 1;
			return;
		}
		this.round = round;
	}
	public int getMonthPay() {
		return monthPay;
	}
	public void setMonthPay(int monthPay) {
		this.monthPay = monthPay;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) { 
		if(total < 0) return;
		this.total = total;
	}
	public String getStop() {
		if(this.monthPay > this.period * 12 + 1) {
			return "만기" ;
	}
		else {
			return "만기 아님";
		}

	}
	
	
	public BankBook(String name, int period, int monthPay) {
		this(name, period, 1, monthPay, 0);	
	}
	public BankBook() {}
	public BankBook(String name, int period, int round, int monthPay, int total) {
		this.setName(name);
		this.setPeriod(period);
		this.setRound(round);
		this.setMonthPay(monthPay);
		this.setTotal(total);

	}
	
	public void show() {
		System.out.println("<KH 내집마련 적금통장 가입자 정보>");
		System.out.println("예금주 : " + name);
		System.out.println("총 납입기간 : " + period + " 년");
		System.out.println("현재 납입회차 : " + round + " 회차");
		System.out.println("월 납입금액 : " + monthPay / 10000 + " 만원");
		System.out.println("총 잔액 : " + total / 10000 + " 만원" );
		System.out.println();
		
	}
}

