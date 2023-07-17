package api.file.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Set;

public class Test04 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Test02에서 저장한 로또번호를 읽어와서 순차적으로 출력
		
		File target = new File("sample/lotto.kh");
		
		FileInputStream stream = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(stream);
		ObjectInputStream obj = new ObjectInputStream(buffer);
		
		@SuppressWarnings("unchecked") //경고 무시해라
		Set<Integer> lotto = (Set<Integer>) obj.readObject();
		
		obj.close();
	
		for(int number : lotto) {
			System.out.println(number);
		}
	}

}
