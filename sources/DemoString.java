/* String class
*  Date: 29-Sept-13
**************************/

class DemoString
{
	static String delete(String str, int m)
	{
		if( m>str.length())
		{
			System.out.println(" \'m\' is out of range! ");
			return "Error!";
		}
		return str.replace( str.charAt(m),' ');
	}
	
	public static void main(String[] args)
	{
		System.out.println( DemoString.delete("World",2) );
	}
}