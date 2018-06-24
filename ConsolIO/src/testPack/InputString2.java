// Reading strings from the System.in using Scanner class   

package testPack;

import java.util.Scanner;

public class InputString2 {

	public static void main(String[] args) {
		
		String str;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Strings, 'q' to quit...");
		
		// nextLine() method considers whitespace
		do {
			str = scan.nextLine();    
			System.out.println(str);
			
		}while (str.charAt(0) != 'q' );
		
		System.out.println("i am done! ");
		
		// character stream is closed
		scan.close();
	}

}
