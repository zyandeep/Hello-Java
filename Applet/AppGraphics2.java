/*
 *  Simple Graphics in Applet
 *  Date: 15/11/13
 */

import java.applet.*;
import java.awt.*;

public class AppGraphics2 extends Applet {
	
	public void paint(Graphics g) {
		
		//g.setColor(Color.red);
		
		g.drawRoundRect(500, 80, 200, 120, 5, 5); // monitor
		g.drawRoundRect(510, 90, 180, 100, 5, 5);  // dual-layer
		g.fillRect(590, 200, 20, 40);	// monitor stand
		g.drawOval(570, 220, 60, 20);  // stand base
		
		g.setColor(Color.blue);
		g.drawRoundRect(520, 250, 160, 50, 7, 7); // keyboard
		g.drawRoundRect(750, 100, 60, 130, 7, 7); // CPU
		
		g.setColor(Color.red);
		g.fillOval(730, 260, 25, 35); // mouse
		
		g.drawString("HELLO APPLET!", 555, 135);
		
	}

}
