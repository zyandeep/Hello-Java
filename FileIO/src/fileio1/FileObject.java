// File class demo with a simple file
// date: 29-06-14

package fileio1;

import java.io.File;

public class FileObject {

    public static void main(String[] args) {
        
        // create a new file object
        File f = new File("D:\\Java\\sample.txt");
        
        // basic methods of File class
        System.out.println("Is a File?  " + f.isFile());
        System.out.println("IS a Directory?  " + f.isDirectory());
        System.out.println("File existence: " + f.exists());
        System.out.println("File's absolute path: " + f.getAbsolutePath());
        System.out.println("File relative path: " + f.getPath());
        System.out.println("File name: " + f.getName());
        System.out.println("Parent directory: " + f.getParent());
        
        System.out.println("File read?  " + f.canRead());
        System.out.println("File write?  " + f.canWrite());
        System.out.println("File execute?  " + f.canExecute());
        System.out.println("Is file hidden?  " + f.isHidden());
        
        System.out.println("File size is bytes:  " + f.length());
        System.out.println("File last modified on:   " + f.lastModified());
    }
}
