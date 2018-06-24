/* Dynamic Method Dispatch
*  Date: 01-sept-13
**************************/
class Super
{
	int a,b;
	void getData(int a, int b)
	{
		this.a=a;     // this keyword refers currently used object
		this.b=b;
	}
	void show()
	{
		
		System.out.println(" In Super class");
		System.out.println(" Addition is: "+(a+b));
	}
}	

class Sub extends Super
{
	void show()
	{
		System.out.println(" In Sub class");
		System.out.println(" Addition is: "+(a+b));
	}
}

class DMD
{
	public static void main(String[] z)
	{
		Super s1=new Super();
		s1.show();
		Super s2=new Sub();     // a super class reference variable can hold/refer to sub class object
		s2.getData(3,4);
		s2.show();
	}
}	