/*
* Demo of applet programming
* Date: 19/11/2013
********************************/
import java.applet.*;
import java.awt.*;

/*
	<applet code="SimpleApplet" width="200" height="300"> </applet>
*/	

public class SimpleApplet extends Applet {

	public void paint(Graphics g) {
	
		g.drawString("Java makes Applet easy!", 50 , 60);
	}
}