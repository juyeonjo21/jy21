package array3;

public class Test03_2 {

	public static void main(String[] args) {
		// 2차원 반복문으로 출력(+length)
		
		//data ---> data[0]  ---> [0.0f][0.0f][0.0f]
	   //         ---> data[1]   ---> [0.0f][0.0f][0.0f] 
		
		 float[][] data = new float[][] {
			 {1.5f, 2.5f, 3.6f},
			 {10.2f,5.3f,6.5f}
		 };
		 
		 System.out.println(data.length); //2개
		 System.out.println(data[0].length); //3개
		 System.out.println(data[1].length);// 3
		 
		 for(int k = 0; k < data.length; k++ ) {
		 for(int i = 0; i < data[k].length; i++) {
		System.out.print(data[k][i]+"f" + "\t");
		 }
		 System.out.println();
		 
		 for(int i = 0; i <= 2; i++ ) {
		System.out.print(data[k][i]+"f" + "\t");
		 }
		 System.out.println();
		 
		 }
	}
	
		 
		 
		 
		/*System.out.print(decimal[0][2]+"f" + "\t");
		System.out.println();
		
		System.out.print(decimal[1][0]+"f" + "\t");
		System.out.print(decimal[1][1]+"f" + "\t");
		System.out.print(decimal[1][2]+"f" + "\t");
		System.out.println();*/


		
	}


