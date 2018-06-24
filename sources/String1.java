/* String in Java
   Date: 21 sept,13
***************************/
class String1
{
	String s1="Hello";    //initialisation
	String s3="Hello";
	String s2=new String("Hello");
	void stringMethods()
	{
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println("Length of s1: " +s1.length());
		System.out.println("Length of s2: " +s2.length());
		System.out.println("Length of s3: " +s3.length());
		System.out.print(s1.charAt(0));
		System.out.print(s2.charAt(2));
		System.out.print(s3.charAt(4));
	}
	public static void main(String[] args)
	{
		String1 obj= new String1();
		obj.stringMethods();
	}
}
		
			