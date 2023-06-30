package oop.method3;

public class Test01 {

	public static void main(String[] args) {
		
		MobilePlan planA = new MobilePlan();
		MobilePlan planB = new MobilePlan();
		MobilePlan planC = new MobilePlan();


		planA.setup("5G언택트 52", "SK", 52000, 200, 1000, 2000);
		planB.setup("5G세이브 ", "KT", 45000, 100, 900, 1500);
		planC.setup("5G시그니처", "LG", 130000, 500, 2000, 2500);

		planA.show();
		planB.show();
		planC.show();
		
		
	}

}
