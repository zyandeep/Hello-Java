// Reading characters from the System.in using Scanner class   

package testPack;

import java.util.Scanner;

public class InputClass {

	public static void main(String[] args) {
		
		char ch;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter characters, 'q' to quit...");
		
		//read characters
		do {
			ch = scan.next().charAt(0);
			System.out.println(ch);
			
		}while (ch != 'q' );
		
		System.out.println("i am done! ");
		
		// character stream is closed
		scan.close();
	}

}
