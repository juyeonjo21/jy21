package api.file;

import java.io.File;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//파일 문제
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		String input = sc.nextLine();
		
		File a = new File(input);
		
		if(a.isFile()) {
			System.out.println("<파일 정보>");
			System.out.println("파일명 : " + a.getName());		
			
			int index = a.getName().lastIndexOf(".");
			String extension;
			if(index == -1 ) {
				extension = "없음";
			}
			else {
				extension = a.getName().substring( index + 1);
			}
			
			System.out.println("확장자 : " + extension);
			System.out.println("크기 : " + a.length() + "bytes");	
		}		
			
		if(a.isDirectory()) { //디렉터리면 목록[파일/폴더]
			File[] list = a.listFiles();
			for(File file : list ) {
				if(file.isFile()) { //파일이면
					System.out.print(" [파일] ");
				}
				else if(file.isDirectory()) { //디렉터리면
					System.out.print(" [폴더] " );
				}
				System.out.println(file.getName());
			}
		}
		else {
			System.out.println("존재하지 않는 파일 또는 폴더");
		}

		sc.close();
		}
	}
