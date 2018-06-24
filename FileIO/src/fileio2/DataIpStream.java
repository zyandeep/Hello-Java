// read from a binary file 
// date: 06-07-14

package fileio2;

import java.io.*;

public class DataIpStream {

    public static void main(String[] args) {

        int roll, marks, size;
        File f = new File("D:\\bfile.bin");

        System.out.println(" **** Reading from the data file \"bfile.bin\" **** \n");

        try ( FileInputStream fi = new FileInputStream(f); DataInputStream di = new DataInputStream(fi) ) {

            size = di.available();

            while (size != 0) {

                System.out.println("Available byes to read: " + size);

                roll = di.readInt();
                marks = di.readInt();

                System.out.printf("Roll no =  %d\tmarks = %d\n", roll, marks);
                size = di.available();
            }
            
        } 
        catch (IOException e) {
            System.out.println("File can't open!");

        }
    }
}
