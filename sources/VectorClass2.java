/* Shopping list with Vector
*  Date: 02-Oct-13
**************************/
import java.util.Vector;

class VectorClass2
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		if(args.length==0)
		{
			System.out.println("Error in input!");
			return;
		}
		for(int i=0; i<args.length; i++)
			v.addElement(args[i]);
		
		v.removeElement("Soap");
		v.insertElementAt("Computer",4);
		v.addElement(new String("Book"));
		
		String[] str=new String[v.size()];
		v.copyInto(str);
		for(int i=0; i<str.length; i++)
			System.out.println(str[i]);
	}
}