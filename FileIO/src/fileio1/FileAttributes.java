//
package fileio1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileAttributes {

    public static void main(String[] args) {

        String path = "D:\\gpl.txt";

        Path file = Paths.get(path);

        BasicFileAttributes attr = null;

        try {

            attr = Files.readAttributes(file, BasicFileAttributes.class);

        } catch (Exception e) 
        {
            System.out.println( e );
        }

        
        if ( attr != null )
        {
            
        System.out.println("creationTime     = " + attr.creationTime());
        System.out.println("lastAccessTime   = " + attr.lastAccessTime());
        System.out.println("lastModifiedTime = " + attr.lastModifiedTime());

        System.out.println("isDirectory      = " + attr.isDirectory());
        System.out.println("isOther          = " + attr.isOther());
        System.out.println("isRegularFile    = " + attr.isRegularFile());
        System.out.println("isSymbolicLink   = " + attr.isSymbolicLink());
        System.out.println("size             = " + attr.size());
        }

    }
}
