// object serialization demo with
// complex numbers
// date: 08-07-14

package fileio2;

import java.io.* ;

public class ObjectSer1 {

    public static void main (String[] args) {
        
        File f = new File("D:\\complex.bin");
        ComplexNum n1, n2, n3, n4, n5;
        
        n1 = new ComplexNum(2, 3);
        n2 = new ComplexNum(3, 4);
        n3 = new ComplexNum(4, 5);
        n4 = new ComplexNum(5, 6);
        n5 = new ComplexNum(6, 7);
        
        // ObjectOutputStream class is used for object serialization
        try ( FileOutputStream fos = new FileOutputStream(f);
              ObjectOutputStream oos = new ObjectOutputStream(fos) ) 
        {
            oos.writeObject(n1);
            oos.writeObject(n2);
            oos.writeObject(n3);
            oos.writeObject(n4);
            oos.writeObject(n5);
            
            System.out.println("Complex number objects are written successfully to " + f.getPath());
        }
        catch (IOException e) {
            System.out.println("Error!!!" + e);
        }
    }
}
