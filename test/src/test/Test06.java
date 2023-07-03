package test;

import java.util.Random;

public class Test06 {
	public static void main(String[] args) {
		//모두의 마블 문제
		//확률 구하기
		
		//주사위 2개를 1번 던지기
		Random r = new Random();
		
		int count = 0;
		int size = 100;
		
		for(int i = 0; i < size; i ++ ) {
			
		int dice = r.nextInt(6) +1 ;//
		int dice2 = r.nextInt(6)+1 ;//
	
		if(dice == dice2 ) { //주사위 두개가 같은 수가 나올 때
		//System.out.println("주사위 = " + dice + " , " + dice2 );
		   count++;
		}
	}
		System.out.println("더블이 나온 횟수 = " + count ); //카운트 측정
		double percent = (double) count/size*100;
		System.out.println("확률 = " + percent + "%");
	
		
		
		
		
		//한턴-2개 / 두개가 같은 값 = 더블! + 1 / 100턴동안 주사위 더블 총 카운트
		}
	}
