/* String in Java
   Date: 21 sept,13
***************************/
import java.util.Scanner;

class Data
{
	private String[]s=new String[2];
	private long ph;
	private int pno;
	private double bal;
	String s2;
	void getData()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name: ");
		s[0]=input.next();
		System.out.println("Enter your hobby: ");
		s[1]=input.next();
		System.out.println("Enter your phone no: ");
		ph=input.nextLong();
		System.out.println("Enter PIN no: ");
		pno=input.nextInt();
		System.out.println("Enter your a/c balance: ");
		bal=input.nextDouble();
		System.out.println("Enter your Address: ");
		s2=input.next();
	}
	void showInfo()
	{
		System.out.println(" Your Information: ");
		System.out.println("Name:  " +s[0]);
		System.out.println("Hobby:  " +s[1]);
		System.out.println("Phone no:  " +ph);
		System.out.println("PIN:  "+pno);
		System.out.println("a/c balance:  " +bal);
		System.out.println("Address:  " +s2);
	}
}

class String3
{
	public static void main(String[] args)
	{
		Data obj=new Data();
		obj.getData();
		obj.showInfo();
	}
}