/* Demo of`Type conversion and casting
*  Date: 25-Aug-13
**************************/
class Type
{
	public static void main(String[] z)
	{
		byte b=20;
		short s;
		int i=2020;
		float f;
		double d=2020.505;
		System.out.println("\nByte b= "+b);
		System.out.println("int i= "+i);
		b=(byte)i;
		System.out.println("Conversion of int to byte= "+b);
		System.out.println("double d= "+d);
		i=(int)d;
		System.out.println("Conversion of double to int = "+i);
		b=(byte)(b*20);
		System.out.println("b= "+b);
	}
}
		