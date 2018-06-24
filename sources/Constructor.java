/* Parametrised Constructor
*  Date: 01-sept-13
**************************/
class NoDefConst
{
	NoDefConst(String s)
	{
		System.out.println(s);
	}
}
class Subclass extends NoDefConst
{
	Subclass()
	{
		super("Hellow World");
	}
}
class Constructor
{
	public static void main(String[] z)
	{
		Subclass s=new Subclass();
	}
}
