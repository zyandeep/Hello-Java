// access modifier and package

package p1;

public class Proctection {

	int n = 10;
	private int n_pri = 20;
	protected int n_pro = 30;
	public int n_pub = 100;
	
	public Proctection() {
		System.out.println("\nProtection is instantiated!");
		
		System.out.println("n:\t" + n);
		System.out.println("n_pri:\t" + n_pri);
		System.out.println("n_pro:\t" + n_pro);
		System.out.println("n_pub:\t" + n_pub);
		System.out.printf("\n\n");
	}
	
}