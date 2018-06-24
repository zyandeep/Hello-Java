/**
 * toString() method demo
 * date: 06/01/2014
 */

public class ToString {

	String name = "Zyandeep";  
	int age = 20;
	
	// instance member 
	Test t1 = new Test();
	
	//overrides the toString() method
	public String toString() {
		return String.format("%s, %d", name, age);
	}
	
	public static void main(String[] args) {
	
		ToString obj = new ToString();
		
		//invokes toString() since it's defined
		//otherwise returns the memory address 
		
		System.out.println(obj);
		//System.out.printf("%s, %d\n", obj.name, obj.age );
		
		//obj.t1.display();
		
		//invokes toString() of Test since it's defined
		//otherwise returns the memory address of the Test class object
		//System.out.println(new Test());
					
	}

}
