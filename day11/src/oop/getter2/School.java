package oop.getter2;

public class School {
	//멤버 필드
	String name;
	int level;
	int korean, english, math;
	
	//멤버 메소드
	void setName(String name) {
		this.name = name;
	}
	void setLevel(int level) {
		if(level >= 1 && level <= 6 ) {
		this.level = level;
	}
	}
	void setKorean(int korean) {
		if(korean >= 0 && korean <= 100 ) { //보통 우리가 쓰던 코드
		this.korean = korean;
	}
	}
	void setEnglish(int english) {
		if(english < 0 || english > 100 ) return;   //*자주쓰임
		this.english = english;
	}
	void setMath(int math) {
		if(!(math >= 0 && math <= 100 )) return;   //색다른 방법 써보기
		this.math = math;
	}
	
	String getName() {
		return this.name;
	}
	int getLevel() {
		return this.level;
	}
	int getKorean() {
		return this.korean;
	}
	int getEnglish() {
		return this.english;
	}
	int getMath() {
		return this.math;
	}
	int getTotal() {
		//return this.korean + this.english + this.math;   -> 맞긴 함
		return this.getKorean() + this.getEnglish() + this.getMath();
	}
	double getAverage() {
		return (double)this.getTotal() / 3;  //= return this.getTotal() / 3.0; 같음
	}
	String getGrade() {
		double average = this.getAverage();
		if(average >= 90)   //어차피 100이상은 못 들어오니까 100이라고 적지 않음. 당연한거임
			return "A";
		else if(average >= 80 ) //괄호 없애고 단축해서도 많이 씀.
			return "B";
		else if(average >= 70 )
			return "C";
		else {
			return "F";
		}
	}
	
	void setup(String name, int level, int korean, int english, int math) {
		this.setName(name);
		this.setLevel(level);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
		//this math = math; 이렇게 쓸 거면 setter메소드를 만든 의미가 없음. 꼭 set 메소드 쓰기

	}
	
	void show() {
		System.out.println("< 학생 성적 정보 >");
		System.out.println("이름 : " + this.name);
		System.out.println( this.level + " 학년" );

		System.out.println("국어점수 :  " + this.korean + " 점" );
	    System.out.println("영어점수 : " + this.english + " 점" );
	    System.out.println("수학점수 : " + this.math + " 점" );
	    System.out.println("총점 : " + this.getTotal() + " 점");
	    System.out.println("평균 : " + this.getAverage() + " 점");
	    System.out.println("등급 : " + this.getGrade() + " 점");

	}
}
