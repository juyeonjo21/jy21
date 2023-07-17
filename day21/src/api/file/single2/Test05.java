package api.file.single2;

import java.io.File;
import java.io.IOException;

public class Test05 {
	public static void main(String[] args) throws IOException {
		
//		파일 복사는 가능하지만. 디렉터리는 삭제 , 생성만 가능 *복제가 안된다.

		File a = new File("D:/test");
		File b = new File("D:/copy");

//		File a = new File("D:/teat"); //a를 복사해서 b에 넣어라
//		File b = new File("D:/copy");

		FileUtil.copy(a, b);
	}

}
