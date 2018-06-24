
package myPackage;

import java.util.Scanner;

public class WordCount {
    
    public static void main(String[] args) 
    {
        String text = "", word;
        int wc = 0;
        
        Scanner sc = new Scanner( System.in );
        
        System.out.println(" Enter some text: (Press ENTER to quit)");
        text = sc.nextLine();
        
        System.out.println(" Enter the word to count for: ");
        word = sc.next();
        
        // now the Scanner object reference to the String so that we can parse that string
        sc = new Scanner( text );
        
//        // parsing the String into tokens suing next()
//        // next() consider white-space as delimeter
//        while( sc.hasNext() )
//        {
//            temp = sc.next();
//            
//            if( temp.equalsIgnoreCase( word ) )
//                wc++;
//        }
        
        // parsing the String using String.split()
        // split() takes delimeter(s) as a regex as parametere 
        String delim = "[ ,.!]+";
        
        String[] words = text.split( delim );
        
        for( String temp : words )
        {
            if( temp.equals( word ))
                wc++;
        }
        
        //
        System.out.println(" Total occurence of " + word + " is: " + wc);
    }
    
}
