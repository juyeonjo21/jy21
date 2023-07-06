package api.lang.test1;

import java.util.Properties;

public class Test02 {
	public static void main(String[] args) {
		
		Properties prop = new Properties();

		//기능사용
		// key = hello , value = world
		prop.setProperty("hello", "world");
		//key = good , value = bye
		prop.setProperty("good", "bye");
		
		//-객체의 요약 정보 = toString()
		System.out.println(prop.toString());

		//- key가 hello인 value의 값을 출력하라
		String value = prop.getProperty("hello");
		System.out.println(value);
		//System.out.println(prop.getProperty("hello"));
	}

}
