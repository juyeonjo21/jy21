package array;

public class Test11 {
	public static void main(String[] args) {
		//[Q] 5명의 키 데이터가 다음과 같을 때 가장 키가 작은 사람의 위치와 값을 출력
		//-데이터 : 150.8 / 180.2 / 175.9 / 162.7 / 170.3
		
		double[] data = new double[] {150.8 , 180.2 , 175.9 , 162.7 , 170.3};
		//length = 5
		
		int maxLow = 0;  //위치는 double (x) int(정수) 다
		for(int i = 1; i < data.length; i ++ ) {
			if(data[maxLow] > data[i] ) {
				maxLow = i;
			}
		}
		System.out.println("가장 작은 키 위치 : " + maxLow );
		System.out.println(" 가장 작은키 값 : " + data[maxLow] );
	}

}
