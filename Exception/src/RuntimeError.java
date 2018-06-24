/*
 * Illustration of run-time exception
 * Date: 29-09-13
 */

public class RuntimeError {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int c = 5;
		
		int x = a/(b-c);
		System.out.println("x = " + x);
		
		int y = a/(b+c);
		System.out.println("y = " + y);

	}

}
