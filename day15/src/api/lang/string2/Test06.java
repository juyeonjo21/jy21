package api.lang.string2;

public class Test06 {
	public static void main(String[] args) {
		//반드시 1개를 포함해야 하는 경우에 대한 검사
		//비밀번호 검사 예제
		
		String password = "Khuser!!!!";
		
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,16}$";
		
		System.out.println(password.matches(regex));
	}
}


//^[A-Za-z0-9!@#$]{8,16}$ -> true가 나오긴 하지만 맞진 않음.