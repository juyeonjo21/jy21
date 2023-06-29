package array3;

public class Test03 {

	public static void main(String[] args) {
		//[Q] 다음 데이터를 2차원 배열에 저장하고 출력
		//  1.5/2.5f/3.6f
		// 10.2f/5.3f/6.5f
		
		//[1]
		 float[][] decimal = new float[2][3]; // 줄수/칸수
		
		decimal[0][0] = 1.5f;
		decimal[0][1] = 2.5f;
		decimal[0][2] = 3.6f;
		decimal[1][0] = 10.2f;
		decimal[1][1] = 5.3f;
		decimal[1][2] = 6.5f;

		
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
