/* Use of for loop
*  Date: 03-Aug-13
**************************/
class ForSample
{
	public static void main(String[] args)
	{
		int i,j,count=0;
		System.out.println("\n Prime nos between 1 to 50 are... ");
		for(i=1;i<=50;i++)
		{
			if(i==1)
			System.out.println(i);
			for(j=2;j<i;j++)
			{	
				if(i%j==0)
				break;
			}
			if(i==j){
			System.out.println(i);
			count++;
			}
		}
		System.out.print(" Totel prime numbers = " +count);
	}
}