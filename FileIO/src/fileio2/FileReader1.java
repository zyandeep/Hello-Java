// read from a text file  (ver: 1)
// date: 01-07-14

package fileio2;

import java.io.* ;

public class FileReader1 {
    
    public static void main (String[] args) {
        
        File f = new File("D:\\GNU_GPL.txt") ;
        FileReader fr = null ;
        int c ;
        
        try {
            fr = new FileReader(f) ;
            
            while ( ( c  = fr.read() ) != -1) {
                System.out.print( (char)c );  
            } 
            System.out.println("\n");
            
        }
        catch (IOException e) {
            System.out.println("File can't open to read! ");
            
        }
        finally {
            try {
                if (fr != null)
                    fr.close();
            }
            catch ( IOException e) {}
        } 
    }
}
