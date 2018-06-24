/**
 * Display a message in a window
 * Date: 08/01/2014
 */

import java.awt.Graphics;

//JPanel class provides an area(panel) inside a window/frame to draw line, text etc.
import javax.swing.JPanel;  

public class MessageDisplsy extends JPanel {
	private String name;
	private String cls;
	private int roll;
	private int age;
	
	public MessageDisplsy() {
		this.name = "Zyandeep Baruah";
		this.cls = "BCA 3rd sem";
		this.roll = 42;
		this.age = 20;
	}
	
	public MessageDisplsy(String name, String cls, int roll, int age) {
		this.name = name;
		this.cls = cls; 
		this.roll = roll;
		this.age = age;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		g.drawString( "S T U D E N T    I N F O R M A T I O N", ( width/2 - 100 ), height/10 );
		g.drawLine( ( width/2 - 110 ), height/8, ( width/2 + 110 ), height/8);
		
		g.drawString( String.format("%s:     %s", "STUDENT NAME", this.name), ( width/2 - 100 ), height/5 );
		g.drawString( String.format("%s:     %s", "CLASS", this.cls), ( width/2 - 100 ), height/4 );
		g.drawString( String.format("%s:     %s", "ROLL NUMBER", this.roll), ( width/2 - 100 ), ( height/4 + 30 ));
		g.drawString( String.format("%s:     %s", "AGE ", this.age), ( width/2 - 100 ), ( height/4 + 60 ));
		
	}
	

}
