/**
 * Date: 06/01/0214
 * @author Zyandeep
 *
 */
public class InnerTest {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.showOuter();
		o.testInner();
		
		// inner class member can not be accessed from another class as the inner class is declared as private
		//System.out.println("inner class y: " + o.i.y);
		//System.out.println("inner class final member: " +o.i.NUMBER);
		
		// scope of inner class is within the outer class
		// new Inner().showInner();  causes error!
		
		new LocalInner().testInn();
		
		// error! class Inn is not visible here
		//new Inn().displayOwn();
	}
	

}
