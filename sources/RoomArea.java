/* Use of Constructor
*  Date: 24-Aug-13
**************************/
class Room
{
	double l,b,area;
	Room(double x, double y)
	{
		l=x;
		b=y;
		area=l*b;
		System.out.println("\n Area is: "+area);
	}
}	

class RoomArea
{
	public static void main(String[] z)
	{
		Room r=new Room(10.2,5.8);
	}
}