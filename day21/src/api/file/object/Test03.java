package api.file.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//객체입력
		
		//준비물
		File target = new File("sample/object.kh");
		
		FileInputStream stream = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(stream);
		ObjectInputStream obj = new ObjectInputStream(buffer);

//		ObjectInputStream obj = new ObjectInputStream(
//				new BufferedInputStream(new FileInputStream(target)));
		
//		애초에 ObjectOutputStream은 아무거나(Object) 저장하도록 되어있다.
//		= 따라서 저장된 객체를 불러오면 당연히 Object 형태로 보관중
//		= 실제 저장한 형태는 개발자가 알고 있을 것이므로 '다운캐스팅'하여 사용
		Date d = (Date) obj.readObject(); //-> 저장 시각 표시
		System.out.println("d = " + d);
		
		//정리
		obj.close();
	}

}
