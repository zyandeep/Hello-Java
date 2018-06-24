/* Class-object test
*  Date: 01-sept-13
**************************/
class ReturnValue
{
	static String name="Tom";
	static String getName()
	{
		System.out.println(" Name is: "+name);
		return name;
	}
	public static void main(String[] z)
	{
		String s= ReturnValue.getName();
		System.out.println(s);
	}	
}	