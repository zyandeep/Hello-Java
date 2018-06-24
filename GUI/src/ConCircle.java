/**
 * GUI application to draw concentric circles
 * Date: 09/01/2014 
 */

import java.awt.Graphics;
import javax.swing.JPanel;

public class ConCircle extends JPanel {
	
	private int x, y;
	private int w, h;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		w = getWidth() / 2;
		h = getHeight() / 2;
		x = w - 12;
		y = h - 12;
		
		for( int i = 1; i <= 15; i++) {
			
			g.drawOval(x , y, 12 * 2 * i , 12 * 2 * i);
			
			x -= 12;
			y -= 12;
			
		}
		
	}

}
