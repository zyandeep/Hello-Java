/*
 * Exception handling using try catch
 * Date: 29-09-13
 */


public class ErrorDemo2 {

	public static void main(String[] args) {
		
		int[] arr = {5, 10, 15, 20, 25};
		int num = 10;
		double x;
		
		for(int i = 0; i<arr.length; i++) {
			
			try {
				
				x = arr[i]/(arr[i]-num);
				System.out.println("x = " + x);
				
			}catch(ArrayIndexOutOfBoundsException ai){
				
				System.out.println("Array index error!");
				
			}catch(ArithmeticException ae){
				
				System.out.println("Divide by zero!");
				
			}catch(Exception e){
				
				System.out.println("Unknown error!");
			}
			
		}
			
	}

}
