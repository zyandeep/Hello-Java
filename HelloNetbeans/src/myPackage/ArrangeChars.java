//

package myPackage;

import java.util.Scanner;

public class ArrangeChars {
    
    public static void main(String[] args) 
    {
        String word;
        char c, temp[];
        int i, j, pass;
        
        Scanner sc = new Scanner( System.in );
        
        System.out.println("Enter a word: ");
        word = sc.nextLine();
        
        // converting the String to character array
        temp = word.toCharArray();
        
        // no of pass = length of the array - 1
        pass = temp.length - 1;
        
        // sorting using selection sort
        for( i= 0; i < pass; i++ )
        {
            for( j = i + 1; j <= pass; j++)
            {
                if( temp[i] > temp[j] )
                {
                    c = temp[i];
                    temp[i] = temp[j];
                    temp[j] = c;
                }
            }
        }
        
        System.out.println("Arranged word is: " + String.valueOf(temp) );
    }
}
