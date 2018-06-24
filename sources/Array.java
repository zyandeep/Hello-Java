/* Demo of 1-D array
*  Date: 25-Aug-13
**************************/
class Array
{
	public static void main(String[] z)
	{
		// two-step process for array deceleration and memory allocation
		int arr[],i,j;
		arr=new int[10];
		for(i=0,j=5; i<10; j+=5)
		{
			arr[i++] = j;
		}
		System.out.println("\n Originals array elements...");
		for(int temp:arr)
		{
			System.out.println(temp);
		}	
		int odd[]=new int[5];
		int even[]=new int[5];
		
		//enhanced for loop
		i=j=0;
		for(int temp:arr)
		{
			if(temp%2==0)
			{
				even[i]=temp;
				i++;
			}	
			else
			{	
				odd[j]=temp;
				j++;
			}	
		}
		System.out.println(" Even array elements...");
		for(int temp:even)
		{
			System.out.println(temp);
		}
		System.out.println(" Odd array elements...");
		for(int temp:odd)
		{
			System.out.println(temp);
		}
	}
}	