// access modifier and package

package p1;

public class Derived extends Proctection{

	public Derived() {
		System.out.println("Derived is instantiated!");
		
		System.out.println("n:\t" + n);
		System.out.println("n_pro:\t" + n_pro);
		System.out.println("n_pub:\t" + n_pub);
		
		// n_pri is not visible here as it is private 
		// System.out.println("n_pri:\t" + n_pri);   ERROR!
		
	}
	
}