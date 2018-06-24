/** access modifier and package
*	date: 11/01/2014
************************************/
import p1.*;
import p2.*;

public class TestAccessSpe {

	public static void main(String[] args) {
	
		// new HelloJava().hello(); 	error! as both the package has the same class
		// so, must be explicitly specified with corresponding package name
		new p1.HelloJava().hello();
		new p2.HelloJava().hello();
		
		// testing access specifier
		new Proctection();
		new Derived();
		new SampleClass();
		new Protection2();
		new OtherClass();
		
	}
	
}
	
 