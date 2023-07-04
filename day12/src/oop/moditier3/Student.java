package oop.moditier3;

//필드 - private / 클래스 - public
public class Student {
	private String name;
	private int score;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student() {}  //기본 생성자
}
