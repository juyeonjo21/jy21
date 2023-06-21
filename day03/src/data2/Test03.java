package data2;

public class Test03 {
	public static void main(String[] args) {
		//KH주유소에서는 휘발유를 1L에 1530원에 팔고 있습니다.
		//50000원 주유했을 때 주유되는 휘발유의 양을 출력하세요.
		
		int price = 1530;
		int pay = 50000;
		
       double liter = (double) pay / price;
       //float - double 섞어쓰지말기.
		System.out.println(liter);
		
	}

}
