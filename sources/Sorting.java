/* selection sorting in Java
   Date: 21 sept,13
***************************/
import java.util.Scanner;

class Sorting
{
	private int[] arr=new int[7];
	private int temp,i,j;
	
	Sorting()
	{
		System.out.println(" Selection Sorting in Java... ");
	}
	
	void getData()
	{
		System.out.println(" Enter 7 numbers: ");
		Scanner input=new Scanner(System.in);
		for(i=0;i<arr.length;i++)
		{
			arr[i]=input.nextInt();
		}
	}
	
	void sort()
	{
		for(i=0;i<arr.length-1;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	void display()
	{
		System.out.println(" Sorted array elements are: ");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(+arr[i]+" ");
		}
	}
	
	public static void main(String[] args)
	{
		Sorting obj=new Sorting();
		obj.getData();
		obj.sort();
		obj.display();
	}
}