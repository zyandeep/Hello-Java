//import pk1.FirstClass;

import pk1.subpk.*;
import pk1.*;

// import pk1.*;    it will only import all the classes, not any subpackages
 
public class TestPackage {

    public static void main(String[] args) {
        new pk1.FirstClass().display();
        new pk1.SecondClass().display();
        new pk1.subpk.SecondClass().display();
    }
} 