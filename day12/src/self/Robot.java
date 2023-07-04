package self;

public class Robot {
	//복습 [1]
	
	public static int square(int a ) {
		return a * a;
	}
	
	public static float triangle(int width, int height) {
		return (float)width * height / 2; 
	}
	public static float circle(int radius ) {
		return square(radius)*3.14f;
	}
	

}
