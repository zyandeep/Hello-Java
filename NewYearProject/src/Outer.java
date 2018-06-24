// Nested class and Inner class
// inner class is based on the concept BLOCK SCOPE

public class Outer {

	int x = 10;
	Inner i = new Inner();  // inner class object
	
	// scope of inner class is within the block of outer class
	// declare inner class as private as its a member of outer class
	private class Inner {
		int y = 50;
		
		// static int a = 100; static can't be applied to an inner class member 
		final int NUMBER = 100;
		
		void showInner() {
			System.out.println("Outer class x = " +x);   // x is visible here
			System.out.println("Inner class y = " +y);
		}
	}
	
	void showOuter() {
		System.out.println("Outer class x = " +x);
		
		// System.out.println("Inner class y = " +y); 	error, scope of y is within the block of inner
		
		i.showInner();
	}
	
	void testInner() {
		System.out.println("inner class y : " +i.y);
		
		// inner class object
		new Inner().showInner();
	}
}
