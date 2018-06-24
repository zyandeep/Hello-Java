// partial implementation of interface

package iFaceAndAbst;

public abstract class PartialImp implements TestIFace2 {
	
	public void add() {
		System.out.println("\n\nNUM1 = " + NUM1);
		System.out.println("NUM2 = " + NUM2);
		System.out.println("Addition = " + ( NUM1 + NUM2 ));
	}
	
	// abstract class may have constructor
	public PartialImp() {
		System.out.println("\nPatialImp is instantiated!");
	}

	// this class does implement other method 
	// so the class is made abstract
}
