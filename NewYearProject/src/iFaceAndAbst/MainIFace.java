// main method

package iFaceAndAbst;

public class MainIFace {

	public static void main(String[] args) {
		
		// can't be instantiated 
		TestIFace ref;
		
		// ref refers to ImpIface1 object
		ref = new ImpIface1();
		ref.print();
		
		// ref refers to ImpIFace2 object
		ref = new ImpIFace2();
		ref.print();

	}

}
