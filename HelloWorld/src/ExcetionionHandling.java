/* Demo of exception
 * Date: 10-10-13
 */

public class ExcetionionHandling {

	// demo of exception handling
	
	public static void main(String[] args) {
		int a,b,x;
		a = 5;
		b = 10;
		
		try{
		
			x=10/(a-b);
			System.out.println("Value of x =" +x);

		
		}
		
		catch(ArithmeticException e){
		
			System.out.println("You can't divide by zero!");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		finally{
			
			System.out.println("This will run for sure!");
		}
		
		
		x=10/(a+b);
		System.out.println("Value of x =" +x);
		

	}

}
