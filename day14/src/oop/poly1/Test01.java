package oop.poly1;

public class Test01 {
	public static void main(String[] args) {
		
		int type = 2;
		int action = 1;
		
		//NoteBook note book  = 맥북객체 or 갤럭시북객체;
		NoteBook notebook;
		if(type == 1) {
			notebook = new MacBook(); //맥북 -> 노트북 (업캐스팅)
		}
		else {
			notebook = new GalaxyBook(); //갤럭시북 -> 노트북 (업캐스팅)
		}
		
		//notebook에 들어간 객체의 기능을 실행
		if(action == 1) {
			notebook.power();
		}
		else if(action == 2) {
			notebook.video();
		}
		else {
			notebook.typing();
		}
		
		
		
		
/*		NoteBook a = new NoteBook("맥북");
		a.power();
		a.video();
		a.typing();
		
		NoteBook b = new NoteBook("갤럭시북");
		b.power();
		b.video();
		b.typing();
		
*/		
	}

}
