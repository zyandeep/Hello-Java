// importing packages

import testPackage.*;
import testPackage.pkg.*;

class MainPackage {

	public static void main( String[] args) {
	
		new TestPackage( "John", 20).print();
		new Pkg( 100, 20).arith();
	}
}