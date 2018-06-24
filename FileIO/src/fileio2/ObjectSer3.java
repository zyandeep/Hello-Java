// Java's Object serialization
// date: 08-07-14
package fileio2;

import java.io.*;
import java.util.Scanner;

public class ObjectSer3 {
    
    public static void main(String[] args){
    
        char ans = 'y' ;
        Student s ;
        File f = new File("D:\\student.bin");
        Scanner sc = new Scanner(System.in) ;
    
        try ( FileOutputStream fos = new FileOutputStream(f);
              BufferedOutputStream bos = new BufferedOutputStream(fos);
              ObjectOutputStream oos = new ObjectOutputStream(bos)) 
        {
            System.out.println("Enter students data\n***********************");
            
            while (ans == 'y') {
                s = read();
                oos.writeObject(s);
                
                System.out.println("want to continue?? (y/n) ");
                ans = (sc.next()).charAt(0);
            }
        }
        catch (IOException e) {
            System.out.println("ERROR!! " + e);
        }
    }
    
    public static Student read () {
        Student s;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("name: ");
        String n = sc.next();
        System.out.println("address: ");
        String a = sc.next();
        System.out.println("phy: ");
        int p = sc.nextInt();
        System.out.println("chem: ");
        int c = sc.nextInt();
        System.out.println("math: ");
        int m = sc.nextInt();
        
        s = new Student();
        s.readData(n, a, p, c, m);
        
        return s ;
    }
}

