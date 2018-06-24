// Buffered character stream io
// with BufferedReader and BufferedWriter
// buffering of data improves faster io and adds re-readability
// date: 07-07-14

package fileio2;

import java.io.* ;
import java.util.Scanner ;

public class BufferedText {
    public static void main (String[] args) {
        
        File f = new File ("D:\\bufferText.txt");
        Scanner sc = new Scanner(System.in) ;
        String text = " ";
        
        System.out.println("*** Buffered io on text file ***");
        
        try ( FileWriter fw = new FileWriter(f); BufferedWriter bw = new BufferedWriter(fw)) {
            
            System.out.println("Enter some text.... (press only \"return\" key to quit)" );
            
            while (text.length() != 0) {
                text = sc.nextLine();
                bw.write(text);
                bw.newLine();
            }
        }
        catch (IOException e) {
            System.out.println("File IO error! " + e);
        }
    }
    
}
