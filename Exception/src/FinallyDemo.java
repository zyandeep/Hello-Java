/*
 * Exception handling using try-catch-finally 
 * Date: 29-09-13
 */

public class FinallyDemo {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int c = 5;
		
		try {
		
			int x = a/(b-c);
			System.out.println("x = " + x);
		
		} catch(ArithmeticException ae){
			
			System.out.println("You can't divide by zero!");
			
		} finally {
			
			System.out.println("This line will surely run");
		}
		
		int y = a/(b+c);
		System.out.println("y = " + y);
		
	}
	
}
