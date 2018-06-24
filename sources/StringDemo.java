/* String Class 
*  Date: 02-Oct-13
**************************/

class StringDemo
{
	public static void main(String[] args)
	{
		String s= "Active Server Pages © Microsoft";
		System.out.println(s);
		System.out.println("index of \"Server\" = " +s.indexOf("Server"));
		System.out.println("index of \"Microsoft\" = " +s.indexOf("Microsoft"));
		System.out.println("index of \'P\' = " +s.indexOf('P'));
	}
}