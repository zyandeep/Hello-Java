// Reading lines of texts using Scanner.nextline()

package testPack;

import java.util.Scanner;

public class TinyEdit2 {

	public static void main(String[] args) {
		
		// array of Strings objects
		String[] text = new String[100];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter lines of texts..");
		System.out.println("Enter 'stop' to quit.");
		
		// reading texts
		for(int i = 0; i<100 ; i++) {
			
			text[i] = scan.nextLine();
			
			if(text[i].equalsIgnoreCase("stop"))
				break;
		}
		
		System.out.println("\n Here is your file...\n");
		
		for(int i = 0; i<100; i++) {
			
			if(text[i].equalsIgnoreCase("stop"))
				break;
			System.out.println(text[i]);
			
		}
		
		// character stream is closed
		scan.close();
	}

}
