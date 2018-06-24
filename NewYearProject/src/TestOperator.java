/**
 * Unary operator testing
 * Date: 08/01/2014
 * @author Zyandeep
 *
 */

public class TestOperator {

	public static void main(String[] args) {
		
		int x = 5;
		
		System.out.println( ++x );
		System.out.println( x );
		System.out.println( x++ );
		System.out.println( x );
		
		// unary operators can be used only with variables
		// not with literals
		//System.out.println( ++( x + 1) );
		//System.out.println( 5++ );
		
	}

}
