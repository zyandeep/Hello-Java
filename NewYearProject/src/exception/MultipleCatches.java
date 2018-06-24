// demo of multiple catch blocks

package exception;

public class MultipleCatches {

	public static void main(String[] args) {

		int a = args.length, ans = 0;
		
		try {
			ans = 42 / a; 
			int[] c = { 1, 2 };
			
			c[5] = 10;
		}
		catch(ArithmeticException e) {
			ans = 0;
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
			
		}
		
		System.out.println("After catch blocks");
		System.out.println("a = " + a);
		System.out.println("ans = " + ans);
		
	}

}
