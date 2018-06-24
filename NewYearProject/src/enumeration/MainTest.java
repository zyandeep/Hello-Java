package enumeration;

public class MainTest {

	public static void main(String[] args) {

		Test2 t = new Test2();

		/*
		 * Test t = new Test(); t.testMeth();
		 * 
		 * System.out.println(t.a_def); //System.out.println(t.a_pri);
		 */

		System.out.println("inside main()...\n");
		System.out.println("a_def: " + t.ob.a_def);
		System.out.println("a_meth()...\n");
		t.ob.a_meth();
		
		System.out.println();
		
		System.out.println("invoking Test2.testmath()...\n");
		t.testMeth();

		// can't accesss private member of inner class A
		// System.out.println(t.ob.a_pri);

	}

}
