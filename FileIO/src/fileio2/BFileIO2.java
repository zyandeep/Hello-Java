// binary file io DataI/O Stream classes
// writing numbers from 1 - 100
// date: 06-07-14

package fileio2;

import java.io.*;

public class BFileIO2 {
    
    public static void main (String[] args) {
        
        File f = new File("D:\\bfile2.bin") ;
        int num ;
        
        System.out.println("writing numbers from 1 to 100...");
        
        try ( FileOutputStream fo = new FileOutputStream(f); DataOutputStream dos = new DataOutputStream(fo)) {
            for (num = 1; num <= 100; num ++) 
                dos.writeInt(num);
        }
    
        catch (IOException e) {
            System.out.println("IO error on the file!!! ");
        }
        
        System.out.println("bfile is being read...\n");
        
        // file is opened for reading
        try ( FileInputStream fi = new FileInputStream(f); DataInputStream dis = new DataInputStream(fi) ) {
            
            while ( dis.available() != 0) {   // check for the next integer
               num = dis.readInt();
               System.out.println(num);
            }  
        }
        catch (IOException e) {
            System.out.println("Can't read the file!!");
        }
    }
}
