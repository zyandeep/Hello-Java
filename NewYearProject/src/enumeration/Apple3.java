// enum implements as class in Java
// in Java enum defines a class type

package enumeration;

public enum Apple3 {
	
	// these are objects of enum Apple3 
	Jonathan(10), RedDel(20), GoldenDel, Cortland(30), Winesap;
	
	// instance variable
	private int price;
	
	// default constructor 
	Apple3() { 
		System.out.println("default constructor is invoked!");
		price = -1;
	}
	
	// user defined constructor
	Apple3(int p) { 
		System.out.println("user-defined constructor is invoked!");
		price = p;
	}
	
	// instance methods
	public void setPrice(int p) {
		price = p;
	}
	
	public int getPrice() {
		return this.price;
	}
	
}
