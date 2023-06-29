package array3;

public class Test03_1 {

	public static void main(String[] args) {
		//[Q] 다음 데이터를 2차원 배열 *초기화 후 저장하고 출력
		//  1.5/2.5f/3.6f
		// 10.2f/5.3f/6.5f
		
		//[1]
		 float[][] decimal = new float[][] {
			 {1.5f, 2.5f, 3.6f},
			 {10.2f,5.3f,6.5f}
		 };
		
	
		System.out.print(decimal[0][0]+"f" + "\t");
		System.out.print(decimal[0][1]+"f" + "\t");
		System.out.print(decimal[0][2]+"f" + "\t");
		System.out.println();
		
		System.out.print(decimal[1][0]+"f" + "\t");
		System.out.print(decimal[1][1]+"f" + "\t");
		System.out.print(decimal[1][2]+"f" + "\t");
		System.out.println();


		
	}

}
