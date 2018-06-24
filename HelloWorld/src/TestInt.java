interface Demo {
	
	int i = 20;
	final static double f = 25.50;
	String s = "Hello World!";
}

public class TestInt {

	public static void main(String[] args) {
		
		System.out.println("Testing Interface...");
		System.out.println(Demo.i);
		System.out.println(Demo.s);
		System.out.println(Demo.f);
	}

}
