// create a text file and wtite some text (ver: 1)
// date: 01-07-14

package fileio2;

import java.io.*;

public class FileWriter1 {

    public static void main(String[] args) {

        // create seperate file and stream object
        File f = new File("D:\\", "test.txt");
        FileWriter fw = null;
        String name = "zyandeep baruah";
        int age = 20;

        // file opening and accessing within the same try block
        try {
            f.createNewFile();
            fw = new FileWriter(f);

            fw.write("My name: " + name + "\n");
            fw.write("My weight: " + Integer.toString(age));

        } 
        catch (IOException e) {
            System.out.println(e.getMessage());

        } 
        
        // stream closed in finally block
        finally {
            try {
                if (fw != null)
                    fw.close();
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
                
            }
        }

    }
}
