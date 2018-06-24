// Implementation of interface

package iFaceAndAbst;

public class ImpIFace2 implements TestIFace{

	public void print() {
		System.out.println("\n\n from ImpIface2:");
		
		// since JAVA and CSHARP are static members of TestIFace  
		System.out.println("Java: " + TestIFace.JAVA);
		System.out.println("C#: " +TestIFace.CSHARP);
	}
}
