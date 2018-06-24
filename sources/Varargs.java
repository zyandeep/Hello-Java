/* Varargs in Java
   Date: 21 sept,13
***************************/
class Varargs
{
	// overloading of varargs methods
	static void func(int v)
	{
		System.out.println(v);
	}
	
	static void func(String s,int ... v)
	{
		System.out.println(" No.of arguments: " +v.length);
		for(int a: v)
			System.out.println(a);
		System.out.println(s);
	}
	
	static void func(String s, double d,int ... v)
	{
		System.out.println(" No.of arguments: " +v.length);
		for(int a: v)
			System.out.println(a);
		System.out.println(s);
		System.out.println(d);
	}

	static void func(int ... v)
	{
		System.out.println(" No.of arguments: " +v.length);
		for(int a: v)
			System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		func(12,10);
		func("zyandeep", 5,7);
		func("zyandeep",3500.50, 5,7);
		func(5);
		func();
	}
}
		
