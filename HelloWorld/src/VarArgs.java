/*
 * Variable-length arguments in Java
 * Date : 30/10/13
 */

public class VarArgs {

	static void myFunction(int ... a) {
		
		int sum = 0, count = 0;
		
		for(int i : a) {
			
			sum = sum + i;
			count++;
		}
		
		System.out.println("Sum of " + count + " no is = " + sum);
		System.out.println("Average of " + count + " no is = " + sum/count);
	}
	
	public static void main(String[] args) {
		
		VarArgs.myFunction(2,5);
		VarArgs.myFunction(1);
		VarArgs.myFunction(1,2,3);
		VarArgs.myFunction(3,1,5,2,7,8,4);

	}

}
