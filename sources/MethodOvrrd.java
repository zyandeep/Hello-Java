/* Method overriding
*  Date: 01-sept-13
**************************/
abstract class Figure
{
	int x,y;
	Figure(){}
	void chPosition(int x, int y){}
	abstract void draw();
}
class Circle extends Figure
{
	void draw()
	{
		System.out.println(" C Draw method called");
	}
}
class Rectangle extends Figure
{
	void chPosition(int x, int y)
	{
		System.out.println("Change position method called");
	}
	void draw()
	{
		System.out.println(" R Draw method called");
	}
}
class MethodOvrrd
{
	public static void main(String[] z)
	{
		Circle c;
		Rectangle r;
		c=new Circle();
		r=new Rectangle();
		c.draw();
		r.draw();
		r.chPosition(1,2);
	}
}
	
		