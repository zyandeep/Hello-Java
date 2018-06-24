// this module can be used for my NOTEPAD project
/***********************************************************/

// program to calculate total number of lines, words  and character
// date: 11-07-2014

// package fileio1;

import java.io.*;
import java.util.Scanner;

public class WordCount {

    static int words = 0, lines = 0, chars = 0;

    public static void main(String[] args) {

        String textLine, fileName;
        Scanner input = new Scanner(System.in);

        System.out.println(" enter the file name with complete path: ");
        fileName = input.nextLine();

        File f = new File(fileName);

        // chaining of byte stream classes
        try ( FileInputStream fis = new FileInputStream(f);
              BufferedInputStream bis = new BufferedInputStream(fis);
              Scanner sc = new Scanner(bis) )  
        {
            while (sc.hasNextLine()) {

                textLine = sc.nextLine();

                // counts total no. of lines
                lines++;

                // counts total no. of characters
                chars = chars + textLine.length();

                // invokes wordCount to count total no. of words 
                wordCount(textLine);
            }

            // display lines, words, characters
            System.out.println(" total lines = " + lines);
            System.out.println(" total character = " + chars);
            System.out.println(" total words = " + words);

        } 
        catch (IOException e) {
            System.out.println("ERROR");
        }
    }

    // this method calculates total no. of words in the given file
    static void wordCount(String line) {
        
        int i = 0, j = 0;
        
        // converts the String object to an equivalent character array
        char[] arr = line.toCharArray();
        
        while (i < arr.length) {

            if ((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z')
                    || (arr[i] >= '0' && arr[i] <= '9')) {
                                
                    j = i + 1;

                while ( j < arr.length && ((arr[j] >= 'a' && arr[j] <= 'z') || (arr[j] >= 'A' && arr[j] <= 'Z')
                        || (arr[j] >= '0' && arr[j] <= '9')) ) 
                {
                    
                    j++;
                }

                // counts total no. of words
				// a word contains more than one characters
				if ( (i+1 < arr.length) && ((arr[i+1] >= 'a' && arr[i+1] <= 'z') || (arr[i+1] >= 'A' && arr[i+1] <= 'Z')|| 
				   (arr[i+1] >= '0' && arr[i+1] <= '9')) )
				
                words++;

                i = j;
            }
          
            i++;
        }
    }
}