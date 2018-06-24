/**
 * Choice based cascaded shape drawing
 * Date: 09/01/0214
 * @author Zyandeep
 */

import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel {

	private int choice;

	public Shapes(int c) {
		choice = c;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(int i = 1; i <=10; i++) {
			
			switch(this.choice) {
			case 1:
				g.drawRect(5 * i, 5 * i, 30 * i, 20 * i);
				break;
			case 2:
				g.drawOval(5 * i, 5 * i, 30 * i, 20 * i);
				break;
			
			}
		}
		
	}
}
