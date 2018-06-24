// text file io with PrintWriter and Scanner
// date: 06-07-14

package fileio2;

import java.io.*;
import java.util.Scanner;

public class TextFileIO {

    public static void main(String[] args) {

        File f = new File("D:\\GNU_GPL.txt");
        String text = " ";
//        Scanner ip = new Scanner(System.in);
//
//        System.out.println("Wtite some text... (press q to quit)");
//
//        try (FileWriter fw = new FileWriter(f); PrintWriter pw = new PrintWriter(fw)) {
//
//            while (!text.equalsIgnoreCase("q")) {
//
//                text = ip.nextLine();   // reads a line untill the "retun" or "enter" is pressed
//                
//                if (! text.equalsIgnoreCase("q"))
//                    pw.println(text);
//            }
//            System.out.println("text has been written succeccfully!");
//
//        }
//        catch (IOException e) {
//            System.out.println("File IO error!");
//            
//        }
//        
        System.out.println("testFile is being read...\n");
        
        // file is opened for reading
        try ( Scanner ipf = new Scanner(f) ){
            
            while ( ipf.hasNext() ) {   // check for the next string
                text = ipf.nextLine();
                System.out.println(text);
            }
            
        }
        catch (FileNotFoundException e) {
            System.out.println("Can't read the file!!");
        }
        
    }
}
