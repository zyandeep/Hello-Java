/* 2D array
*  Date: 27-09-13
******************************/

import java.util.Scanner;

class Array2d
{
	private int arr[][]=new int[5][4];
	private int i,j;
	Scanner input=new Scanner(System.in);
	
	void getData()
	{
		System.out.println(" Enter roll-no marks for 5 students... ");
		for(i=0;i<5;i++)
		{
			System.out.println();
			for(j=0;j<4;j++)
			{
				arr[i][j]= input.nextInt();
			}
		}
	}
	
	void totalMarks()
	{
		int sum,high=0,roll=0;
		System.out.println(" Total marks obtained by each student... \n\n");
		for(i=0;i<5;i++)
		{	
			sum=0;
			for(j=1;j<4;j++)
			{
				sum+=arr[i][j];
			}
			System.out.println(" Total marks of " +(i+1)+ " student is:  " +sum);
			if(sum>high)
			{
				high=sum;
				roll=i;
			}
		}
		System.out.println(" The student who scores total highest marks is roll-no: " +(roll+1));
		System.out.println(" Total marks he scored: " +high);
	}
	
	void higestMarks()
	{
		int roll,marks=0;
		System.out.println("\n\n Highest marks obtained in each subject... ");
		for(i=1;i<4;i++)
		{	
			System.out.println();
			roll=marks=0;
			for(j=0;j<5;j++)
			{
				if(arr[j][i]>marks)
				{
					roll=j;
					marks=arr[j][i];
				}
			}
			System.out.println(" Highest marks in " +i+ " subject is: " +marks);
			System.out.println(" And the roll-no obtaining the highest marks is: " +(roll+1));
		}
		
	}
}

class HighMarks
{
	public static void main(String[] args)
	{
		Array2d obj=new Array2d();
		obj.getData();
		obj.totalMarks();
		obj.higestMarks();
	}
}
