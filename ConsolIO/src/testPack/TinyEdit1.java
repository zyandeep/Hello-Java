// Reading lines of texts using Scanner.nextline()

package testPack;

import java.util.Scanner;

public class TinyEdit1 {

	public static void main(String[] args) {
		
		String text;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter lines of texts..");
		System.out.println("Enter 'stop' to quit.");
		
		// reading texts
		do {
			text = scan.nextLine();
			System.out.println("\t" + text);
			
		}while ( ! text.equals("stop") );
		
		System.out.println("i am done! ");
		
		// character stream is closed
		scan.close();
	}

}
