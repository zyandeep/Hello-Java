/* Matrix multiplication
*  Date: 29-Sept-13
**************************/
class MatrixMul
{
	static int arr1[][]={
							{1,2,3},
							{4,5,6},
							{7,8,9}
						};
	
	static int arr2[][]={
							{2,3,4},
							{5,6,7},
							{8,9,10}
						};
	static int arr3[][]=new int[3][3];
	
	static void mul()
	{
		int i,j,k,sum=0;
		for(i=0;i<3;i++)
		{
			for(k=0;k<3;k++)
			{
				for(j=0;j<3;j++)
				{
					sum+=arr1[i][j] * arr2[j][k];
				}
				arr3[i][k]=sum;
				sum=0;
			}
		}
	}
	
	static void display()
	{
		System.out.println(" Result is: \n");
		for(int i=0;i<3; i++)
		{
			System.out.println();
			for(int j=0;j<3;j++)
			{
				System.out.print(+arr3[i][j]+ " ");
			}
		}
	}
	
	public static void main(String[] args)
	{
		MatrixMul.mul();
		MatrixMul.display();
	}
}