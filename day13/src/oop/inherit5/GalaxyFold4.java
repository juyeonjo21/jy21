package oop.inherit5;

public class GalaxyFold4 extends Galaxy{
	//+@
	public void show() {
		System.out.println("< 휴대폰 정보 >");
		//System.out.println("번호 : " + this.number); // 나의 번호
		//System.out.println("번호 : " + super.number); //부모클래스의 번호
		System.out.println("번호 : " + number);
	}
	
	//메소드 재정의(method override)
	//- 상속받은 메소드를 똑같이 한 번 더 만들어서 내가 만든게 실행되도록 하는 것
	//- 뭔가 상속받은 메소드가 마음에 안 들 때 사용
	@Override //= annotation(어노테이션) - 역할부여(해시태그) -> 이게 있으면 이름 수정 불가, 없으면 수정 가능(이러한 역할을 갖는다) 
	public void call() {
		System.out.println("갤럭시 폴드4의 통화기능 실행!");
//		//이 사이에 코드추가 가능
//		super.call(); //상위클래스 의 콜을 불러라.
		//코드추가 가능
		
	}		
		//[생성자] 부모클래스에 생성자가 있다면 자식클래스에도 생성자가 있어야 한다
		//- 부모클래스가 필요로 하는 값을 전달해야 한다
		public GalaxyFold4(String color) {
			super(color);
		}	
	}
