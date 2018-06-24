// Buffered character stream io
// buffering of data improves faster io and adds re-readability
// date: 07-07-14

package fileio2;

import java.io.* ;

public class BufferText {
    public static void main (String[] args) {
        
        File f = new File("D:\\toLearn.txt");
        String text = " ";
        
        System.out.println("Buffering input data from D:\\GNU_GPL.txt ...\n");
        
        try ( BufferedReader br = new BufferedReader( new FileReader(f)) ) {
            
           while (text != null) {
               
               text = br.readLine();
               
               if (text != null)
                System.out.println(text);
           } 
           
        }
        catch (IOException e) {
             System.out.println("File IO error! " + e);
        }
    }
}
