// Demo of try-with-resource
// This program works with JDK 7 or later

import java.io.*;

class TryWithResource {

	public static void main(String[] args) {
	
		int i;
		
		// using try-with-resource
		try( FileInputStream fin = new FileInputStream("D:\\Sample.txt") ) {
		
			// attempt to read the file
			do {
			
				i = fin.read();
				
				if(i != -1)
					System.out.print( (char)i);
					
			}while(i != -1);
		}
		catch(IOException e) {
		
			System.out.println("I/O error:\t" + e);
		}
	}
}  