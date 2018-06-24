// Console output through Character Stream

package outputpack;

import java.io.*;

public class CharStreamOutput {

	public static void main(String[] args) {
		
		// creating an instance of PrintWriter class
		PrintWriter pw = new PrintWriter(System.out, true);
		
		pw.print("hello world!\n");
		pw.print("This is a string");
		int i = -7;
		pw.println(i);
		double d = 4.5e-2;
		pw.println(d);
		pw.printf("\n%d\t%s", i, "JAVA LIFE!!!");
		
	}

}
