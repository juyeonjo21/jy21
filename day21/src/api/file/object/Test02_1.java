package api.file.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02_1 {
	public static void main(String[] args) throws IOException {
		//[Q] 이번주 로또번호를 예상한 결과를 'sample/lotto.kh' 파일에 객체 출력
		//랜덤 출력
		Random r = new Random();
		
		Set<Integer> lotto = new TreeSet<>();
		
		while(lotto.size() < 6 ) {
		lotto.add(r.nextInt(45) + 1 );

		}
	
		File target = new File("sample/lotto.kh");
		
		FileOutputStream stream = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(stream);
		ObjectOutputStream obj = new ObjectOutputStream(buffer);
		

		obj.writeObject(lotto);
		
		obj.close();
		
	}

}
