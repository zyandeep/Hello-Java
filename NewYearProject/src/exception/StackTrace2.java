/**  stackTrace displays type of exception object, method where the
	 exception occurred, source file name and the line number of the 
     error statement 
****/

package exception;

public class StackTrace2 {

	public static void main(String[] args) {
		errorDemo();
	
	}
	
	static void errorDemo() {
		int d = 0;
		int a = 42 / d;
		
		System.out.println("a = " + a);
	}

}
