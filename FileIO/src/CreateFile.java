// Create a text file in Java 

import java.io.*;
import java.util.Scanner;

class CreateFile {

	public static void main(String[] args) {
	
		FileOutputStream fout = null;
		String[] text = new String[100];
		int i;
		
		Scanner scan = new Scanner(System.in);
		
		if(args.length != 1) {
		
			System.out.println("file name is not specified");
			return;
		}
		
		System.out.println("Enter some lines of text. Press 'q' to quit");
		
		for(i = 0; i<100; i++){
			text[i] = scan.nextLine();
			if(text[i].equals("q")) 
				break;
		}
			
		// creating and writing to file
		try {
		
			fout = new FileOutputStream(args[0]);
			
			for(String temp: text) {
			
				if(temp == null)
					break;
				
				if( !temp.equals("q")) {
				
					fout.write('\n');
			
					for(i = 0; i<temp.length(); i++)
						fout.write(temp.charAt(i));
				}
				
			}
		}
		catch(IOException e) {
		
			System.out.println("I/O error:\t" + e);
		}
		finally {
		
			try {
			
				if(fout != null)
					fout.close();
			}
			catch(IOException e) {
			
				System.out.println("I/O error:\t" + e);
			}
		}
		
		System.out.println("i am done!");
	}
}