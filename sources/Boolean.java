/* Demo of boolean data type
*  Date: 25-Aug-13
**************************/
class Boolean
{
	public static void main(String[] z)
	{
		boolean t,f;
		t=true;
		f=false;
		System.out.println("t= "+t);
		System.out.println("f= "+f);
		if(t)
		System.out.println("This line will execute");
		if(f)
		System.out.println("This line will not execute");
		if(true)
		System.out.println("This will now not be an error!");
		
		//outcome of a relational operator is a boolean value
		System.out.println("10>9 is: "+(10>9));
	}
}