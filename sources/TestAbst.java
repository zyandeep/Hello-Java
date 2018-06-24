/* Use of Abstract class
*  Date: 06-Oct-13
**************************/

abstract class AbstClass
{
	static String s = "Zyandeep Baruah";
	static int age = 20;
	
	abstract void print();  // abstract method
}

class InheritAbst extends AbstClass
{
	// overrides the abstract print() 
	void print()
	{
		System.out.println("Hello java!");
		System.out.println(s);
		System.out.println(age);
	}
	
	void show()
	{
		System.out.println("Hello Java!");
	}
}
	
class TestAbst
{
	public static void main(String[] args)
	{
		AbstClass a; 
		InheritAbst i = new InheritAbst();
		a=i;
		a.print();    // an abstract class ref. variable can refers to it's subclass object
		System.out.println(a.s);
		
		// causes compile-time error:  a.show()
		
		// this is valid because s and age are static member of the Abstract class
		System.out.println(AbstClass.s);
		System.out.println(AbstClass.age);
	}
}
	