// basic file operations
// date: 29-06-14

package fileio1;

import java.io.File ;
import java.io.IOException ;

public class FileBasics2 {

    public static void main( String[] args) {
        
        File f1, f2;
        f1 = new File("D:\\file1.txt");
        f2 = new File("D:\\file2.txt");
        
        try {
            f1.createNewFile();
            f2.createNewFile();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println(f1.compareTo(f2));
        System.out.println(f1.isAbsolute()); 
        
        f1.setExecutable(false);
        f1.setReadable(false);
        f1.setWritable(false);
        
        System.out.println("execute? " + f1.canExecute());
        System.out.println("read? " + f1.canRead());
        System.out.println("write? " + f1.canWrite());
        
        f1.delete();
        f2.renameTo( new File("D:\\zyandeep.txt"));
        
    }
}
