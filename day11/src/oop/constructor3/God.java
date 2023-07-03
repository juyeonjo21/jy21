package oop.constructor3;

public class God {
	
	String name;
	String job;
	int level;
	
	void setName(String name) {
		this.name = name;
	}
	void setJob(String Job) {
		switch(job) {
		case "전사":
		case "마법사":
		case "궁수":
		this.job = job;
		}
	}
	void setLevel(int level) { //설정하지 않으면 0 -> 1, 1 이상만  설정 가능
		if(level >= 1 ) {
		}
		this.level = level;
	}
	String getName() {
		return this.name;
	}
	String getJob() {
		return this.job;
	}
	int getLevel() {
		return this.level;
	}

	God(String name, String job){
		this.name = name;
		this.job = job;
	}
	God(String name, String job, int level){
		this.setName(name);
		this.setJob(job);
		this.setLevel(level);
		
		}
	
	void show() {
		System.out.println("<캐릭터 정보>");
		System.out.println("아이디 : " + this.getName());
		System.out.println("직업 : " + this.getJob() );
		System.out.println("레벨 : " + this.getLevel());
		if(level == 0 ) {
			System.out.println("레벨 : " + this.getLevel() + 1 );
			
		}
	}
	
		
	}
	
	

