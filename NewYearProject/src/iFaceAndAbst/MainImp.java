// abstract class is extended

package iFaceAndAbst;

public class MainImp extends PartialImp {
	
	public MainImp() {
		System.out.println("\nMainImp is instantiated!");
	}

	public static void main(String[] args) {
		
		TestIFace2 rf = new MainImp();   // ok
		
		// rf = new PartialImp();   error! as PartialImp is abstract
		
		rf.add();
		rf.sub();
	}

	public void sub() {
		System.out.println("\n\nNUM1 = " + NUM1);
		System.out.println("NUM2 = " + NUM2);
		System.out.println("Subtraction = " + ( NUM1 - NUM2 ));
	}
	
}


