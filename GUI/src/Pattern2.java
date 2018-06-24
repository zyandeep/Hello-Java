// GUI pattern drawing 2

import javax.swing.JPanel;
import java.awt.Graphics;

public class Pattern2 extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int x = 0;
		int y = getHeight();
		int z = getWidth();
		
		// for the top-left corner
		for(; ;) {
			
			if(x > getWidth() - 50)
				break;
			
			g.drawLine(0, 0, x, y);
			
			x += 20;
			y -= 10;
			
		}
		
		// for the bottom-right corner
		x -= 20;
		y += 10;
		z =  getWidth();
		int w = getHeight();; 

		for(; ;) {
									
			if(x < 0)
				break;
									
			g.drawLine(z, w, x, y);
									
			x -= 20;
			y += 10;
									
		}

		// for the top-right corner
		x = getWidth() - 20;;
		y = getHeight() - 10;
		z =  getWidth();

		for(; ;) {
					
			if( x < 50)
				break;
					
			g.drawLine(z, 0, x, y);
					
			x -= 20;
			y -= 10;
					
		}
		
		// for the top-left corner
		x += 20 ;
		y += 10 ;
		z = getHeight();
		
		for(; ;) {
			
			if( x > getWidth() - 20)
				break;
			
			g.drawLine(0, z, x, y);
			
			x += 20;
			y += 10;
			
		} 
	}
}
