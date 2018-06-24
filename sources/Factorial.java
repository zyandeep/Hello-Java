/* factorial of a number
*  Date: 24-Aug-13
**************************/
class Factorial
{
	public static void main(String[] z)
	{
		int num,fac=1;
		num=5;
		for(int i=num;i>=1;i--)
		{
			fac*=i;
		}
		System.out.println(" Factorial of "+num+ " is: " +fac);
	}	
}