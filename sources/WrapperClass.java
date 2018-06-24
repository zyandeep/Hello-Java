/* wrapper class
*  Date: 30-Sept-13
**************************/

// wrapper class objects are immutable(like String objects)
// we als can't extend a wrapper class 

class WrapperClass
{
	public static void main(String[] args)
	{
		System.out.println("we use wrapper class to convert primitive data type to respective objects");
		
		//converting primitive data type to their respective objects
		int a=50;
		float f=25.3f;	
		Double dbObj=new Double(24.7);
		Float fltObj=new Float(f);
		Character charObj=new Character('h');
		//Boolean b=new Boolean(true);
		
		
		Integer intObj=new Integer("50");  //boxing
		
		System.out.println(intObj);   //auto-unboxing
		int i=intObj;
		System.out.println(i);
		
		
		//converting Objects back to their respective primitive data types 
		System.out.println(intObj.intValue());   
		System.out.println(dbObj.doubleValue());   // unboxing
		System.out.println(fltObj.floatValue());
		System.out.println(charObj.charValue());
		//System.out.println(b.booleanValue());
		
		
		// converting primitive type to string
		String str1=Integer.toString(intObj);
		System.out.println(str1);
		System.out.println(Double.toString(123.503));
		String str2=Long.toString(10020L);
		
		
		// converting string to wrapper class object
		Integer i2=Integer.valueOf(str1);
		System.out.println(i2 + 5);
		System.out.println(Long.valueOf(str2));
		
		
		// converting string back to primitive type
		System.out.println(Integer.parseInt(str1) + 5);
		System.out.println(Long.parseLong(str2));
		

	}
}
		