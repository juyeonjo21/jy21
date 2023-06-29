package array2;

public class Test02_2 {

	public static void main(String[] args) {
		//버블 정렬(Bubble sort)문제 풀이
		//큰 값을 우측으로 이동 ( 좌 -> 우 만 가능)
		
		//데이터준비
		int[] data = new int[] {30, 50, 20, 10, 40};  // 0-1-2-3-4
		
		//버블 정렬
		for(int k = data.length-2; k >= 0; k-- ) { // (k=3 -> legth값이 5니까 3되려면  legth -2하면 됨***
			for(int i = 0; i <= k; i++ ) {
				if(data[i] > data[i+1] ) {
					int backup = data[i];
					data[i] = data[i+1];
					data[i+1] = backup;
				}
			}
		}
		for(int i = 0; i < data.length; i++ ) {
		System.out.print( data[i]);
		System.out.print("\t");
		}
		
	}
}
//3-2-1-4-5
//2-3-1-4-5
//2-1-3-4-5
//1-2-3-4-5

