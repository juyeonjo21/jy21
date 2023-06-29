package array2;

public class Test02 {

	public static void main(String[] args) {
		//버블 정렬(Bubble sort)
		//-인접한 두 항목을 비교하여 교체하며 정렬하는 방식
		//-큰 데이터가 좌측에 있으면 교체, 아니면 통과
		int[] data = new int[] {30, 50, 20, 10, 40};  // 0-1-2-3-4
		
		int maxIndex = 1;
		for(int i = 1; i <= 4; i++ ) {
			if(data[maxIndex] < data[1+1])
				maxIndex = i;
		}
		System.out.println("maxIndex = " + maxIndex );

		int backup = data[maxIndex];
		data[maxIndex] = data[1+1];
		data[1+1] = backup;
		
		for(int i = 0; i  < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
		
	}

}


//3-2-1-4-5
//2-3-1-4-5
//2-1-3-4-5
//1-2-3-4-5

