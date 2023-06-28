package array;

import java.util.Scanner;

public class Test08_3 {
	public static void main(String[] args) {
		//[Q] 학생 5명의 시험점수를 입력받아서 저장하고 다음 문제를 푸세요.

		
		//[3]우수한 성적(90점 이상)으로 통과한 학생의 점수만 출력
		Scanner sc = new Scanner(System.in);
		
		int[] scoreList = new int[5];
		System.out.println(scoreList.length);
		
		System.out.println("시험 점수 : ");
		
		for(int i = 0; i < scoreList.length;  i++ ) {
			scoreList[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println("성적 우수자 점수는 다음과 같습니다.");
		for(int i = 0; i <  scoreList.length; i++ ) {
			if(scoreList[1] < 90)
			System.out.println("성적 우수자 점수 : " + scoreList[i]);
		}
	}
}

