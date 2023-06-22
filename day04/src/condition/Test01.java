package condition;

public class Test01 {
	public static void main(String[] args) {
		//조건(Condition)
		
		int number = 8;
		
		//if(number가 홀수라면){
		if(number % 2 != 0 ) {
		System.out.println("홀수");
		}
		//if(number가 짝수라면){
		//if(number % 2 == 0 ) {  굳이 두 번 묻지않고 else문으로 끝내기.
		else {
		System.out.println("짝수");
		}
		
	}

}
