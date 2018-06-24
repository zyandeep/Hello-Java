// list files and directories of a directory recursively
// date: 07-07-14
// author: Zyandeep

package fileio1;

import java.io.File;
import java.util.Scanner;

public class ListDir {

    public static void main(String[] args) {

        String dirName;
        File f;
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter the directoy name with path to list: ");
        dirName = ip.nextLine();
        f = new File(dirName);
        
        if (f.exists())
        // calling the recursive function to list directory contents
            listD(f);
        else {
            System.out.println("File/directory doesn't exist!!");
            System.out.println(f.isDirectory());
            System.out.println(f.isFile());
        }
            
    }

    static void listD(File f) {

        if (f.isFile()) {
            System.out.println(f.getPath() + "\\" + f.getName() + " is a file!!");
            return;
        }

        System.out.println("\n\tDescending to " + f.getPath());
        
        File[] fileArr = f.listFiles();

        for (int i = 0; i < fileArr.length; i++) {

            if (fileArr[i].isFile()) {
                System.out.println(fileArr[i].getPath() + "\\" + fileArr[i].getName());
            } 
            else {
                System.out.println("<DIR> " + fileArr[i].getPath() + "\\" + fileArr[i].getName());
            }
        }
        
        // traversing the File[] array
        for (File temp : fileArr) {

            if ( temp.isDirectory() ) {
                listD(temp);
            }
        }
    }
}