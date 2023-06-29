package array2;

public class Test01 {
	public static void main(String[] args) {

		//데이터 준비
		int[] data = new int[] {30, 50, 20, 10, 40};  // 0 1 2 3 4 / 10 - 20 - 30 - 40 - 50
		
		//선택정렬 
		for(int k = 0; k < data.length -1; k++) {
	     	int minIndex = k;//k번 위치의 값이 가장 작다고 생각
		for(int i = k+1; i < data.length; i ++ ) {//뒤에 있는 데이터와 비교하여
			if(data[minIndex] > data[i]) { // 더 작은 값이 있다면
				minIndex = i; //교체!
			}
		}
		//	System.out.println("minIndex = " + minIndex );
			
			int backup = data[minIndex];
			data[minIndex] = data[k];
			data[k] = backup;
		}
		
			 //출력
			 for(int i = 0; i < data.length; i ++ ) {
				 System.out.print(data[i]);
				 System.out.print("\t");
			 }
		          System.out.println();
	}
}
		
		
