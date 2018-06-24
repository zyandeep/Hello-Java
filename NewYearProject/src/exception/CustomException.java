// creating custom exception

package exception;

public class CustomException extends Exception {
	
	// setting the error message
	public CustomException( String errMsg) {
		super(errMsg);
		
	}
	
	public String toString() {
		return String.format("%s : %s", "CustomException", getMessage() );
		
	}

}
