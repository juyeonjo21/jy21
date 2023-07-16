package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03_1 {
	public static void main(String[] args) throws IOException {
		//파일 복사 프로그램
		//준비물 : 입력용파일 + 스트림, 출력용파일 + 스트림
		File a = new File("sample" , "copy.txt");	//절대경로(absolute path)
		FileOutputStream stream = new FileOutputStream(a);
		
		File b = new File("D:/" , "origin.txt");	//상대경로(relative path)
		FileInputStream stream2 = new FileInputStream(b);
		
		stream.write('h');
		stream.write('a');
		stream.write('v');
		stream.write('e');
		stream.write('\n');
		stream.write('a');
		stream.write('\n');
		stream.write('n');
		stream.write('i');
		stream.write('c');
		stream.write('e');
		stream.write('\n');
		stream.write('d');
		stream.write('a');
		stream.write('y');
		stream.write('\n');

		
		while(true) {
		int f = stream2.read();
			if(f == -1) break;
			stream.write(f);
		}
		stream.close();
		stream2.close();
 }

}
