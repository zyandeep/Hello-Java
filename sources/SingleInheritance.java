/* Single Inheritance
*  Date: 03-sept-13
**************************/
class Room
{
	double length,breadth;
	Room(double x,double y)
	{
		length=x;
		breadth=y;
	}
	double calArea()
	{
		return length*breadth;
	}
}

class BedRoom extends Room
{
	double hight;
	BedRoom(double x,double y,double z)
	{
		super(x,y);
		hight=z;
	}
	double calVolume()
	{
		return length*breadth*hight;
	}
}

class SingleInheritance
{
	public static void main(String[] args)
	{
		BedRoom b=new BedRoom(10.5,12.5,17.6);
		System.out.println("Area is: " +b.calArea());
		System.out.println("Volume is: " +b.calVolume());
	}
}