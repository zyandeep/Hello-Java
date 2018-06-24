// Implementation of interface

package iFaceAndAbst;

public class ImpIface1 implements TestIFace {
	
	public void print() {
		System.out.println("from ImpIface1:");
		System.out.println("Java: " + JAVA);
		System.out.println("C++: " + CPLSPLS);
	}
	
}
