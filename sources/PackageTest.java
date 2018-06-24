/* Java API Packages
*  Date: 06-Oct-13
**************************/
//import java.lang.Math;
import java.util.Scanner;

class PackageTest
{
	public static void main(String[] args)
	{
		//System.out.println(" value of PI = " +Math.PI);
		
		// using fully qualified class name
		System.out.println(" Square root of 25 = " +java.lang.Math.sqrt(25));
		System.out.println(" Square root of 81 = " +java.lang.Math.sqrt(81));
		
		//System.out.println(" Sin(45) = " +Math.sin(45));
		//System.out.println(" Log(45) = " +Math.log10(45));
		
		Scanner scan=new Scanner(System.in);
		String s;
		System.out.println("Enter your name: ");
		s=scan.next();
		System.out.println("Your name is: " +s);
	}
}