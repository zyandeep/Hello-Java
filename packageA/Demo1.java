// packages in java

package packageA;

public class Demo1 {

	public int a,b;

	public Demo1(int a, int b) {
	
		System.out.println("Demo1 is instantiated!");
		this.a = a;
		this.b = b;
	}
	
	public int sum() {
		
		return a + b;
	}
}
