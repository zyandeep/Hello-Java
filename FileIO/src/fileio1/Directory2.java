// file and directory manipulation
// date: 01-07-14

package fileio1;

import java.io.File ;

public class Directory2 {

    public static void main(String[] args) {
        
        File f1, f2, temp;
        f1 = new File("D:\\test\\temp");
        f2 = new File("D:\\temp");
        temp = new File ("D:\\test\\zyandeep");
        
        // creating directories
        System.out.println("Directory crated? " + f1.mkdirs() + " in " + f1.getAbsolutePath());
        System.out.println("Directory crated? " + f2.mkdir() + " in " + f2.getPath());
        
//        System.out.println("Directory deleted? " + f1.delete());
//        System.out.println("Directory deleted? " + f2.delete());
        
        System.out.println("Directory renamed? " + f1.renameTo(temp));
        System.out.println(f1.getName());
        System.out.println(temp.getName());
        
        System.out.println(f1.exists());
        System.out.println(temp.exists());
        
        
    }
}
