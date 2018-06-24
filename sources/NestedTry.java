// nested try-catch demo

public class NestedTry {

	public static void main(String[] args) {
		int a = args.length;

		try {
			System.out.println("a = " + a);

			// if a = 0, then it cause / by zero exception
			int b = 42 / a;
			System.out.println("b = " + b);

			try {
				if (a == 1)
					b = 42 / (a - a);
				else {
					int[] c = { 1, 2, 3 };
					System.out.println(c[20]);
				}

			} catch (ArrayIndexOutOfBoundsException ai) {
				System.out.println("inner try block");
				System.out.println("error\t" + ai);

			} /*catch (ArithmeticException ae1) {
				System.out.println("inner try block");
				System.out.println("error\t" + ae1);

			}*/

		} catch (ArithmeticException ae) {
			System.out.println("outer try-catch block");
			System.out.println("error\t" + ae);
		}

	}
}
