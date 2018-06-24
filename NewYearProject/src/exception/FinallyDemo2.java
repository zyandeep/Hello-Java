// demo of finally block's execution

package exception;

public class FinallyDemo2 {

	static void meth1() {
		System.out.println("exception is thrown!");

		try {
			throw new RuntimeException("runtime error");

		} finally {
			System.out.println("meth1's finally");
		}

	}

	static void meth2() {

		// finally executes before meth2's return
		try {
			System.out.println("meth2() uses return statment ");
			return;
			
		} finally {
			System.out.println("meth2's finally");
		}
	}

	static void meth3() {

		// finally executes before control come to main()
		try {
			System.out.println("inside meth3() ");
			
		} finally {
			System.out.println("meth3's finally");
			
		}
	}

	public static void main(String[] args) {

		try {
			meth1();

		} catch (Exception e) {
			System.out.println("Exception caught");
			System.out.println("error\t" + e);
		}

		meth2();
		meth3();

	}

}
