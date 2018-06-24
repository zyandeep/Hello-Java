/* Scanner class Demo
*  Date: 30-Sept-13
**************************/
import java.util.Scanner;

class ScannerClsDemo
{
	public static void main(String[] arg)
	{
		int i;
		double d;
		String str;
		Scanner scan=new Scanner(System.in);
	
		//reading an integer from keyboard
		System.out.println("Enter an integer value: ");
		i=scan.nextInt();
	
		//reading a double from keyboard
		System.out.println("Enter a double value: ");
		d=scan.nextDouble();
	
		//reading a double from keyboard
		System.out.println("Enter your name: ");
		str=scan.next();
	
	
		//displaying the information
		System.out.println("Integer value is: " +i);
		System.out.println("Double value is: " +d);
		System.out.println("Your name is: " +str);
	}
}