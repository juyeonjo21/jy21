package oop.modifier2;

public class BankBook {
	private String name;
	private int period;
	private int round;
	private int monthPay;
	private int total;
	
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
		this.period = period;
	}
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}
	public int getMonthPay() {
		return monthPay;
	}
	public void setMonthPay(int pay) {
		this.monthPay = monthPay;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
	if(total > 0)
		this.total = total;
	}
	
	public BankBook() {}
	public BankBook(String name, int period, int pay, int total) {
		this.setName(name);
		this.setPeriod(period);
		this.setRound(round);
		this.setMonthPay(monthPay);
		this.setTotal(total);
	}
	
	public void show() {
		System.out.println("<KH 내집마련 적금통장 가입자 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("기간 : " + this.period);
		System.out.println("납입회차 : " + this.round);
		System.out.println("납입금액 : " + this.monthPay);
		System.out.println("잔액 : " + this.total);
	}
	

}
