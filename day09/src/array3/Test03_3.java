package array3;

public class Test03_3 {

	public static void main(String[] args) {
		//[Q2]
		// '자바' '스프링' '안드로이드'
		// '파이썬' '판다스' '장고'
		
		//[2]
		String[][] data = new String[2][3];
		
		 data[0][0] = "java";
		 data[0][1] = "spring";
		 data[0][2] = "android";

		 data[1][0] = "python";
		 data[1][1] = "pandas";
		 data[1][2] = "django";

	

		 
		
		System.out.println(data[0][0]);
		System.out.println(data[0][1]);
		System.out.println(data[0][2]);
		
		System.out.println(data[1][0]);
		System.out.println(data[1][1]);
		System.out.println(data[1][2]);

	

		
	}

}
