package oop.total1;

public class Time {
//종합문제 - 시간 관리
	
	private int hour;
	private int min;
	private int sec;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int minute) {
		this.min = min;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	public int getTotalTime() {
		return (hour * 60) + (min * 60) + sec;
	}
	
	
	
	public Time(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	public Time(int min, int sec) {
		this.min = min;
		this.sec = sec;
	}
	public Time( int sec) {
		this.sec = sec;
	
	}
	
	
	
	public void show() {
		System.out.println( this.getTotalTime() + " 초");
	}
	}
	

