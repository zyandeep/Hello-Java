/* chained exception demo using constructor
 *
 * only Throwable, Error, Exception, RuntimeException classes have constructors 
 *  to support chained exception */

package exception;

public class ChainedException1 {

	public static void meth() {
		System.out.println("\n a chained exception is thrown...");

		// create chained exception using constructor
		
		/* arguments to the constructor...
		 * error message of top-level exception
		 * exception cause or underlying exception
		 */
		
		RuntimeException re = new RuntimeException( "top-level exp", new ArithmeticException("exp cause") );
				
		throw re;
	}

	public static void main(String[] args) {

		System.out.println("chained exception demo using constructor...");

		try {
			meth();

		} catch (RuntimeException r) {
			System.out.println("\n\n top-level exception...\n");
			System.out.println("top-level error:   " + r);
			System.out.println("\n error message of top-level exception:  " + r.getMessage());
					
			System.out.println("\n\n underlying exception... " + r.getCause());

			// stack trace of chained exception
			System.out.println("\n\n stack trace of chained exception...\n");
			r.printStackTrace();
		}

	
		// meth();

	}

}
