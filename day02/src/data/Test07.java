package data;

public class Test07 {
	public static void main(String[] args) {
		
		//입력
		int adultPrice = 1200 ,adultCount = 2;
		int youthPrice = 1000 ,youthCount = 0; 
		int childPrice = 500 ,childCount = 1;

		/* int adultCount =  2;
		int youthCount = 0;
		int childCount= 1; */
		
		//계산
		int adultTotal = adultPrice * adultCount;
		int youthTotal = youthPrice * youthCount;
		int childTotal = childPrice * childCount;
		
		int total = adultTotal + childTotal + youthTotal;
		
		//출력
		System.out.println(total);
		
		
		//System.out.println(adultTotal);
		//System.out.println(childTotal);
		
	}

}
