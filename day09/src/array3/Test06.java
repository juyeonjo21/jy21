package array3;

import java.util.Random;

public class Test06 {

	public static void main(String[] args) {
		//[Q]빙고판 만들기
		//빙고판은 5x5 사이즈가 기본
		//빙고판은 정사각형이며 홀수 크기만 가능
		//빙고판에는 숫자가 1부터 25까지 랜덤한 위치에 배치됩니다.
		//한 칸에는 한 번의 숫자만 배치 가능합니다. 같은칸에 겹치면 재추첨*
		//빙고판ㅇ르 제작한 뒤 출력하세요
		//크기도 변경 가능하도록 업그레이드 하세요
		Random r = new Random();
		
		int[][] bingo= new int[5][5];
		
		// bingoList  --> bingoList[0]   --> [0][0][0][0][0]
		// bingoList  --> bingoList[1]   --> [0][0][0][0][0]
		// bingoList  --> bingoList[2]   --> [0][0][0][0][0]
		// bingoList  --> bingoList[3]   --> [0][0][0][0][0]
		// bingoList  --> bingoList[4]   --> [0][0][0][0][0]
		
		for(int i = 0; i < bingo.length; i++ ) {
			for(int k = 0; k < bingo.length; k++ ) {
				
				int index = r.nextInt(bingo.length);
				
				int backup = bingo[i][k];
			
				
					
				//System.out.print(bingo[i][k]);
				//System.out.print("\t");
			}
			System.out.println();
			
		}

	}
	}

