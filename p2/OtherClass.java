// access modifier and package

package p2;
import p1.*;

public class OtherClass{

	// need to create to access instance members
	Proctection pt = new Proctection();
	
	public OtherClass() {
		System.out.println("OtherClass is instantiated!");
		
		// System.out.println("n:\t" + pt.n);     pt.n is not visible as it got default access 
		// System.out.println("n_pro:\t" + pt.n_pro);   pt.n_pro is not visible as it got protected access
		
		System.out.println("n_pub:\t" + pt.n_pub);
		
		// n_pri is not visible here as it is private 
		// System.out.println("n_pri:\t" + pt.n_pri);   ERROR!
	}
	
}