package api.file.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Test02 {
	public static void main(String[] args) throws IOException {
		//[Q] 이번주 로또번호를 예상한 결과를 'sample/lotto.kh' 파일에 객체 출력
		
		List<Integer> lotto = List.of(5, 12, 13, 17, 33, 41);
		
		File target = new File("sample/lotto.kh");
		
		FileOutputStream stream = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(stream);
		ObjectOutputStream obj = new ObjectOutputStream(buffer);
		
//		while(lotto.size() < 6 ) {
//			int number = 
//			if(! lotto.contains(number)) {
//				lotto.add(number);
//			}
//		}
		obj.writeObject(lotto);
		
		obj.close();
		
	}

}
