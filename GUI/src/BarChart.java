/**
 * GUI application to display bar chart
 * date: 09/01/2014
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BarChart extends JPanel {
	
	private int[] arr = new int[5];
	
	public BarChart( int[] x ) {
		
		// copying data from local array to instance array
		for( int i = 0; i < x.length; i++) {
			arr[i] = x[i];
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		 
		int height = getHeight();
		int width = getWidth();
		int x = 60, y = 10, rh = height - 40;
		
		// draw the base axises
		g.drawLine(30, rh, width - 200, rh);
		g.drawLine(30, rh, 30, 40);
		
		g.drawString("BAR CHART REPRESANTATION", width/2, 20);
		
		for( int i = 0; i < arr.length; i++) {
			
			switch(i) {
			case 0:
				g.setColor(Color.red);
				break;
			case 1:
				g.setColor(Color.BLUE);
				break;
			case 2:
				g.setColor(Color.MAGENTA);
				break;
			case 3:
				g.setColor(Color.green);
				break;
			case 4:
				g.setColor(Color.ORANGE);
				break;	
			}
		
			g.fillRect(x * (i+1), (rh - arr[i]*10), 30, (rh - (rh - arr[i]*10)));
			
			g.drawString(String.format("%s", arr[i]), x * (i+1), rh+20);
			
		}
	}

}
