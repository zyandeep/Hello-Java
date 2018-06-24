/* Demo of StringBuffer class
   Date: 23 sept,13
***************************/
class String6
{
	public static void main(String[] args)
	{
		StringBuffer str=new StringBuffer("Java");
		
		// StringBuffer s="Java"; 	causes error! 
		// can't use as primitive data type.
		
		System.out.println(str);
		str.setCharAt(3,'x');      // replace 1th char by 'x' 
		System.out.println(str);
		str.append(" is objected oriented!");   // appends a string
		System.out.println(str);
		str.insert(0,"Hello ");   // inserts a string at given position   
		System.out.println(str);
	}
}