/* Dynamic Message Dispatch with Interface object 
*  Date: 03-Oct-13
*************************/
interface Area
{
	int l=10;
	int b=15;
	int h=20;
	void calc();
}

class Rect implements Area
{
	Rect()
	{
		System.out.println("Rect is being pointed by Area!");
	}
	
	public void calc()
	{
		int vol=l*b*h;
		int area=l*b;
		System.out.println("Area of rectangle: " +area);
		System.out.println("Volume of rectangle: " +vol);
	}
}

class Tri implements Area
{
	Tri()
	{
		System.out.println("Tri is being pointed by Area!");
	}
	
	public void calc()
	{
		int area=l*b/2;
		System.out.println("Area of triangle: " +area);
	}
}

class Interface3
{
	public static void main(String[] args)
	{
		Area a=new Rect();
		a.calc();
		a=new Tri();
		a.calc();
	}
}