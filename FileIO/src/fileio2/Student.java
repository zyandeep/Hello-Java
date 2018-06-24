// student class contains name, roll, address
// marks in phy, chem and math
// date: 08-07-14

package fileio2;

import java.io.Serializable ;
import java.util.Scanner ;

public class Student implements Serializable {
    
    // student's data
    private String name;
    private String address ;
    private int roll ;
    private int phy ;
    private int chem ;
    private int math ;
   
    public Student() {
        
    }
    
    // method to read a student's data
    public void readData(String sname, String addrss, int p, int c, int m) {
        this.name = sname;
        this.address = addrss;
        this.phy = p;
        this.chem = c;
        this.math = m;
    }
    
    // method to print a student's data
    public void showData() {
        System.out.println("Student name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("phy = " + this.phy + " chem = " + chem + " math = " + math);
    }
    
}
