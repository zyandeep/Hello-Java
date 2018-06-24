/* Method returning object 
   Date: 22 sept,13
***************************/
class A
{
	int a=5,b=10;
	int sum=0;
	A print(A a)
	{
		a.sum=a.a+a.b;
		return a;
	}
}

class MainMeth
{
	A a1=new A();
	A a2=new A();
	public static void main(String[] args)
	{
		MainMeth m=new MainMeth();
		System.out.println("a1.sum= "+m.a1.sum);
		m.a1=m.a1.print(m.a2);
		System.out.println("a2.sum= "+m.a2.sum);
		System.out.println("a1.sum= "+m.a1.sum);
	}
}