/**
 * Multidimensional array in Java
 * Date: 10/01/2014
 * @author Zyandeep
 */

public class MultiDArray {

	public static void main(String[] args) {
		
		// Initializing variable length 2D array
		int[][] varArr = {
							{ 1, 2, 3 },
							{ 4, 5 },
							{ 10, 11, 12 }
					 	 };
		
		// displaying the array
		
		for( int i = 0; i < varArr.length; i++) {
			
			for( int j = 0; j < varArr[i].length; j++) {
				
				System.out.println("varArr[" + i + "][" + j + "]\t" + varArr[i][j]);				
			}
		}
			
	}

}
