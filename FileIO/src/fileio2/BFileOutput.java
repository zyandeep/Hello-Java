// write to a data/binary file  (ver: 1)
// date: 04-07-14

package fileio2;

import java.io.*;
import java.util.Scanner;

public class BFileOutput {

    public static void main(String[] args) {

        int roll, tmarks;
        File f = new File("D:\\bfile.bin");
        Scanner input = new Scanner(System.in);
        
        try ( FileOutputStream fo = new FileOutputStream(f) ) {

            // reading from consol
            while (true) {
                
                System.out.println("Enter roll no: ");
                roll = input.nextInt();
                
                if (roll == -1 )
                    break;

                System.out.println("Enter total marks: ");
                tmarks = input.nextInt();

                // writing data to the file
                fo.write(roll);
                fo.write(tmarks);

                System.out.println("one record has been written..");
                
            }
            
        } catch (IOException e) {
            System.out.println("File can't open!");

        }
    }
}
