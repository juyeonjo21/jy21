package api.file.single2;

import java.io.File;

public class Test04 {
	public static void main(String[] args) {
		
//		파일 삭제는 가능하지만 디렉터리는 비어있는 것만 삭제가 가능
//		File target = new File("D:/깃허브사진.jpg");
//		target.delete();
		
		File target = new File("D:/dummy");
//		target.delete();
		
		FileUtil.delete(target);
	}

}
