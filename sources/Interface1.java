/* Interface in Java
   Date: 23 sept,13
***************************/
interface Room
{
	// fields/data members of interface automatically become final(constant)
	double length=12.5;     
	double breadth=7.5;
	double height=20.9;
	
	// methods of interface automatically become abstract
	void area();
	void volume();
}

class Interface1 implements Room
{
	Interface1()
	{
		System.out.println("Demo of Interface...");
	}
	
	public void area()   // while implementing, access specifier of the method must be given as public explicitly
	{
		System.out.println("Area is: " +length*breadth);
	}
	
	public void volume()
	{
		System.out.println("Volume is: " +length*breadth*height);
	}
	
	public static void main(String[] args)
	{
		Interface1 i=new Interface1();
		i.area();
		i.volume();
	}
}