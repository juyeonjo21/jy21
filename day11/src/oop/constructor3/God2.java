package oop.constructor3;

public class God2 {
	//멤버필드
	String name;
	String job;
	int level;
	
	void setName(String name) {
		this.name = name;
	}
	void setJob(String job) {
		switch(job) {
		case "전사":
		case "마법사":
		case "궁수":
		this.job = job;
		}
	}
	void setLevel(int level) { //설정하지 않으면 0 -> 1, 1 이상만  설정 가능
		if(level < 1 ) return;
		this.level = level;
	}
	String getName() {
		return name;
	}
	String getJob() {
		return job;
	}
	int getLevel() {
		return level;
	}

	void show() {
		System.out.println("<캐릭터 정보>");
		System.out.println("아이디 : " + this.name);
		System.out.println("직업 : " + this.job);	
		System.out.println("레벨 : " + this.level);
		
	}
	//생성자 = 생성 시 필요한 데이터를 강제하는 도구
	God2(String name, String job){
		this(name, job, 1);    //여기서 값을 1로 지정하면 됨*
	}
	God2(String name, String job, int level){
		this.setName(name);
		this.setJob(job);
		this.setLevel(level);	
	}
	}


