package api.util.random;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		//여러가지 Random의 명령들
		Random r = new Random();
		
		System.out.println(r.nextBoolean());
		System.out.println(r.nextInt());
		System.out.println(r.nextLong());
		System.out.println(r.nextFloat());  //0이상 1미만으로 나옴
		System.out.println(r.nextDouble()); //0이상 1미만으로 나옴
		System.out.println(r.nextGaussian()); //정규분포 -> 가운데가 많이 나오는 (-1 ~1 사이가 66.6%로 나옴)
		
	}

}
