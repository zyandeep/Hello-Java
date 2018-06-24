// array, char array, string demo
// date: 02-07-14

package myPackage;

public class ArrayTest {

    public static void main(String[] args) {
        
        int[] test = {2, 3, 4, 2} ;
        char[] arr1, arr2 ; 
        int size = 20 ;
        byte[] a ;
        
        String name = "Zyandeep" ;
        
        // array size can be decleared with a variable
        arr1 = new char[size] ;
        arr2 = name.toCharArray();
        a = name.getBytes();
        
        System.out.println(test);  // prints reference 
        System.out.println(arr2);  // prints contains of the char array
        System.out.println(a);     // prints reference 
        
        // prints the byte array
        System.out.println("Byte values of every character...");
        for (byte t: a)
            System.out.println(t);
    } 
}
