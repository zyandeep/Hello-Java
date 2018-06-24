// a text file is opened with InputStream

package fileio2;

import java.io.* ;

public class Test1 {

    public static void main (String[] args) {
        
        File f = new File("D:\\abc.txt");
        
        if (! f.exists())
            System.out.println("File doesn't exist!");
        
        else {
            try ( FileInputStream fis = new FileInputStream(f) ) {
                System.out.println("size: " + fis.available() + " bytes.");
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
            
    }
}
