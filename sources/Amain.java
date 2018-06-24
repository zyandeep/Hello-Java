/* Method returning object 
   Date: 22 sept,13
***************************/
class A
{
	int a=5,b=10;
	int sum=0;
	A print(A a)
	{
		a.sum=a.a+a.b
		return a;
	}
}

class MainMeth
{
	public static void main(String[] args)
	{
		A a1=new A();
		A a2=new A();
		System.out.println("a1.sum= "+a1.sum);
		a1=a1.print(a2);
		System.out.println("a2.sum= "+a2.sum);
		System.out.println("a1.sum= "+a1.sum);
	}
}