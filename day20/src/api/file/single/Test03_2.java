package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Test03_2 {
	public static void main(String[] args) throws IOException {
		//파일 복사 프로그램
		//준비물 : 입력용파일 + 스트림, 출력용파일 + 스트림
		File a = new File("sample" , "copy.txt");	//절대경로(absolute path)
		FileOutputStream stream = new FileOutputStream(a);
		
		File b = new File("D:/" , "origin.txt");	//상대경로(relative path)
		FileInputStream stream2 = new FileInputStream(b);
		
		// -1이 들어가면 그만두도록 처리
		long count = 0L;
		long total = b.length();
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		

		while(true) {
		int f = stream2.read();
			if(f == -1) break;
			stream.write(f);
			count++;
			double percent = count * 100d / total;
			System.out.println(count + "/" + total + "("+ fmt.format(percent)+ "%)");

			
		}
		stream.close();
		stream2.close();
 }

}
