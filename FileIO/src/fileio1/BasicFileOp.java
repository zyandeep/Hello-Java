// basic file operations with File class
// date: 30-06-14

package fileio1;

import java.io.File ;
import java.io.IOException;

public class BasicFileOp {

   public static void main (String[] args) {
       
       File f1, f2 ;
       
       // creates two File instances
       f1 = new File("D:\\abc.txt");
       //f2 = new File("D:\\zyandeep.txt");
       
      System.out.println("abc.txt exist? " + f1.exists());
      //System.out.println("zyandeep.txt exist? " + f2.exists());
////       
////       if (f2.delete())
////           System.out.println("test.txt is deleted ");
////       else
////           System.out.println("can't delete test.txt ");
////       
//       // creates two new files
//       try {
//           if ( f1.createNewFile())
//               System.out.println("new file is created");
//           else
//               System.out.println("file is overwritted!");
//           //f2.createNewFile();
//       }
//       catch( IOException e) {
//           System.out.println("can't create file: " + e);
//           
//      }
       
       f1.renameTo( new File("D:\\sex.txt"));
       System.out.println(f1.getName());
       
       f1 = null ;
       
       f2 = new File("D:\\", "sex.txt");
       
       f2.deleteOnExit();
   }
}
