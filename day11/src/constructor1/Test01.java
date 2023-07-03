package constructor1;

public class Test01 {
	public static void main(String[] args) {
		//Student a = new Student();
		Student b = new Student("피카츄", 50);
		Student c = new Student("라이츄");
		//구현할 때 더이상 setup을 쓰지 않음. -> 생성자로 대체해서 사용
	}

}
