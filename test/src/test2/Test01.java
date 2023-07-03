package test2;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		//[빙고판 복습]
		//=랜덤한 위치*에 1부터 숫자를 배치하는 형태
		int [][] bingo = new int[5][5];
		
		Random r = new Random();
		for(int n = 1; n <=25; n++ ) {
		int x = r.nextInt(5);
		int y = r.nextInt(5);
		if(bingo[x][y] == 0 ) { //처음 넣는 자리라면 = 0의 자리면 숫자가 들어간 적 없을테니까*
		bingo[x][y] = n;
		}
		else {
			n--;
		}
		
	}
		
		for(int i = 0; i < bingo.length; i++ ) {
			for(int k = 0; k < bingo[i].length; k++ ) {
				System.out.print(bingo[i][k]);
				System.out.print("\t");
			}
			System.out.println("\n");
			
		}
	}
}
