// method throws checked exception

package exception;

// checked exception are io exception and its subclasses
// they are resides in java.io package
import java.io.*;

public class ThrowsDemo {

	public static void main(String[] args) {
		try {
			meth();
			
		}
		
		catch(Exception e) {
			System.out.println("checked exception is caught!");
			System.out.println("error message:\t" + e.getMessage());
		}

	}

	// method throws checked exceptions but doesn't handled it
	
	static void meth() throws IOException, Exception {
		System.out.println("throws an checked exception");
		
		// checked exception is thrown
		throw new FileNotFoundException("error demo!");
		
	}

}
