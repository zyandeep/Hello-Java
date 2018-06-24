/* chained exception demo using methods
 *
 * only Throwable, Error, Exception, RuntimeException classes have constructors 
 *  to support chained exception */

package exception;

public class ChaindeException2 {
	
	public static void meth() {
		
		// create an exception
		NullPointerException n = new NullPointerException("top-level exp");
		
		// add a cause( or underlying exception )
		n.initCause(  new ArithmeticException("exp cause") ) ;
		
		System.out.println("throws an chained exception by meth()..."); 		
		throw n;
	}

public static void main(String[] args) {
	
	// propagation of exception
		try {
			meth();
		}
		catch( Exception e) {
			System.out.println("exception is caught by main()..");
			
			System.out.println("\n top-level exception:   " + e);
			System.out.println("\n error message of top-level exception:  " + e.getMessage());
					
			System.out.println("\n\n underlying exception... " + e.getCause());

			// stack trace of chained exception
			System.out.println("\n\n stack trace of chained exception...\n");
			e.printStackTrace();
		}
	}

}
