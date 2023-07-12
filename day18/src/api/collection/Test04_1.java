package api.collection;

import java.util.ArrayList;
import java.util.Random;

public class Test04_1 {
	public static void main(String[] args) {
		//[Q] 이번주 로또 당첨 예상번호를 추첨하는 프로그램을 구현하고 싶습니다.
		//보너스 번호를 제외한 6개의 '1~45' 범위 내에서 중복없는 숫자를 추첨한 뒤 저장소에 저장 후 출력
		//int, long과 같은 원시형은 Generic Type을 사용할 수 없다(=null때문)
		//int -> integer
		Random r = new Random();
		
		ArrayList<Integer> lotto = new ArrayList<>();

		while(lotto.size() < 6) {
			int num = r.nextInt(45)+1;
			if( ! lotto.contains(num)) {
				lotto.add(num);
			}	
		}
		
			lotto.sort(null);
			
			System.out.println(lotto);
			
		}

	}


