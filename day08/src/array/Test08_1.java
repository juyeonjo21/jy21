package array;

import java.util.Scanner;

public class Test08_1 {
	public static void main(String[] args) {
		//[Q] 학생 5명의 시험점수를 입력받아서 저장하고 다음 문제를 푸세요.
		
		//[2] 성적우수자 점수 출력
Scanner sc = new Scanner(System.in);
		
		int[] scoreList = new int[5];
		System.out.println(scoreList.length);
		
		
		for(int i = 0; i < scoreList.length;  i++ ) {
			System.out.print("시험 점수 : ");
			scoreList[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0 ; i < scoreList.length; i++) {
			if(scoreList[1] >= 90 ) {
				System.out.println("성적 우수자 점수 : " + scoreList[1]);
			}
		}
	}
}

