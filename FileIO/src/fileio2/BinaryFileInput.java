// read from a binary file 
// date: 04-07-14

package fileio2;

import java.io.*;

public class BinaryFileInput {

    public static void main(String[] args) {

        int roll, tmarks;
        File f = new File("D:\\bfile.bin");

        System.out.println(" **** Reading from the data file \"bfile.bin\" **** \n");

        try (FileInputStream fi = new FileInputStream(f)) {
            
            int size = fi.available();
          
            byte[] data = new byte[size];
            fi.read(data);
           
            for (int i = 0; i < data.length; i+=2 ) {
                roll = data[i];
                tmarks = data[i+1];
                
                System.out.println("roll no: " + roll + " total marks: " + tmarks);
                       
            }
           
        } catch (IOException e) {
            System.out.println("File can't open!");

        }
    }
}
