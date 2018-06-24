// GUI pattern drawing 1

import javax.swing.JPanel;
import java.awt.Graphics;

public class Pattern1 extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int x = 0;
		int y = getHeight();
		
		for(; ;) {
			
			if(x > getWidth() - 25)
				break;
			
			g.drawLine(0, 0, x, y);
			
			x += 20;
			y -= 10;
			
		}
	}
}
