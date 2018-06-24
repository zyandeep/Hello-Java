class Adder {
	
	static int add(int a, int b) {
		return a+b;
	} 
	
	static double add(double a, double b) {
		return a+b;
	}

	static double add(int a, double b, long c) {
		return a+b+c;
	}  
} 


public class FuncOverloading {  

	public static void main(String[] args) {  
		System.out.println(Adder.add(11, 11));  
		System.out.println(Adder.add(12.3, 12.6));
		System.out.println(Adder.add(12, 12.6, 8));  
	}
} 