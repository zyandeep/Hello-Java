// Buffered byte stream demo
// date: 07-07-14

package fileio2;

import java.io.* ;

public class BufferOutput {

    public static void main (String[] args) {
        
        File f = new File("D:\\bfile.bin");
        int i ;
        
        // chaining of streams
        try ( FileOutputStream fos = new FileOutputStream(f) ;
              BufferedOutputStream bos = new BufferedOutputStream(fos) ;
              DataOutputStream dos = new DataOutputStream(bos) ) 
        {
            
            for (i = 1; i <= 1000; i++)
                dos.writeInt(i);
            
            System.out.println("Data has been written successfully!! ");
        }
        catch (IOException e) {
            System.out.println("File IO error!");
        }
    }
}
