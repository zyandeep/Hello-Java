/**
 * GUI application to draw line in a window
 * Date: 08/01/2014
 *
 */

// Graphics class contains instance-methods for drawing shapes and text
import java.awt.Graphics;     
import javax.swing.JPanel;	// JPanel class provides an area to draw (its a Java's GUI component)

// extends JPanel to override paintComponent()
// system calls paintComponent() to implicitly to display/create the JPanel
public class LineDrawing extends JPanel {
	
	public void paintComponent(Graphics g) {

		// needs to be the first line
		super.paintComponent(g);
		
		// getting width and height of the panel
		int height = getHeight();
		int width = getWidth();
		
		// drawing lines on the JPanel
		g.drawLine(0, 0, width, height);
		g.drawLine(0, height, width, 0);
		
	}

}
