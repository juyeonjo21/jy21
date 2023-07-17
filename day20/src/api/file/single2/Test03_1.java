package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Test03_1 {
	public static void main(String[] args) throws IOException {
		//기존에 만든 파일 복사 프로그램을 'byte[]'을 이용하여 처리하도록 변경
		//최적의 버퍼 크기를 찾아서 설정	
		//문제 풀이
		
		//배열준비
		byte[] buffer = new byte[1024];
		
		//대상&스트림 준비		
		File  readTarget = new File("D:/" , "origin.txt");
		FileInputStream stream = new FileInputStream(readTarget);
		
		File writeTarget = new File("sample" , "copy.txt");
		FileOutputStream stream2 = new FileOutputStream(writeTarget);
		//운영체제가 거부하는 위치인 경우
//		String home = System.getProperty("user.home");   ->getProperty 
//		File readTarget = new File(home, 가져올 경로);
//		File writeTarget = new File(home, 복사할 경로);
		
		//*구조*
		//[읽을 파일] -> readTarget -> readStream -> [프로그램] -> writeStream -> writeTarget -> [내보낼 파일]
		
		
//		long count = 0L;
//		long total = readTarget.length(); //전체 옮길 글자수   -> 확인
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int size = stream.read(buffer);
			if(size == -1 ) break; //EOF : End Of File(-1)
			stream2.write(buffer, 0, size); // 지정해줘야 파일 용량이 변하지 않음
//			double percent = count * 100d / total;
//			System.out.println(count + "/" + total + "("+ fmt.format(percent)+ "%)"); - > 확인

			}
		long end = System.currentTimeMillis();		
		long totalTime = end - start;
	
		System.out.println("실행시간 : " + totalTime + "ms" );
		
		//파일 통로 정리
		stream.close();
		stream2.close();
		
		}
	}
