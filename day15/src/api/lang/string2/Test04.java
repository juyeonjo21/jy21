package api.lang.string2;

public class Test04 {
	public static void main(String[] args) {
		
		String id = "wndus0201";
		
		String regex = "^[a-z][a-z0-9\\-_]{4,19}&"; //역슬러시 하나만 못씀
		

		if(id.matches(regex)) {
			System.out.println("멋진 아이디네요!");
		}
		else {
			System.out.println("5~20자의 영문 소문자,숫자와 특수기호(- ), (_)만 사용 가능합니다.");
		}

	}


}
