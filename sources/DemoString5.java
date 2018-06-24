/* String class
*  Date: 29-Sept-13
**************************/
import java.util.Scanner;

class DemoString5
{
	static String str=new String();
	static char c[]=new char[10];
	static Scanner scan=new Scanner(System.in);
	
	static void getData()
	{
		System.out.println("Enter a string: ");
		str=scan.next();
	}
	
	static void display()
	{
		System.out.println("alphabetic order of the string: ");
		for(int i=0; i<c.length; i++)
			System.out.print(c[i]);	
	}
	
	static void sort()
	{	
		int i,j=0,arrlength;
		char temp;
		
		//copying all the characters of the string to a char array 
		for(i=0; i<str.length(); i++)
		{
			c[j++]=str.charAt(i);
		}
		
		//using bubble-sort
		arrlength=j-1;
		
		while(arrlength>0)
		{
			
			for(j=0; j<arrlength; j++)
			{
				if(c[j]>c[j+1])
				{
					temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
			arrlength--;
		}
	}
	
	public static void main(String[] args)
	{
		DemoString5.getData();
		DemoString5.sort();
		DemoString5.display();
	}
}
		