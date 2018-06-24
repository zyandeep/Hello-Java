import java.awt.*;
import java.applet.*;

public class HelloApplet2 extends Applet {
	String name;
	int height = 0;
	int width = 0;
	int area = 0;

	public void init() {
		name = getParameter("name");

		try {
			width = Integer.parseInt(getParameter("width"));
			height = Integer.parseInt(getParameter("height"));

			area = width * height;
		}
		catch(Exception e) { } 

	}

	public void paint(Graphics g) {
		g.drawString("Name: " + name, 10, 100);
		g.drawString("Area: " + String.valueOf(area), 10, 120);
	}
}