/**
 * 	Operations on Arrays
 *  Date: 29/12/13  
 */

public class ArrayTest {

	/*static int[] arr = {1,2,3,4,5};
	
	// method, taking array as argument, should be declared as static
	static void f1(int[] a) {

		System.out.println("length of the array: " + a.length);
		
		for(int i : a) {
			System.out.println(+ i + " ");
		}
	} */
	
	static int[] f2() {   	// method, returning an array, should be decleared as static
		
		return new int[] {4,5,6};
	}
	
	public static void main(String[] args) {
		
		/*f1(arr);
		f1(new int[] {1,2,3});  // Creates an array  object on the fly */
 		
		int[] arrTest = f2();
		for(int i : arrTest) {
			System.out.println(+ i + " ");
		}
		
	}

}
