// Random access in data file demo
// search for a id_no within a file 
// date: 09-07-2014

package fileio2;

import java.io.*;
import java.util.Scanner;

public class RandomAccess1 {

    public static void main(String[] args) {

        File f = new File("D:\\bfile.bin");
        int idNo;
        char ans = 'y';
        long filePos;
        boolean bool ;
        Scanner sc = new Scanner(System.in);

        try (RandomAccessFile raf = new RandomAccessFile(f, "r")) {

            while (ans == 'y') {
                
                System.out.println("Enter the id number to search: ");
                idNo = sc.nextInt();
                
                bool = true;
                
                while (bool) {
                    if (raf.readInt() == idNo) {
                        System.out.println(+idNo + " is present in the file!");
                        System.out.println("current file pointer pos: " + raf.getFilePointer());
                        bool = false;
                        raf.seek(0);
                    }
                }
                
                System.out.println("want to continue? (y/n ??)");
                ans = (sc.next()).charAt(0);
            }

        } 
        catch (IOException e) {
            System.out.println("id no is not in the file. (EOF encounters!!)");
        }
    }
}
