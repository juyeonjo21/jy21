package api.collection2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test05 {
	public static void main(String[] args) {
		//집합 연산 문제
		
		Set<String> a = Set.of("범죄도시3", "늑대사냥", "드림", "퍼펙트게임");
		Set<String> b = Set.of("파수꾼", "늑대사냥", "리바운드", "익스트랙션2", "드림");
		
		//[1] 둘 다 본 영화
		Set<String> movie = new TreeSet<>();
		movie.addAll(a);
		movie.retainAll(b);
		System.out.println("철수와 영희가 둘 다 본 영화 : " + movie);
		
		//[2] 둘 중 한명만 본 영화
		// (1) (a - b) 교집합 (b - a)
		// (2)(a 교 b) - (a 합 b) 
		Set<String> a_b = new TreeSet<>();
		a_b.addAll(a);
		a_b.removeAll(b);
		
		Set<String> b_a = new TreeSet<>();
		b_a.addAll(b);
		b_a.removeAll(a);
		
		Set<String> result1 = new TreeSet<>();
		result1.addAll(a_b);
		result1.addAll(b_a);
		System.out.println("둘 중 한명만 본 영화 : " + result1);
		
		//(2)
		Set<String> all = new HashSet<>();
		all.addAll(a);
		all.addAll(b);
		all.removeAll(movie);
		System.out.println("둘 중 한명만 본 영화 : " + all);
		
		//Set도 전체 출력이 되긴 하다
		// = 확장반복(foreach)은 가능
		
		for(String name : all ) {
			System.out.println("name : " + name);
		}
		
	}

}
