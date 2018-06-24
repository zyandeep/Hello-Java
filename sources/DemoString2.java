/* String class2
*  Date: 29-Sept-13
**************************/

import java.util.Scanner;

class DemoString2
{
	static void print()
	{
		int count=1;
		Scanner scan=new Scanner(System.in);
		String str;
		do
		{
			System.out.println("Who was the inventor of C ?");
			str=scan.next();
			if(str.equalsIgnoreCase("Denis_Ritchie"))
			{
				System.out.println("Good!");
				break;
			}
			else
			{
				if(count==3)
				{
					System.out.println("Denis_Ritchie");
				}
				
				else System.out.println("Try again!");
				count++;
			}
		}while(count<=3);
		
	}	
	
	public static void main(String[] args)
	{
		DemoString2.print();
	}
}
		