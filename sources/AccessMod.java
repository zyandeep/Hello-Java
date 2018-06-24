/* Access modifiers
*  Date: 01-sept-13
**************************/
class Parent
{
	protected int num1,num2;
	Parent(int x,int y)
	{
		num1=x;
		num2=y;
	}
}

class AccessMod extends Parent
{
	AccessMod(int x, int y)
	{
		super(x,y);
	}	
	int check()
	{
		if(num1>num2)
			return num1;
		else
			return num2;
	}
	public static void main(String[] z)
	{
		AccessMod a=new AccessMod(5,9);
		int res=a.check();
		System.out.println(" larger value: "+res); 
	}
}	
	