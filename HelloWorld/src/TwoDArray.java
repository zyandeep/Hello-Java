public class TwoDArray {

	final static int ROW = 5;
	final static int COL = 5;
	
	public static void main(String[] args) {

		int arr[][] = new int[ROW][COL];
		int i , j;
		
		// filling the matrix
		for(i=0; i<ROW; i++) {
			
			for(j=0; j<COL; j++ ) {
				
				if(i==j)
					arr[i][j] = 1;
			}
		}
			
		// display the matrix
		for(i=0; i<ROW; i++) {
			
			System.out.println();
			
			for(j=0; j<COL; j++ ) {
				
				System.out.print(+arr[i][j]+ " ");
			}
		}
	}

}
