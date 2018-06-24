import java.applet.*;
import java.awt.*;

/* <applet code = "UserInput" width="500" height="700">
	</applet>
*/	

public class UserInput extends Applet {
	
	String s1, s2;
	TextField t1,t2;
	
	public void init() {
		
		t1 = new TextField();
		t2 = new TextField();
		add(t1);
		add(t2);
		t1.setText("0");
		t2.setText("0");
	}
	
	public void paint(Graphics g) {
	
		g.drawString("Enter two integer ", 50, 50);
		
		s1 = t1.getText();
		s2 = t2.getText();
		int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
		
		g.drawString("Sum is: " + sum, 50, 80);
	}
	
	public boolean action(Event e, Object o) {
		
		repaint();
		return true;
	}

}
