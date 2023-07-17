package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
		//기존에 만든 파일 복사 프로그램을 'byte[]'을 이용하여 처리하도록 변경
		//최적의 버퍼 크기를 찾아서 설정	
		byte[] buffer = new byte[1024];
		
		File  readTarget = new File("D:/" , "origin.txt");
		FileInputStream stream = new FileInputStream(readTarget);
		
		File writeTarget = new File("sample" , "copy.txt");
		FileOutputStream stream2 = new FileOutputStream(writeTarget);
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int size = stream.read(buffer);
			if(size == -1 ) break;
			stream2.write(buffer, 0, size);
			}
		
		long end = System.currentTimeMillis();		
		long totalTime = end - start;
	
		System.out.println("실행시간 : " + totalTime + "ms" );
		

		stream.close();
		stream2.close();
		
		}
	}
