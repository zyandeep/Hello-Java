// explicitly exception throwing

package exception;

public class ThrowDemo {

	public static void main(String[] args) {
		try {
			meth();

		} catch (NullPointerException n) {
			System.out.println("exception is caught!");

			// print error description, i.e. type-of-error : the error message
			System.out.println("error description:\t" + n);

			// getMessage() returns string provided with the
			// NullPointerException(), i.e. the error message
			System.out.println("error message:\t" + n.getMessage());

		}

	}

	static void meth() {
		System.out.println("throws an uncheked exception...");

		// unchecked exception throws
		try {
			System.out.println("exception is thrown explicitly... ");
			throw new NullPointerException("error demo!");
			
		} catch (Exception e) {
			System.out.println("exception is caught and re-thrown!");

			// re-throw the exception
			throw e;
		}

	}

}
