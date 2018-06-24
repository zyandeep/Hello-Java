// test on inner class 
package enumeration;

public class Test2 {

	int a_out = 1;
	A ob = new A();

	// A is visible outside of Test2
	class A {
		int a_def = 2;
		private int a_pri = 3;

		void a_meth() {
			System.out.println("inside a_meth()...\n");
			System.out.println("a_pri: " + a_pri);
			System.out.println("a_out: " + a_out);

		}
	}

	void testMeth() {
		System.out.println("inside testMeth()...\n");
		System.out.println("a_def: " + ob.a_def);

		// outer class can access private members of inner class A
		System.out.println("a_pri: " + ob.a_pri);
		ob.a_meth();
	}

}
