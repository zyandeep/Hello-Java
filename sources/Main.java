/* Use of two classes
*  Date: 24-Aug-13
**************************/
class Room
{
	double l,b;
	void getdata(double x, double y)
	{
		l=x;
		b=y;
	}
	double calArea()
	{
		return (l*b);
	}
}

class Main
{
	public static void main(String[] z)
	{
		Room r=new Room();
		r.getdata(2.5,5.5);
		System.out.println("Area of \'r\' is: " +r.calArea());
	}
}
		
		