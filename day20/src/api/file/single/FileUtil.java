package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileUtil {
	//파일 복사 메소드
	public static void copy(File a, File b) throws FileNotFoundException {
		FileInputStream stream2 = new FileInputStream(b);
		FileOutputStream stream = new FileOutputStream(a);

		FileUtil.copy(a, b);
		
	}
}
