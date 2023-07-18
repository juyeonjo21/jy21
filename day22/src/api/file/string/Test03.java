package api.file.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws IOException {
		//[Q] 콘솔 메모장 프로그램 문제
		//사용자가 "종료"를 입력할 떄까지 작성한 모든 내용을 'sample/note.kh' 파일에 저장
		// 단, 한 번의 입력은 한 줄에 저장되도록 처리
		
		File target = new File("sample", "note.kh");
		FileWriter fw = new FileWriter(target);
		BufferedWriter bw = new BufferedWriter(fw);


		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력 : ");
			String input = sc.nextLine();
			
			
		if(input.equals("종료")) break;
		
			bw.write(input);
			bw.write("\n");
			//flush를 하면 즉시 저장이 됨
			bw.flush(); //혹시나 중간에 꺼질 상황 대비
			
		}
		sc.close();
		bw.close();
	}
	
}

