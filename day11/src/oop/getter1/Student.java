package oop.getter1;

public class Student {
	String name;
	int korean, english;
	//setter 메소드 - 값을 설정하는 메소드(+조건)
	void setName(String name) {
		this.name = name;
	}
	void setKorean(int korean) {
		this.korean = korean;
	}
	void setEnglish(int english) {
		this.english = english;
	}
	//getter 메소드
	//- 설정된 값을 반환하는 메소드
	//- 이름은 get + 필드명, 반환형은 필드의 자료형과 같다.
	//- 가상의 항목에 대해서 getter 메소드를 만들면 계산을 간소화할 수 있다.
	String getName() { //*void 쓸 수 없음. (void = 반환 값이 '없음' 의 뜻을 가짐)
		return this.name;
	}
	int getKorean() {
		return this.korean;
	}
	int getEnglish() {
		return this.english;
	}
	int getTotal() { //없는 걸 지어내서 반환 시키는 거임 (위에 total 안 만들었으니까) 있다 치고.
		//return this.total; -> 없는 걸 지어내니까 이렇게 쓸 순 없음
		return this.korean + this.english;
	}
	float getAverage() { // get + average
		//return this.average; -> 마찬가지
		return this.getTotal() / 2f;
	}
	
	void setup(String name, int korean, int english) {
		this.setName(name);
		this.setKorean(korean);
		this.setEnglish(english);
		
	}
	void show() {
		System.out.println("<성적 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("국어 : " + this.korean); // 얘넨 그냥 알아서 써도 됨.
		System.out.println("영어 : " + this.english);
		System.out.println("총점 : " + this.getTotal());
		System.out.println("평균 : " + this.getAverage()); //얘넨 반드시 게터메소드 써야함. 없는 애들이니까
    	}
	}
