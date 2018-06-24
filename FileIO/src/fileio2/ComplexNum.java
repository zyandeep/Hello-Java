// Java class to represents Complex number
// the class which objects to be serialized/de-serialized must implement "Serializable" interface
// date: 08-07-14

package fileio2;

import java.io.Serializable;

public class ComplexNum implements Serializable {
    
    private int x, y ;

    public ComplexNum( int x, int y) {
        this.x = x; 
        this.y = y;
    }
    
    public void show() {
        System.out.print("Complex number: ");
        System.out.println(x + " + i" + y);
    }
    
}
