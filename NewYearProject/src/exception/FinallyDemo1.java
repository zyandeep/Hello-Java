// finally block demo 1

package exception;

public class FinallyDemo1 {
	
	/* finally block will always execute; whether exception has occurred or not.
	 * finally doesn't handle error.
	 * finally block is used to write some clean-up codes  */
	
	public static void main(String[] args) {
		try {
			int a = 0;
			System.out.println("a = " + (42 / a));
			
		} catch (Exception e) {
			System.out.println("error\t" + e);
			
		} finally {
			System.out.println("finally block will run for sure!");
			
		}

	}

}
