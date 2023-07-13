package api.collection;

public class Person {
	private String name;
	private int age;
	private String job;
	
	public Person(String name, int age, String job ) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.matches("^[가-힣]{1,2}[가-힣]{1,5}$")) {
			this.name = name;
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 1 ) return;
	
		if(age <= 20 ) {
			System.out.println("성인");
	}	
		else  if(age <=14 && age >=19 ) {
			System.out.println("청소년");
	}	
		else if(age <= 8 && age >= 13) {
			System.out.println("어린이");
		}
		else {
			System.out.println("유아");
		}
		this.age = age;
	}

	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		if(job.matches("^[0-9a-zA-Z가-힣]$")) {
			this.job = job;
		}
		else {
			System.out.println("무직");
		}
	}
	
	
	
	public void show() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("직업 :" + this.job);
	}
}
