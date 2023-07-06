package api.lang.object;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		// 'Object는 모든 클래스의 조상이다' 에 대한 검증
		// = 모든 데이터는 Object로 업캐스팅이 가능하다
		// = 모든 데이터는 Object로 보관이 가능하다(=아무거나)
		// = 즉, 자료형을 특정할 수 없다면 Object를 써도 된다.
		
		//Object a = new Object();
		Object a = 10; //= integer  //Object와 int는 상속관계다
		Object b = "hello"; // Object와 String은 상속관계다
		Object c = new int[] {30,40,10,20,50};
		Object d = new Scanner(System.in);
		Object e = new Student(); //내가 만든 클래스도 Object를 자동으로 상속함
		
		System.out.println(b instanceof String); //b가 String 맞니?
		System.out.println(d instanceof Scanner); //d가 Scanner 맞니?
	}
}
