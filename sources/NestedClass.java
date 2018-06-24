/* nested/inner class in Java
   Date: 21 sept,13
***************************/
class Outer
{
	private int a=50;   //data member of outer
	class Inner
	{
		private int a2=10;
		void print()
		{
				System.out.println("Inner class: " +a);
		}
	}
	Inner i=new Inner();   //data member of outer  
	void print()
	{
		System.out.println("Inner class: " +i.a2);
		i.print();
	}
	
	void print2()
	{
		class Inner
		{
			private int a3=4000;   // how a3 is visible outside Inner??? 
			void print()
			{
				System.out.println("Inner class: " +a);
			}
		}
		Inner i=new Inner();     // scope of Inner is within the print() method
		i.print();
		System.out.println("Inner class: " +i.a3);
	}
	Inner i2 =new Inner();     // data member of outer
	//i2.print();   //error: not data, so must be within a method  		
}

class NestedClass
{
	public static void main(String[] args)
	{
		Outer obj=new Outer();
		obj.print();
		obj.print2();
		//System.out.println(obj.a);  // can't access private a
	}
}