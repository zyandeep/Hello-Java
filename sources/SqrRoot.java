/* square root 
*  Date: 09-sept-13
**************************/
import java.lang.Math;

class SqrRoot
{
	public static void main(String[] args)
	{
		double sum=0;
		System.out.println(" Square root table..\n\n");
		System.out.print("Number");
		for(double i=0.0;i<=0.5;i+=0.1)
		{
			System.out.print("\t"+i);
		}
		for(double i=0.0;i<=9.0;i++)
		{
			System.out.println("\n"+i);
			for(double j=0.0;j<=0.9;j+=0.1)
			{
				sum=0;
				sum+=i+j;
				System.out.print("\t"+Math.sqrt(sum));
			}
		}
	}
}	