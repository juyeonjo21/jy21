package array2;

public class Test02_1 {

	public static void main(String[] args) {
		//버블 정렬(Bubble sort)문제 풀이
		//큰 값을 우측으로 이동 ( 좌 -> 우 만 가능)
		int[] data = new int[] {30, 50, 20, 10, 40};  // 0-1-2-3-4
		
		if(data[0] > data[1]) {
			int backup = data[0];
			data[0] = data[1];
			data[1] = backup;
		}
		if(data[1] > data[2]) {
			int backup = data[0];
			data[2] = data[1];
			data[1] = backup;
	}
		if(data[2] > data[3]) {
			int backup = data[2];
			data[2] = data[3];
			data[3] = backup;
}
		if(data[3] > data[4]) {
			int backup = data[3];
			data[3] = data[4];
			data[4] = backup;
		}
	}
}
//3-2-1-4-5
//2-3-1-4-5
//2-1-3-4-5
//1-2-3-4-5

