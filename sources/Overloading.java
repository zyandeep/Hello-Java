/* Implementation of overloading
*  Date: 01-sept-13
**************************/
class Overloading
{
	double l,b,h,volume;
	Overloading()
	{
		System.out.println(" Default constructor is invoked!");
		l=b=h=0;
		area=0;
	}
	Overloading(double x, double y, double z)
	{
		System.out.println(" parametrised constructor is invoked!");
		l=x;
		b=y;
		h=z;
	}
	void function(double x, double y, double z)
	{
		l=x;
		b=y;
		h=z;
		volume=l*b*h;
		System.out.println("Volume is: "+volume);
	}
	void function()
	{
		volume=l*b*h;
		System.out.println("Volume is: "+volume);
	}
	public static void main(String[] z)
	{
		Overloading o1,o2;
		o1=new Overloading(); // default constructor is invoked
		o2=new Overloading(5.2,4,8.9);  // parametrised constructor is invoked
		o1.function(12,10.5,9.8);
		o2.function();
	}
}	