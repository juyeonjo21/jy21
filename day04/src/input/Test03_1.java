package input;

import java.util.Scanner;

public class Test03_1 {
	public static void main(String[] args) {
		//사용자에게 다음 정보를 입력받아 '총점(tot)'과 '평균(avg)'을 구하여 출력
		//국어점수(kor)
		//영어점수(eng)
		//수학점수(mat)
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		sc.close();
		
		//계산
		int tot = kor + eng + mat;
		float avg = (float)tot / 3;
		//float avg = tot / 3f; 이렇게 써도 되지만 가급적 (float) 써주기.
		
		//출력
		System.out.println("총점 = " + tot );
		System.out.println("평균 = " + avg );
		
	}

}
