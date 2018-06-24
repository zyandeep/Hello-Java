import java.awt.Graphics;
import java.applet.Applet;

public class HelloApplet extends Applet {

	public void paint(Graphics g) {
		g.drawString("Hello Applet, RIP!!", 10, 100);
	}
}