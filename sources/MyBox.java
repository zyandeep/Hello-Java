/* Super class ref. variable
*  Date: 06-Oct-13
**************************/

class Box
{
	double length;
	double breadth;
	
	/*Box()
	{
		System.out.println("Box is created!");
		length=5.0;
		breadth=10.5;
	}*/
	
	Box(double x, double y)
	{
		System.out.println("Box is created!");
		length=x;
		breadth=y;
	}
	
	double area()
	{
		return length*breadth;
	}
}

class TestBox extends Box
{
	double height;
	
	TestBox()
	{
		super(5.0,10.5);
		System.out.println("TestBox is created!");
		height=12.5;
	}
	
	double volume()
	{
		return length*breadth*height;
	}
}

class MyBox
{
	public static void main(String[] args)
	{
		// Box b = new TestBox();
		
		TestBox b = new TestBox();
		System.out.println("Area is: " +b.area());
		System.out.println("Area is: " +b.volume());
		
		// causes error:  System.out.println("Volume is: " +b.volume());
	}
}