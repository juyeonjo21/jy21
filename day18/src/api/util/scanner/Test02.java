package api.util.scanner;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//*결론 : .next() 계열의 명령 뒤에 .nextLine()을 쓸 경우 비어있는 명령 한 개를 넣고 쓴다.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String a = sc.next();
		
		
		System.out.print("입력 : ");
		sc.nextLine(); //엔터 처리용 명령 (버리는 애) -> next() 다음에 nextLine 쓰려면 한 번 더 써서 버리고 다음으로 넘어가기.
		String b = sc.nextLine();
		
		sc.close();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);


	}

}
