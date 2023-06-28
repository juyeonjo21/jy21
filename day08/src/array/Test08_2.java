package array;

import java.util.Scanner;

public class Test08_2 {
	public static void main(String[] args) {
		//[Q] 학생 5명의 시험점수를 입력받아서 저장하고 다음 문제를 푸세요.

		
		//[3]등수 구하기
		Scanner sc = new Scanner(System.in);
		
		int[] scoreList = new int[5];
		System.out.println(scoreList.length);
		
		for(int i = 0; i < scoreList.length;  i++ ) {
			System.out.println("시험 점수 : ");
			scoreList[i] = sc.nextInt();
		}
		sc.close();
		
		int score = 75;
		int rank = 1;
		
		for(int i = 0; i <  scoreList.length; i++ ) {
			if(scoreList[1] > score )
			rank++;
	}
	System.out.println("예상 등수 = " + rank);
	
 }
}
