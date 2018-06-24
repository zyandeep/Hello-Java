import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Event1 extends Applet implements KeyListener {

	String status = "This applet can sense keyboard keys";

	public void init() {
		addKeyListener(this);
	}

	public void paint(Graphics g) {
		g.drawString(status, 10, 100);
	}


	public void keyTyped(KeyEvent ke) {}

	public void keyReleased(KeyEvent ke) {
		status = "A key is released";
		repaint();
	}

	public void keyPressed(KeyEvent ke) {
		status = "A key is pressed";
		repaint();
	}
}
