/* java package
*  Date: 10-sept-13
**************************/
package arithmetic;

public class Arithmetic
{
	private int a,b;
	public Arithmetic(int x,int y)
	{
		a=x;
		b=y;
	}
	public int addition()
	{
		return a+b;
	}
	public int subtraction()
	{
		return a-b;
	}
	public int multiplication()
	{
		return a*b;
	}
	public double division()
	{
		return b/a;
	}
}