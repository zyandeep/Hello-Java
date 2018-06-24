// access modifier and package

package p1;

public class SampleClass{

	// creates an instance of Protection to access the instance members
	Proctection pt = new Proctection();
	
	public SampleClass() {
		System.out.println("SampleClass is instantiated!");
		
		System.out.println("n:\t" + pt.n);
		System.out.println("n_pro:\t" + pt.n_pro);
		System.out.println("n_pub:\t" + pt.n_pub);
		
		// n_pri is not visible here as it is private 
		// System.out.println("n_pri:\t" + pt.n_pri);   ERROR!
	}
	
}