package oop.method6;

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
	
	void show() {
		System.out.println("< 학생 성적 정보 >");
		System.out.println(this.level + " 학년 "  + this.group + " 반 " + " 이름 : " + this.name );
		System.out.println("국어 : " + this.korean + " 영어 : " + this.english + " 수학 : " + this.math);
		
		int total = this.korean + this.english + this.math;
		System.out.println("총점 : " + total + "점");
		
		float average = total / 3f;
		System.out.println("평균 : " + average + "점");
		
		boolean pass = this.korean >= 40
				                && this.english >= 40
				                && this.math >= 40
				                && average >= 60;
	
       if(pass) {
    	   System.out.println("* 통과 ");
       }
       else {
    	   System.out.println("재평가 대상 ");
       }
	
		System.out.println();
	

		}
	}
	
	
	
	


