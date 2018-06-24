// print only odd numbers from the binary file 
// date: 07-07-14

package fileio2;

import java.io.* ; 

public class SkipBytes {

    public static void main (String[] args) {
        
        File f = new File("D:\\bfile2.bin");
        int num;
        
        System.out.println("Reading odd numbers from the file...\n");
        
        try ( FileInputStream fis = new FileInputStream(f); DataInputStream dis = new DataInputStream(fis) ) {
            
            while (dis.available() != 0) {
                num = dis.readInt();
                System.out.println(num);
                
                // skip every other 4 bytes
                dis.skip(4);
            }
        }
        catch (IOException e) {
            System.out.println("File IO error! " + e);
        }
    }
}
