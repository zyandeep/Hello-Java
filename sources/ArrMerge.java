/* Merging of arrays
*  Date: 27-09-13
******************************/

import java.util.Scanner;

class Merge
{
	int arr1[]=new int[5];
	int arr2[]=new int[6];
	int newArr[]=new int[11];
	Scanner input=new Scanner(System.in);
	
	void getData()
	{
		System.out.println(" Enter 5 int. in ascending order for the 1st array... ");
		for(int i=0; i<5; i++)
		{
			arr1[i]= input.nextInt();			
		}
		
		System.out.println(" Enter 6 int. in ascending order for the 2nd array... ");
		for(int i=0; i<6; i++)
		{
			arr2[i]= input.nextInt();			
		}
		
	}
	 
	void display()
	{
		System.out.println(" The new merged array is");
		for(int i=0;i<11;i++)
		{
			System.out.println(newArr[i]);	
		}
	}
	
	void merge()
	{
		
		int i=0,j=0,k=0;
		
		outer: while(true)
		{
			while(arr1[i]<=arr2[j])
			{
				newArr[k++]=arr1[i++];
				if(i==arr1.length)
					break outer;
			}
			
			while(arr2[j]<=arr1[i])
			{
				newArr[k++]=arr2[j++];
				if(j==arr2.length)
					break outer;
			}
		}
		
		if(i==arr1.length)
		{
			while(j<arr2.length)
			{
				newArr[k]=arr2[j];
				k++;
				j++;		
			}
		}
		
		else
		{
			while(i<arr1.length)
			{	
				newArr[k]=arr1[i];
				k++;
				i++;
			}
		}
	}
}

class ArrMerge
{
	public static void main(String[] args)
	{
		Merge obj=new Merge();
		obj.getData();
		obj.merge();
		obj.display();
	}
}