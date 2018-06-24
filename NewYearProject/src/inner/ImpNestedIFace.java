// implementing inner/nested interface

package inner;

// inner/nested interface BankAccount is visible here as it's  not private 
public class ImpNestedIFace implements NestedIFace.BankAccount {

	// instance of NestedIFace class to access the instance members
	NestedIFace nf = new NestedIFace("Paul Frank");
	
	public static void main(String[] args) {
		
		new ImpNestedIFace().showDetails();

	}
	
	public void showDetails() {
		System.out.println("A/C name:\t" + nf.acName);
		System.out.println("A/C number (direct access):\t" + acNumber);
		nf.testMet();
	}

}
