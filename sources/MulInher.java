/* Multiple inheritance through Interfaces in Java
   Date: 23 sept,13
***************************/
interface I1
{
	String name=new String("Zyandeep");
	int age=20;
	void display();
}

interface I2
{
	String p_add=new String("Jorhat,Assam");
	StringBuffer cls=new StringBuffer("BCA, 3rd");
	void display();
}

interface I3 extends I1,I2
{
	String email="zyandeep000@gmail.com";

}

class MulInher implements I1,I2,I3
{
	MulInher()
	{
		System.out.println("Demo of Multiple inheritance in Java through Interface");
		System.out.println();
	}		
	public void display()
	{
		System.out.println(name);
		System.out.println(p_add);
		System.out.println(cls);
		System.out.println(email);
		System.out.println(age);
	}
	public static void main(String[] args)
	{
		MulInher obj=new MulInher();
		obj.display();
	}
}
	
	