package inner;

public class MainInnerClass1 {

	public static void main(String[] args) {
		
		TestInnerClass1 tic = new TestInnerClass1();
		
		tic.show();
		
		// accessing inner class member as the inner class is not declared private
		tic.ia.show();
		
		// InnerA ia = new InnerA();  InnerA is not visible here
		
		// new TestInnerClass1.InnerA();  error! 
		// An inner class object can be instantiated only within its enclosing class
	}

}
