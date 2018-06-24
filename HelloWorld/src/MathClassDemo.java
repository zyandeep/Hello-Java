/**
 * Math class methods demo 
 */

import static java.lang.Math.*;    // static import

public class MathClassDemo {

	public static void main(String[] args) {
		
		System.out.println(ceil(12.25));   // integer >= the argument 
		System.out.println(abs(-12.25));
		System.out.println(floor(12.25));   // integer <= the argument
		System.out.println(max(12,25));
		System.out.println(min(12,25));
		System.out.println(ceil(12.00));
		System.out.println(floor(12));  
		
		// toString() methods returns string representation of an object
		Integer i = new Integer("50");
		System.out.println(i.toString() + " paisa.");
		System.out.println(Integer.toString(20) + " years old!"); 
		
	}

}
