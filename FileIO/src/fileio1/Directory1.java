// operations with directories
// a File object, which is not refering to any file/directory, is always considered as a directory
// date: 30-06-14

package fileio1;

import java.io.File;
import java.util.Scanner;

public class Directory1 {

    public static void main(String[] args) {

        String dname ; 
        Scanner sc = new Scanner(System.in) ;
        
        System.out.println("Enter the full pathname of the directory: ");
        dname = sc.nextLine();
        
        File dir = new File(dname);

        if (dir.isFile()) {
            System.out.println("it's a file");
        } 
        else {
            System.out.println("it's a directory");
            System.out.println("size: " + dir.length() + " bytes");
            System.out.println("reading from the " + dname + "\\...");

            File f[] = dir.listFiles();

            for (File s : f ) {
                
                if (s.isDirectory()) {
                    System.out.println(s + " is a directory");
                    System.out.println(s.getPath());
                }
            }
        }
    }
}
