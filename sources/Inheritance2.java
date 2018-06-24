/* Inheritance2
*  Date: 01-sept-13
**************************/
class Room
{
	int length,breadth,area;
	Room(int l,int b)
	{
		length=l;
		breadth=b;
	}
	final int calArea()
	{
		System.out.println("Of Room class");
		area=length*breadth;
		return area;
	}
}

class BedRoom extends Room
{
	int hight,volume;
	BedRoom(int x,int y,int z)
	{
		super(x,y);
		hight=z;
	}
	/*int calArea()
	{
		System.out.println("Of BedRoom class");
		area=length*breadth;
		return area;
	}*/
	int calVolume()
	{
		volume=length*breadth*hight;
		return volume;
	}
}

class Inheritance2
{
	public static void main(String[] z)
	{
		
		BedRoom b=new BedRoom(12,15,20);
		System.out.println("\n Area of the Bedroom: "+b.calArea());
		System.out.println("\n Volume of the Bedroom: "+b.calVolume());
	}
}	