/* Using object as parameter 
   Date: 22 sept,13
***************************/
class A
{
	private int a,b;
	private double res;
	char c='y';
	A(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void cal()
	{
		res=a*b;
		System.out.println(res);
		res=a/b;
		System.out.println(res);
	}
}

class MainA
{
	private int c=10,d=20;
	private int res;
	void cal(MainA m, A a)
	{
		m.res=m.a+m.b;
		System.out.println(res);
		m.res=m.a-m.b;
		System.out.println(res);
		a.cal();
	}
	public static void main(String[] args)
	{
		MainA m1=new MainA();
		MainA m2=new MainA();
		A a=new A(12,6);
		m1.cal(m2,a);
	}
}