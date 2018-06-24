/* E.Bal, ex: 1
*  Date: 25-Aug-13
**************************/
class Exe1
{
	public static void main(String[] z)
	{
		int n=5;
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(double)1/i;
			System.out.println(sum);
		}
		System.out.println("\n Sum is: "+sum);
	}
}