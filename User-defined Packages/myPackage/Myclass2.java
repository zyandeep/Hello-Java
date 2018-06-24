/* user-defined package 
*  Date: 06-Oct-13
**************************/
package myPackage;

public class Myclass2
{
	private int a,b;
	
	public Myclass2(int x, int y)
	{
		System.out.println("Myclass2 is created!");
		a=x;
		b=y;
	}
	
	public int result()
	{
		return a+b;
	}
}
