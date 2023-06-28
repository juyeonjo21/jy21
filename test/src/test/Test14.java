package test;
import java.util.Arrays;
import java.util.Random;

public class Test14 {

	public static void main(String[] args) {
			Random r = new Random();
			//[Q] 카드섞기 랜덤
			//[1]모든 자리는 1번씩 다른 위치와 바뀌어야 한다
			//[2]어디랑 섞일지 대상 위치는 모르며 같은 위치일 수도 있다
			//[3]랜덤으로 정해진 위치와 현재 위치의 데이터를 바꾸도록 구현
			int[] data = new int[] {30, 50, 20,10, 40}; // 0-1-2-3-4
			
			
			for(int i = 0; i < data.length; i ++) {
			    int randomIndex = r.nextInt(data.length); //배열 위치
			    
			    int arr = data[i];
			    data[i] = data[randomIndex];
			    data[randomIndex] = arr;
			
			    System.out.println("카드넘버 : " + data[i]);
			    System.out.println("섞인 위치 : " + randomIndex); 
			    
			}
		        System.out.println("랜덤 카드 : " + Arrays.toString(data)); 
			}
		}




