// nested try in method calls

package exception;

public class MethNestTry {

	static int a;
	static int b;

	public static void main(String[] args) {

		a = args.length;
		
		// this is outer try-catch set
		try {
			System.out.println("a = " + a);

			b = 42 / a;
			System.out.println("b = " + b);

			testMeth(); // nesting of try-catch starts here
		} catch (ArithmeticException ae) {
			System.out.println("outer try-catch block");
			System.out.println("error\t" + ae);
		}

	}

	static void testMeth() {
		
		// this is inner try-catch set
		try {
			if (a == 1)
				System.out.println("b  = " + 42 / ((a - a)));
			else {
				int[] c = { 1, 2, 3 };
				System.out.println(c[20]);

			}
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("inner try block");
			System.out.println("error\t" + ai);
			
		} catch (ArithmeticException z) {
			System.out.println("inner try-catch");
			System.out.println("error\t" + z);
		}

	}
}
