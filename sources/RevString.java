import java.util.Scanner;   //Scanner class to take input from keyboard 

class RevString
{
	public static void main(String[] a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1= sc.next();
		System.out.println("The reverse of the string is: ");
		for(int c=s1.length()-1; c>=0; c--)
			System.out.print(s1.charAt(c));
	}

}  	