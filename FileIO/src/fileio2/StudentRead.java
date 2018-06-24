// student class contains name, roll, address
// marks in phy, chem and math
// date: 08-07-14

package fileio2;

import java.io.* ;

public class StudentRead {
    
    public static void main (String[] args) {
        
        File f = new File("D:\\student.bin");
        Student s;
    
        try ( FileInputStream fis = new FileInputStream(f);
              BufferedInputStream bis = new BufferedInputStream(fis);
              ObjectInputStream ois = new ObjectInputStream(bis)) 
        {
           
            while (true) {
                s = (Student) ois.readObject();
                s.showData();
            }
            
        }
        catch (ClassNotFoundException | IOException e) {
            
            // readObject() throws EOFException when EOF encounters
        }
    }
}
