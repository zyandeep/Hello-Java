/* Interface in Java
   Date: 23 sept,13
***************************/
interface Intrfc1
{
	// fields/data members of interface automatically become final(constant)
	final String name="Zyandeep";     
	final long ph=8721075704l; 
}

interface Intrfc2 extends Intrfc1
{
	// fields/data members of interface automatically become final(constant)
	final String add=new String("Jorhat");     
	final char sex='M';
	
	// methods of interface automatically become abstract
	abstract void display(); 
}

class TestIntrfc implements Intrfc1,Intrfc2
{
	public void display()
	{
		System.out.println(name);
		System.out.println(ph);
		System.out.println(add);
		System.out.println(sex);
	}
	public static void main(String[] args)
	{
		TestIntrfc obj=new TestIntrfc();
		obj.display();
	}
}
		