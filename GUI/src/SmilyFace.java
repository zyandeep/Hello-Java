/**
 * GUI application to draw a smile face 
 * date: 10/01/2014
 */

import java.awt.*;
import javax.swing.JPanel;

public class SmilyFace extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// draw the face
		g.setColor(Color.YELLOW);
		g.fillOval(30, 30, 400, 400);
		
		// draw the eyes
		g.setColor(Color.BLACK);
		g.fillOval(140, 140, 50, 50);
		g.fillOval(280, 140, 50, 50);
		
		// draw the nose
		g.fillOval(215, 230, 50, 30);
		
		// draw the smile face
		g.fillOval(155, 280, 165, 70);
		g.setColor(Color.YELLOW);
		g.fillOval(155, 280, 165, 57);
	   
	}

}
