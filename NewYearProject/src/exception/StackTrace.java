/** stackTrace demo in non-handled exception
 * 	date: 14/01/2014
 */

package exception;

public class StackTrace {

	public static void main(String[] args) {

		int d = 0;
		int a = 42 / d;    // this line causes exception
		
		System.out.println("a = " + a);
		
		/* 
		 * stackTrace displays type of exception object, method where the
		 * exception occurred, source file name and the line number of the 
		 * error statement
		 */

	}

}
