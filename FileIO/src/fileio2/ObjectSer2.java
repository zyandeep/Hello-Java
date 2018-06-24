// object serialization demo with
// complex numbers
// date: 08-07-14

package fileio2;

import java.io.* ;

public class ObjectSer2 {

    public static void main (String[] args) {
        
        File f = new File("D:\\complex.bin");
        ComplexNum[] arr = new ComplexNum[5] ;
        
        // ObjectInputStream class is used for object de-serialization
        try ( FileInputStream fis = new FileInputStream(f);
              ObjectInputStream ois = new ObjectInputStream(fis) ) 
        {
            // reading complex number objects form the file
            System.out.println(ois.available());
            
            for (int i = 0; i < 5; i++) {
                arr[i] = (ComplexNum) ois.readObject() ;
            }
            
            System.out.println("5 complex number objects are successfully read " + f.getPath());
        }
        
        // new JDK 7's multi catch feature
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Error!!!" + e);
        }
        
        // displaying complex numbers from the array
        for (int i = 0; i < 5; i++) {
                arr[i].show();
            }
    }
}
