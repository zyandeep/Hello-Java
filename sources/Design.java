/* Just design 
*  Date: 09-sept-13
**************************/
class Design
{
	private static int row=1,column=1;
	static void implement()
	{
		for(row=1;row<=5;row++)
		{
			System.out.println(" ");
			for(column=1;column<=row;column++)
			{
				if(row==1)
					System.out.print(" "+row);
				else
					System.out.print(+row+"  ");
			}
		}
	}
	public static void main(String[] args)
	{
		Design.implement();
	}
}
		