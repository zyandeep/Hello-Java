/* user-defined package 
*  Date: 06-Oct-13
**************************/
import myPackage.*;

class Test2
{
	public static void main(String[] args)
	{
		Myclass m1 = new Myclass();
		m1.print();
		Myclass2 m2 = new Myclass2(2,5);
		System.out.println("Sum is: " +m2.result());
	}
}