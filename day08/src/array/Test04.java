package array;

public class Test04 {
	public static void main(String[] args) {
		//[2] 자바, 파이썬, 루비를 저장하기 위한 배열을 생성하고 저장한 뒤 출력
		//생성
		//data ----> [ null ][ null ][ null ] *null이 초기값이다.
		//***배열은 범위이기 때문에 int와 다르게 반복문에 쓸 수 있음.
		//*** 데이터의 양이 많아질수록 쓰기 좋음.
		
		String[] data = new String[3];
		
		//입력
		data[0] = "자바";
		data[1] =  "파이썬";
		data[2] = "루비";

		//출력
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);

	}

}
