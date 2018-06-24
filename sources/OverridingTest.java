/* Method overriding
*  Date: 03-sept-13
**************************/
class A
{
	void display()
	{
		System.out.println("I am in superclass");
	}
}

class B extends A
{
	void display()
	{
		System.out.println("I am in subclass");
	}
}

class OverridingTest
{
	public static void main(String[] args)
	{
		A a=new A();
		a.display();
		a=new B();
		a.display();	
	}
}