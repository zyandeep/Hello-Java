/*
 *  A Simple Applet to adding  
 *  Date: 12/11/13
 */
import java.applet.Applet;
import java.awt.Graphics;

public class Addition extends Applet {
	
	public void paint(Graphics g) {
		
		int a = 30;
		int b = 50;
		int sum = a+b;
		
		String str = "The Sum is " + String.valueOf(sum);
		
		g.drawString(str, 50, 100);
		
		// here 100,50 specifies the position of the string
		
	}

}
