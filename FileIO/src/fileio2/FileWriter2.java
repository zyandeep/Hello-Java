// create a text file and wtite some text (ver: 2)
// date: 01-07-14

package fileio2;

import java.io.* ;

public class FileWriter2 {
    
    public static void main(String[] args) {
        
        // FileWriter object creats both stream and file object
        FileWriter fw = null ;
        String name = "Zyandeep Baruah" ;
        int age = 20 ;
        
        // file opening and accessing within the same try block
        try {
            fw = new FileWriter("D:\\temp.txt");
            
            fw.write("My name is: " + name + "\n");
            fw.write("My age is: " + Integer.toString(age));
            
        }
        catch (IOException e) {
            System.out.println(e);
        }
        
        // stream closed in finally block
        finally {
            try {
                if (fw != null)
                    fw.close();
            }
            catch (IOException e) { }
        }
    }
    
 }
