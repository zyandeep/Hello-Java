// JDK 7's multi-catch feature   ( end of exception handling )

package exception;

public class MultiCatch {

	public static void main(String[] args) {

		int a = 42, b = 0;
		int[] c = { 1, 2, 3 };

		try {
			System.out.println(" main() throws two unchcked exceptions... ");

			// throws arithmetic exception
			a = a / b;

			// throws array-index-out-of-bounds exception
			System.out.println(c[10]);

		}

		// this catch block catches both exceptions
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("\n exception description:  " + e);

		}

		finally {
			System.out.println("\n After multi-catch.");
		}

	}

}
