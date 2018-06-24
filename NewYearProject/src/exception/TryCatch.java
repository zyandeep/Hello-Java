// exception handling using try-catch

/**
 * print() and println() methods displays a primitive data type.
 * if the argument is non-primitive type(object) than the object's toString() method is called implicitly 
 */

package exception;

import java.util.Random;

public class TryCatch {

	public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0;
		Random r = new Random();
		
		for(int i = 0; i<10; i++) {
			b = r.nextInt(10);
			c = r.nextInt(10);
			
			try {
				a = 10 / (b / c);	
			}
			catch( ArithmeticException ae) {
				a = 0;
				
				// if the reference is an argument than the println() will display description of the exception  
				System.out.println(ae);
			}
			
			System.out.println("a = " + a);
			
		}
		
	}
}
