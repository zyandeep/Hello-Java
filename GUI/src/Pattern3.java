// GUI pattern drawing in Java 3

import java.awt.Graphics;
import javax.swing.JPanel;

public class Pattern3 extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int x1 = 0, y1 = 0;
		int x2 = 15, y2 = getHeight();
		
		while( (x1 == 0 && y1 <= getWidth() ) && ( x2 <= getWidth() &&  y2 <= getHeight() ) ) {
			
			g.drawLine(x1, y1, x2, y2);
			
			y1 += 15;
			x2 += 15; 
		}
	}

}
