// Java program to copy a file 

import java.io.*;

class CopyFile {

	public static void main(String[] args) {
	
		FileInputStream fin = null;
		FileOutputStream fout = null;
		int i;
		
		// checking for the two file names
		if(args.length != 2) {
		
			System.out.println("file name is not specified");
			return;
		}
		
		// copy a file
		try {
		
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);
			
			do {
			
				i = fin.read();
				
				if(i != -1)
					fout.write(i);
					
			}while(i != -1);
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
			
				System.out.println(args[1] + " can't be closed successfully!");
			}
			try {
			
				if(fin != null)
					fin.close();
			}
			catch(IOException e) {
			
				System.out.println(args[0] + " can't be closed successfully!");
			}
		}
		
		System.out.println("i am done!");
	}
}