package array3;

import java.util.Random;

public class Test05_2 {

	public static void main(String[] args) {
		//주사위를 5번씩 6회 던진 결과를 저장한 뒤
		//[1] 회차별 주사위 던진 결과를 출력하시고
		//[2] 모든 주사위 값의 평균을 출력하세요
		 // 1 2 3 4 5 6 = 5 / * 6
		//[6][5]
		Random r = new Random();
		
		int[][] diceList = new int[6][5];   //[횟수] [개수]
		
		// diceList  -->  diceList[0]  --> [0][0][0][0][0][0]
		// diceList  -->  diceList[1]  --> [0][0][0][0][0][0]
		// diceList  -->  diceList[2]  --> [0][0][0][0][0][0]
		// diceList  -->  diceList[3]  --> [0][0][0][0][0][0]
		// diceList  -->  diceList[4]  --> [0][0][0][0][0][0]
		// diceList  -->  diceList[5]  --> [0][0][0][0][0][0]
		
		for(int i = 0; i < diceList.length; i++) {		//i=0회차* 5
			for(int k = 0; k < diceList[i].length; k++ ) { //k=0번* 4
				diceList[i][k] = r.nextInt(6) +1 ;
			}
		}
		//합계와 개수를 구하면 평균을 구할 수 있다
		int total = 0;
		int count = 0;
		
		for(int i = 0; i < diceList.length;  i++ ) {
			for(int k = 0; k < diceList[i].length; k++) {
				total += diceList[i][k];
				count++;
			}
		}
		//회차별 평균 계산
		//= 합계을 저장할 변수가 "회차" 개수만큼 있어야 한다
		int[] totalList = new int[diceList.length]; // = 6회차니까 숫자대신 length를 넣어서 써줌
		float[] averageList = new float[diceList.length];
		
		for(int i = 0; i < diceList.length; i++) {
			for(int k = 0; k < diceList[i].length; k++ ) {
				totalList[i] += diceList[i][k];
			}
			averageList[i] = (float)totalList[i] / diceList[i].length;
		}
		for(int i = 0; i < averageList.length; i++) {
			System.out.println((i+1) + "회차평균 = " + averageList[i]);
		}
		
		//출력
		for(int i = 0; i < diceList.length; i++) {
			for(int k = 0; k < diceList[i].length; k++ ) {
				System.out.print(diceList[i][k]);
				System.out.print("\t");
			}
			System.out.println();
			
		}
	}
}
		


