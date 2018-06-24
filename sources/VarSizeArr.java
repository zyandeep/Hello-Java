/* Variable-Size array in Java
   Date: 23 sept,13
***************************/
import java.util.Scanner;

class VarSizeArr
{
	public static void main(String[] args)
	{
		int x[][]=new int[3][];   // variable size array
		x[0]=new int[3];
		x[1]=new int[5];
		x[2]=new int[2];
		Scanner input=new Scanner(System.in);
		System.out.println(" Enter elements in var-size array: ");
		for(int i=0; i<3; i++)
		{
			System.out.println("enter " +x[i].length+ " data: ");
			for(int j=0; j<x[i].length; j++)
			{
				x[i][j]=input.nextInt();
			}
		}
		System.out.println(" Printing elements of var-size array: ");
		for(int i=0; i<3; i++)
		{
			System.out.println();
			for(int j=0; j<x[i].length; j++)
			{
				System.out.print(x[i][j]);
			}
		}
	}
}