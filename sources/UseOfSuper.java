/* Use of super keyword
*  Date: 06-Oct-13
**************************/
class A
{
	String s = "Zyandeep";
	int age;
	
	A(int a)
	{
		age = a;
	}
	
	void display()
	{
		System.out.println(" Superclass version...");
		System.out.println(" Your name: " +s);
		System.out.println(" Age: " +age);
	}
}

class B extends A
{
	String s = " Baruah";  // overrides Super.s
	
	B(int a)
	{
		super (a);  // calls the Superclass's constructor
	}
	
	void display()
	{
		System.out.println(" Subclass version...");
		System.out.println(" Your name: " +(super.s + s));  // super.s refers to Superclass's(A) s
		System.out.println(" Age: " +age);
		
		// super.display() refers to Superclass's display()
		super.display();
	}
}

class UseOfSuper
{
	public static void main(String[] args)
	{
		B b = new B(20);
		b.display();
	}
}