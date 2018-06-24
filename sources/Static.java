/* Static members
*  Date: 01-sept-13
**************************/
class Static
{
	private static int a,b;
	private static double res;
	static void getdata(int x, int y)
	{
		a=x;
		b=y;
	}
	static void showArithmatic()
	{
		res=a+b;
		System.out.println("Addition is= "+res);
		res=a-b;
		System.out.println("Subtraction is= "+res);
		res=a*b;
		System.out.println("Multiplication is= "+res);
		res=a/b;
		System.out.println("Division is= "+res);
	}
	public static void main(String[] z)
	{
		getdata(20,5);
		Static.showArithmatic();
	}
}
		
	
		