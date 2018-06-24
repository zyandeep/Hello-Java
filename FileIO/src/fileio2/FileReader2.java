// read from a text file  (ver: 2)
// date: 01-07-14

package fileio2;

import java.io.*;

public class FileReader2 {

    public static void main( String[] args) {
       
        int c ;
        
        // new try-with resource 
        try ( FileReader fr = new FileReader("D:\\toLearn.txt") ){
        
            while ( ( c  = fr.read() ) != -1) {
                System.out.print( (char)c );  
            } 
            
            System.out.println("\n");
        }
        catch (IOException e) {
            System.out.println(e);
            
        }
           
    }
}
