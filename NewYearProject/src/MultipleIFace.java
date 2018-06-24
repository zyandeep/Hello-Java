// implementing multiple interfaces

import inner.InterFace2;
import iFaceAndAbst.InterFace1;

public class MultipleIFace implements InterFace1, InterFace2 {

	public static void main(String[] args) {
		
		MultipleIFace obj = new MultipleIFace();
		
		obj.add(12, 5);
		obj.print();
		obj.print("zyandeep", 20);
		
	}
	
	public void print() {
		System.out.println(i);
		System.out.println("hello world, hello Java!\n");
	}
	
	public void print(String str, int age) {
		System.out.println("Your name:\t" + str);
		System.out.println("Your age:\t" + age + "\n");
	}
	
	// while implementing methods, parameter name may change 
	public void add(int num1, int num2) {
		System.out.printf("sum of %d and %d = %d\n",  num1, num2, num1+num2);
	}

}
