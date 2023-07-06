package oop.multi2;

public class Test01 {
	public static void main(String[] args) {
		Drone d = new Drone();
		d.on();
		d.off();
		d.fly();
		d.move();
		
		Airplane a = new Airplane();
		a.reservation();
		a.move();
		a.fly();
		
		Train t = new Train();
		t.reservation();
		t.move();
		
		Bus b = new Bus();
		b.move();
		
		Kickboard k = new Kickboard();
		k.on();
		k.off();
		k.move();
		
//     ---------------------------------------------------------------------------------		
		// [다운캐스팅]
		Transportation t1 = d; //업캐스팅 (객체는 1개 = new의 개수)
				
//		if(t1이 드론일 경우만){
		if(t1 instanceof Drone) {
		//Drone dd = t1; //다운캐스팅(에러)
		Drone dd = (Drone)t1; //다운캐스팅 가능
		d.on();
		d.off();
		d.fly();
		d.move();
	}
	}
}
