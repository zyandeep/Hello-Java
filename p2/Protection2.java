// access modifier and package

package p2;
import p1.*;

public class Protection2 extends Proctection{

	public Protection2() {
		System.out.println("Protection2 is instantiated!");
		
		// System.out.println("n:\t" + n); 		n is not visible as it got default access
		
		System.out.println("n_pro:\t" + n_pro);
		System.out.println("n_pub:\t" + n_pub);
		
		// n_pri is not visible here as it is private 
		// System.out.println("n_pri:\t" + n_pri);   ERROR!
	}
	
}