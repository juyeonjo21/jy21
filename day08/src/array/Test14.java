package array;
import java.util.Random;

public class Test14 {

	public static void main(String[] args) {
		Random r = new Random();
		//[Q] 카드섞기 랜덤
		int[] data = new int[] {30, 50, 20,10, 40}; // 0-1-2-3-4
		
		
		int index = 0;
		
		for(int i = 0; i < data.length; i ++) {
			int card = r.nextInt(data[i]);
		    index = r.nextInt();
				
			
			
			System.out.println(i);	
			}
		
		
		/*	int maxIndex = 0; //0번 위치가 가장 크다고 가정!
		for(int i = 1; i < data.length; i ++) { //1부터 쓰기
			if(data[maxIndex] < data[i] ) { 
				//위치를 갈아엎는다.  * 더큰숫자 = 맥스보다 큰 배열 값
				maxIndex = i;*/
		}
}
