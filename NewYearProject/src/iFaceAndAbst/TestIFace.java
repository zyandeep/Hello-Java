/** using interface reference to refer implementations
 *  date: 12/01.2014
 */

package iFaceAndAbst;

public interface TestIFace {
	
	// fields in interface are by default public static final
	int JAVA = 30;
	int CPLSPLS = 20;
	int CSHARP = 25;
	
	// methods in interface are by default public abstract
	void print();
	
}
