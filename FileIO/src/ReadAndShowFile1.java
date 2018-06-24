/*
 * Display a text file
 * The name of the text file is given through the command line
 * Every file access operation throws exception
 */

import java.io.*;

public class ReadAndShowFile1 {

	public static void main(String[] args) {

		FileInputStream file = null;
		int i;

		// confirming the name of the file
		if (args.length == 0) {
			System.out.println("file name is not specified!");
			return;
		}

		// attempt to open the file
		try {
			file = new FileInputStream(args[0]);

		} catch (FileNotFoundException e) {
			System.out.println("cannot open the file");
			return;
		}

		// attempt to read the file until EOF is encountered
		try {
			do {
				i = file.read();
				if (i != -1)
					System.out.print((char) i);

			} while (i != -1);

		} catch (IOException e) {
			System.out.println("Error reading the file");
		}

		// attempt to close the file
		try {
			if (file != null)
				file.close();

		} catch (IOException e) {
			System.out.println("file cannot be closed");

		}

	}
}
