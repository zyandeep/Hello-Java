// demo of toString() method

public class Test {

	Integer i = 25;
	
	public String toString() {
		return String.format("%s", "Hi there!");
	}
	
	void display() {
		System.out.println(i.toString());
		System.out.println(Integer.toString(100));
		
		//invoke toString() if toString is defined/overridden
		// Otherwise,  returns the address of current object
		System.out.println(this);
		
		//invoke toString() if toString is defined/overridden
		// Otherwise,  returns the address of current object
		System.out.println(toString());
	}
}



