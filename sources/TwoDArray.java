/* 2-D array in Java
   Date: 23 sept,13
***************************/
import java.util.Scanner;

class TwoDArray
{
	public static void main(String[] args)
	{
		//int arr[][], sum=0;
		//arr=new int[3][2];
		int arr[][]=new int [3][2];
		int sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("\n Enter data in 3*2 matrix: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=input.nextInt();
			}
		}
		System.out.println(" Sum of each row... \n");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				sum+=arr[i][j];
			}
			System.out.println(" Sum of " +i+ " row= " +sum);
			sum=0;
		}
	}
}