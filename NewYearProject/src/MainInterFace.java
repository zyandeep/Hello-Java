/** unlike class, an interface can extend more than one interface
 *  date: 12/01/2014
 */

import iFaceAndAbst.InterFace1;

public interface MainInterFace extends InterFace1, inner.InterFace2{
	
	String i = "\n From MainInterface...";
	
	void show();
	
	// method overriding in interface
	void add(int n1, int n2);
	
	
}
