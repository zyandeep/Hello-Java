// Buffered byte stream demo
// date: 07-07-14

package fileio2;

import java.io.* ;

public class BufferInput {

    public static void main (String[] args) {
        
        File f = new File("D:\\bfile.bin");
        int i ;
        
        // chaining of streams
        try ( FileInputStream fis = new FileInputStream(f) ;
              BufferedInputStream bis = new BufferedInputStream(fis) ;
              DataInputStream dis = new DataInputStream(bis) ) 
        {
            
            System.out.println("Reading from the file... ");
            
            while (dis.available() != 0) {
                i = dis.readInt();
                System.out.println(i);
            }
            
        }
        catch (IOException e) {
            System.out.println("File IO error!");
        }
    }
}
