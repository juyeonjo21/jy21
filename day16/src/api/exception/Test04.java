package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		try { //플랜A
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액 : " );
		int money = sc.nextInt();
		
		System.out.println("인원 : " );
		int people = sc.nextInt();
		
		sc.close();
		
		int price = money / people; //1인당 정산금액
		int remain = money % people; //자투리 금액
		
		System.out.println("1인당 내야할 금액은 " + price + " 원 입니다.");
		System.out.println(remain + " 원은 저희가 지원해 드려요! ");
		}
		//catch(RuntimeException e ){
		catch(Exception e ){	// -> 예외의 아버지
		//catch(Throwable e ){ // -> 그럼 얘가 두번째로 젤 위에 클래스이기 때문에 조상클래스.
			//  -> error클래스를 갖고 있음. 기본에러는 근본적으로 프로그래머 잘못. error는 프로그램에서의 문제니까. 예외처리x
		//cath(Object e ){ ->error. 얜 안됨.
		//플랜 B. 무언가 문제가 생겼을 때
			System.err.println("프로그램 오류 발생");
		}
	}

}
