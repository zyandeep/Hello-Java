// nesting of packages 

// package declaration 
package testPackage.pkg;

public class Pkg {

	private int n1;
	private int n2;
	
	public Pkg(int a, int b) {
		System.out.format("\n\n%s\n", "Arithmetic operations..");
		this.n1 = a;
		this.n2 = b;
	}
	
	public void arith() {
		System.out.printf("%d + %d = %d\n", n1, n2, ( n1 + n2 ));
		System.out.printf("%d - %d = %d\n", n1, n2, ( n1 - n2 ));
		System.out.printf("%d * %d = %d\n", n1, n2, ( n1 + n2 ));
		System.out.printf("%d / %d = %d\n", n1, n2, ( n1 + n2 ));
	}
}