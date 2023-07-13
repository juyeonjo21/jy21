package api.collection2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test02 {
	public static void main(String[] args) {
		//이번주 로또 예상 추첨번호를 구하여 출력 // *shuffle은 List에서만 됨. (Set은 Index가 없으니까)
		Random r = new Random();
		
		Set<Integer> lotto = new HashSet<>(); //오름차순으로 정렬하고 싶으면 TreeSet
		
		while(lotto.size() < 6 ) {
			int number = r.nextInt(45)+1;
	
			lotto.add(number);
		}
		System.out.println(lotto);
	}
}


