package loop;

public class Test06 {
	public static void main(String[] args) {
		//반복 범위의 변화를 줘서 다양한 반복을 구현
		//[Q] 10부터 0까지 숫자가 줄어들며 출력하도록 구현
		
		for(int i = 10; i >= 0; i -- ) {
			System.out.println("i = " + i);
		}
		//[Q] 10분의 1씩 줄어들며 출력하는 반복문 구현
		for(int i = 12345; i >0; i /= 10) { //i = i/10
			System.out.println(i);//숫자가 한개씩 빠져서 줄어듬 12345 1234 123 12 1
			//System.out.println(i % 10); //한자리로 줄어들면서 출력됨 5 4 3 2 1
		}
		//[Q]두 배씩 늘어나는 반복문 구현
		for(int i = 1; i <= 1000; i *= 2) { //*= 출력된 숫자에서 두배씩 늘어나게 함 
			System.out.println(i);
			}
		}

}
