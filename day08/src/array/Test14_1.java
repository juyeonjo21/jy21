package array;
import java.util.Arrays;
import java.util.Random;

public class Test14_1 {

	public static void main(String[] args) {
		Random r = new Random();
		//[Q] 카드섞기 문제 풀이*
		
		//데이터 준비
		int[] data = new int[] {30, 50, 20, 10, 40}; // 0-1-2-3-4
		
		//셔플(뒤섞기)
		//-같은자리 제거
		//-같은 자리가 나오면 다시 뽑아라
		//-같은 자리가 나오면 하던 작업을 무효화시켜라
		for(int i = 0; i < data.length; i++ ) {
		//[i] <---->[0~4]
		int index = r.nextInt(data.length);
		
		if(i ==  index ) { //같은 자리가 나왔다면
			i--;
			continue;
		}
		
		
		int backup = data[i];  //data [  ] 이 자리만 채우면 위치를 계속 바꿀 수 있음
		data[i] = data[index];
		data[index] = backup;
		}	
		
		//출력
		for(int i = 0; i < data.length; i++ ) {
			System.out.println(data[i]);
			
		}
		
		}
	}





