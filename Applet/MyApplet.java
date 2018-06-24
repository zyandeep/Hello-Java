/*
 *  A Simple Applet to draw a string
 *  Date: 12/11/13
 */
import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
	
	public void paint(Graphics g) {
		
		g.drawString("Hello Applet!", 100, 50);
		
		// here 100,50 specifies the position of the string
		
	}

}
