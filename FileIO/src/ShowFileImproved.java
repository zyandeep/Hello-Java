/*
 * An improved version of ReadAndShowFile.
 * It uses one try-catch block for opening and accessing file and a finally block to
 * close the file.  
 */

import java.io.*;

public class ShowFileImproved {

	public static void main(String[] args) {

		FileInputStream file = null;
		int i;

		// confirming about the file name
		if (args.length != 1) {
			System.out.println("file name is not specified!");
			return;
		}

		// one try-catch block to open and to access file
		try {
			file = new FileInputStream(args[0]);

			// reading the file until EOF occurs
			do {
				i = file.read();

				if (i != -1)
					System.out.print( (char)i);

			} while (i != -1);

		} catch (IOException e) {
			System.out.println("I/O error occurs:\t" + e);

		}

		// finally block to close the file
		finally {
			try {
				if (file != null)
					file.close();
				
			} catch (IOException e) {
				System.out.println("cannot close the file:\t" + e);

			}
		}

	}

}
