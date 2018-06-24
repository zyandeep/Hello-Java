/* Vector Class and Common Vector class methods
*  Date: 02-Oct-13
**************************/
import java.util.Vector;

// Vector is a dynamic 1-D array which holds only objects of any types and any numbers

class VectorClass
{
	public static void main(String[] args)
	{
		Vector v=new Vector();   // Creation of a vector; v
		if(args.length==0)
		{
			System.out.println("No input is given!");
		}
		else
		{
			// add elements to vector
			for(int i=0; i<args.length; i++)
				v.addElement(args[i]);    
			
			
			// prints the no.of current objects in the vector 
			System.out.println("size of the vector= " +v.size());

			
			// returns the object at index 1(MUST be explicitly typecast) 
			String s=(String) v.elementAt(1);
			System.out.println(s);
			
			
			// returns the index of a particular object
			System.out.println("index of the object= " +v.indexOf("ASP.NET"));
			
			
			// removes the vector element "ASP.NET
			v.removeElement("ASP.NET");
			System.out.println("index of the object= " +v.indexOf("ASP.NET"));
			System.out.println("size of the vector= " +v.size());
		
			
			// copy the vector objects into a String array
			String[] str=new String[v.size()];
			v.copyInto(str);
			for(int i=0; i<str.length; i++)
				System.out.println(str[i]);   // prints the string array elements
			
			
			// removes all the objects from the vector
			v.removeAllElements();
			
			// checks if the vector is empty
			if(v.isEmpty())
			{
				System.out.println("vector is empty");
				System.out.println("size of the vector= " +v.size());
			}
			
			
			// add elements to vector
			v.addElement("Delhi");
			v.addElement("Kolkata");
			v.addElement("Channai");
			v.addElement("Mumbai");
			System.out.println("size of the vector= " +v.size());
			
			
			// removes the element/object at index 0
			v.removeElementAt(0);
			System.out.println("size of the vector= " +v.size());
			
			
			// inserts the element/object at index 0
			v.insertElementAt("Guwahati",0);
			System.out.println("size of the vector= " +v.size());
			
			
			// copy the vector objects into a String array
			str=new String[v.size()];
			v.copyInto(str);
			for(int i=0; i<str.length; i++)
				System.out.println(str[i]);
		}
	}
}