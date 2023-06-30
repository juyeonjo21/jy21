package oop.method6.copy;

public class Student {
	
	int level;
	int group;
	String name;
	int korean, english, math;

	
	void setup(int level, int group, String name, int korean, int english, int math) {
			this.level = level;
			this.group = group;
			this.name = name;
			this.korean = korean;
			this.english = english;
			this.math = math;
	}
	
	//(문제점) show에서 너무 많은 일을 하고 있다
	//(해결책)계산을 메소드가 할 수 있도록 추가 메소드 생성
	
	//[1] 총점을 구해주는 메소드
	//(참고) return 키워드는 "반환"과 "종료"의 의미를 가지는 키워드
	//(참고) void 키워드는 "결과물이 없음" 이란 의미를 가지는 키워드
	int getTotal() {   //void를 쓰면 에러뜸. 
		return this.korean + this.english + this.math;
	}
	//[2] 평균을 구해주는 메소드
	float getAverage() {
		return this.getTotal()/3f;
	}
	//[3] 합격 / 불합격 판정하는 메소드
	boolean getPass() { //void가 아니고 쓰고자하는 애를 써준다
		return this.korean >=40 && this.english >= 40 && this.math >=40
				          && this.getAverage() >= 60;
	}
	
	
	
	void show() {
		System.out.println("< 학생 성적 정보 >");
		System.out.println(this.level + " 학년 "  + this.group + " 반 " + " 이름 : " + this.name );
		System.out.println("국어 : " + this.korean + " 영어 : " + this.english + " 수학 : " + this.math);
		System.out.println("총점 : "  + this.getTotal() +  " 점");
		System.out.println("평균 : "  + this.getAverage() + " 점");
		
		//int total = this.getTotal();  //*위에 겟토탈 메소드를 만들어뒀으니 불러와서 쉽게 쓸 수 있다.
		System.out.println("총점 : " + this.getTotal() + "점");
		//float average = this.getAverage();
		System.out.println("평균 : " + this.getAverage() + "점");
	
       if(this.getPass()) {
    	   System.out.println("* 통과 ");
       }
       else {
    	   System.out.println("재평가 대상 ");
           }
	
		}
	}
	
	
	
	


