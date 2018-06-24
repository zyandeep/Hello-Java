/** creating package in 
*	date: 13/01/2041
********************************/
// package declaration
package testPackage;

public class TestPackage {

	private String name;
	private int age;
	
	public TestPackage(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println("\n Your name: " + name);
		System.out.println("you are " + age + " old !");
	}
}

