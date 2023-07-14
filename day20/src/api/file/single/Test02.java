package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		//Test01에서 저장한 파일 내용을 불러오도록 구현
		
		//준비물	
		File target = new File("sample", "single.kh"); //[1] 대상 파일 객체
		FileInputStream stream = new FileInputStream(target); //[2] 입력 통로
		
		//구조
		//[프로그램] <--- [입력통로stream] <--- [파일객체target] <---- [실제 파일]
		
		int a = stream.read(); //읽어와라 //-실제로 int가 오고가는 게 아님
		System.out.println("a = " + a); //65
		
		a = stream.read();
		System.out.println("a = " + a); //66
		
		a = stream.read();
		System.out.println("a = " + a); //67
		
		a = stream.read();
		System.out.println("a = " + a); //68
	}

}
