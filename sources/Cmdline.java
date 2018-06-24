/* Use of command line arguments
*  Date: 24-Aug-13
**************************/
class Cmdline
{
	public static void main(String[] z)
	{
		int count;
		count=z.length;
		System.out.println("\n The number of command line arguments: " +count);
		
		// use of enhanced for loop/ for-each loop
		for(String obj:z)
		{
			System.out.println("Java is " +obj+"!");
		}
	}
}