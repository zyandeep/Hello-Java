/* Java's Exception handling
*  Date: 10-Oct-13
**************************/
import java.io.FileReader;
//import java.io.FileNotFoundException;

public class DemoException
{
	double division(double d1, double d2)
	{
		double c=0;
		try{
			
			c=d1/d2;
			FileReader ft=new FileReader("text.txt");
		}
		
		catch(FileNotFoundException f){
		
			System.out.println(f.getMessage);
		}
		
		catch(Arithmetic Exception a){
		
			System.out.println(a.getMessage);
		}
		
		catch(Exception e){
		
			System.out.println(e.getMessage);
		}
		
		finally{
		
			System.out.println("")
		}
	}
	public static void main(String args[])
	{
		
	}
}