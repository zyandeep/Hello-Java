/*
 * Simple graphics in applet
 * Date: 15/12/13
 */

import java.applet.*;
import java.awt.*;

public class AppGraphics extends Applet {

	public void paint(Graphics g) {
		
		g.drawString("Hello Graphics!", 50, 50);
		
		g.drawString("Hello World!", 50, 60);

	}

}
