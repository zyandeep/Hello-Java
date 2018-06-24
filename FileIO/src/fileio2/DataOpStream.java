// write to a data/binary file through DataOutputStream
// date: 06-07-14

package fileio2;

import java.io.File ;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataOpStream {

    public static void main(String[] args) {
        
        File f = new File("D:\\bfile.bin") ;
        int roll, marks;
        Scanner s = new Scanner(System.in);
        
        try ( FileOutputStream fo = new FileOutputStream(f); DataOutputStream d = new DataOutputStream(fo) ){
            
            while (true) {
                System.out.println("Roll no: ");
                roll = s.nextInt();
                
                if (roll == -1)
                    break ;
                
                System.out.println("Total marks: ");
                marks = s.nextInt();
                
                d.writeInt(roll);
                d.writeInt(marks);
                
                System.out.println("one record is written!");
            }
            
        }
        catch (IOException e) {
            System.out.println("File IO error!");
            
        }
                
    }
}
