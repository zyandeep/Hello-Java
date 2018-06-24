/**	Applet Life-Cycle Demo
*   Date: 12/11/13	
***********************************/
import java.applet.Applet;
import java.awt.Graphics;

public class LifeCycle extends Applet {

	public void init() {
	
		System.out.println("Init() starts here...");
		
		// init() will be called when the applet(object) loads in memory; can be thought as applet's constructor
	}
	
	public void start() {
	
		System.out.println("start() is called...");
		
		// start() will be called when the applet starts to run
	}
	
	public void paint(Graphics g) {
	
		System.out.println("paint() is called...");
		g.drawString("paint() is running...", 50, 100);
		
		// paint() will be called when the applet draws something in the applet window
	}
	
	public void stop() {
	
		System.out.println("stop is called...");
		
		// stop() will be called when the applet is minimised
	}
	
	public void destroy() {
	
		System.out.println("destroy() is called...");
		
		// destroy() will be called when the applet will be destroyed
	}
}
