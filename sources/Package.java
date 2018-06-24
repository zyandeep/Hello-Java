/* user-defined package 
*  Date: 11-sept-13
**************************/
import arithmetic.*;
import modulus.*;

class Package
{
	public static void main(String[] z)
	{
		Arithmetic a=new Arithmetic(10,20);
		System.out.println("Arithmetic package: ");
		System.out.println("Addition: "+a.addition());
		System.out.println("Subtraction: "+a.subtraction());
		System.out.println("Multiplication: "+a.multiplication());
		System.out.println("Division: "+a.division());
		System.out.println("Modulus package: ");
		System.out.println("10 % 20= "+Modulus.mod(10,20));
		System.out.println("50.35 % 2.8= "+Modulus.mod(50.35,2.8));
	}
}
