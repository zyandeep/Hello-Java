// Inner class demo
// date: 11/01/2012

package inner;

public class TestInnerClass1 {
	
	int x = 10;
	InnerA ia = new InnerA();  // An inner class object can be instantiated only within its enclosing class
	
	void show() {
		System.out.println("outer x: " + x);
		
		new InnerA().show();
	}
	
	protected class InnerA {
		String s = "i am from inner class!";
		
		void show() {
			System.out.println(s);
		}
	}
			
}
