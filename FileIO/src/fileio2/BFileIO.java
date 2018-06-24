// not so appropiate.... good for character stream io
// binary file io with PrintStream and Scanner
// date: 06-07-14

package fileio2;

import java.io.* ;
import java.util.Scanner ;

public class BFileIO {

    public static void main (String[] args) {
        
        File f = new File("D:\\bfile.bin");
        int num ;
        
        System.out.println("writing numbers from 1 to 100...");
        
        try ( FileOutputStream fo = new FileOutputStream(f); PrintStream ps = new PrintStream(fo)) {
            for (num = 1; num <= 100; num ++) 
                ps.println(num);
        }
        catch (IOException e) {
            System.out.println("IO error on the file!!! ");
            
        }
        
        System.out.println("bfile is being read...\n");
        
        // file is opened for reading
        try ( Scanner ipf = new Scanner(f) ){
            
            while ( ipf.hasNextInt() ) {   // check for the next integer
               num = ipf.nextInt();
                System.out.println(num);
            }  
        }
        catch (FileNotFoundException e) {
            System.out.println("Can't read the file!!");
        }
    }
}
