package api.file.single;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		//싱글 바이트 입출력
		// = 입출력 규격인 1byte에 맞는 데이터(자바로 치면 byte)
		
		//준비물
		//1. 출력할 파일 객체(프로젝트 내에 sample 폴더 안의 single.kh 파일)
		//2. 출력을 위한 통로 객체 (통로 - FileOutputStream / 객체 - File)
		// [프로그램] ---> [출력통로] ---> [파일객체] ---> [실제파일]
		//							stream			target
		
		//File target = new File("sample/single.kh");
		File target = new File("sample", "single.kh");
		
		target.createNewFile(); // 파일 생성(출력시에만 만들고 생략 가능함)
		
		FileOutputStream stream = new FileOutputStream(target); //어느 파일에 연결할거니?
		
		//stream에게 데이터를 전달
		// = byte의 유효 범위는 -128 부터 127 사이 (ASCII 코드)
		stream.write(65);  //A
		stream.write(66); //B
		stream.write(9); //\n
		stream.write('h'); //104
		stream.write('e'); //101
		stream.write('l'); //108
		stream.write('l'); //108
		stream.write('o'); //111
		stream.write('\n'); //10

		stream.write('k');
		stream.write('h');
		stream.write('a');
		stream.write('c');
		stream.write('a');
		stream.write('d');
		stream.write('e');
		stream.write('m');
		stream.write('y');

		//모든 작업을 마치고 연결 종료
		stream.close();


	}

}
