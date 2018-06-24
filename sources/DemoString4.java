/* String class
*  Date: 29-Sept-13
**************************/
import java.util.Scanner;

class DemoString4
{
	static String str,word;
	static Scanner scan=new Scanner(System.in);
	static int count;
	
	static void getData()
	{
		System.out.println("Enter the text (give underscore instead of space): ");
		str=scan.next();
		System.out.println("Enter the word to search: ");
		word=scan.next();
	}
	
	static int countWord()
	{
		int i=-1,j=-1;
		
		do 
		{
			j=str.indexOf('_' , j+1);
			
			if(j>0)
			{
				if( word.equalsIgnoreCase(str.substring(i+1,j)) )
					count++;
			}
			
			else
			{
				if( word.equalsIgnoreCase(str.substring(i+1)) )
					count++;
			}
			
			i=j;
			
		}while(j>0);
			
		return count;
	}		
	
	public static void main(String[] args)
	{
		DemoString4.getData();
		System.out.println("No of matching words: " +DemoString4.countWord());
	}
}
	
	