// custom exception demo 2

package exception;

public class MainCustom2 {
	
	public static void main(String[] args) {
		
		int argsLength = args.length;
		
		try {
			math(argsLength);
		} 
		catch (CustomException e) {
			
			// printStackTrace calls toString() and displays stack
			e.printStackTrace();
			
			// getMessage() displays the error message
			System.out.println( "\n\n" + e.getMessage() );
				
		}
		finally {
			System.out.println("\nfinally doesn't handle exception!");
		}



	}
	
	public static void math( int al) throws CustomException {
		
		// math() throws CustomException
		if (al == 0) {
			throw new CustomException("args is zero");
			
		}
		else {
			System.out.println("args length = " + al);

		}
	}

}
