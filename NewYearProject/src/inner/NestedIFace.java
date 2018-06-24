// nested or inner interface

package inner;

public class NestedIFace {
	String acName;
	
	public NestedIFace(String ac) {
		acName = ac;
	}
	
	// inner/nested interface has default access 
	interface BankAccount {
		int acNumber = 112233;
		
		void showDetails(); 
	}
	
	public void testMet() {
		System.out.println("A/C number (access by same class method) :\t" + BankAccount.acNumber);
		
	}

}
