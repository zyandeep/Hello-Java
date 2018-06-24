// Filtering files while direcory listing
// date: 01-07-14

package fileio1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class FilterFiles {

   static class OnlyTxt implements FilenameFilter {

        String filter;

        public OnlyTxt(String temp) {
            this.filter = temp;
        }

        public boolean accept(File dir, String name) {

            if (name.endsWith(filter)) {
                return true;

            } else {
                return false;
            }

        }
    }

    public static void main(String[] args) {
        
        String dname, pattern;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the full pathname of the directory: ");
        dname = sc.nextLine();
        System.out.println("Enter the pattern to filter ");
        pattern = sc.nextLine();

        File dir = new File(dname);
        OnlyTxt obj = new OnlyTxt(pattern) ;

        if (dir.isFile()) {
            System.out.println("it's a file"); 
        } 
        else {
            System.out.println("it's a directory");
            System.out.println("size: " + dir.length() + " bytes");
            System.out.println("reading from the " + dname + "\\...");

            String s[] = dir.list(obj);

            for (String temp : s) {
                System.out.println(temp);
            }
        }
    }
}
