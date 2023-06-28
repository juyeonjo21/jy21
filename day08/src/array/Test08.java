package array;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		//[Q] 학생 5명의 시험점수를 입력받아서 저장하고 다음 문제를 푸세요.
		//배열에 5개의 점수 데이터를 입력
		
		//[1]학생 5명의 시험점수 데이터를 입력
		Scanner sc = new Scanner(System.in);
		
		int[] scoreList = new int[5];
		System.out.println(scoreList.length);
		
		
		for(int i = 0; i < scoreList.length;  i++ ) {
			System.out.print("시험 점수 : ");
			scoreList[i] = sc.nextInt();
		}
		sc.close();
		
		}
	}

