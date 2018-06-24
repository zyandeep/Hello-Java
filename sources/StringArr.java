/* String array in Java
   Date: 23 sept,13
***************************/
import java.util.Scanner;

class StringArr
{
	private String[] str=new String[5];
	private int i,j;
	private String temp;
	StringArr()
	{
		System.out.println("Alphabetical ordering of string...");
	}
	void getData()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter five words: ");
		for(i=0; i<str.length; i++)
		{
			str[i]=input.next();
		}
	}
	void sort()
	{
		for(i=0; i<str.length-1; i++)
		{
			for(j=i+1; j<str.length; j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
	}
	void display()
	{
		System.out.println("Sorting words alphabetically... ");
		for(i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
	}
	public static void main(String[] args)
	{
		StringArr obj=new StringArr();
		obj.getData();
		obj.sort();
		obj.display();
	}
}