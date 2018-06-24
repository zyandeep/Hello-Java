/*
* Getting user input in applet
* Date: 14/11/13
************************************/
import java.applet.*;
import java.awt.*;

/* <applet code="UserInput" width="500" height="700"> </applet>
*/

public class UserInput extends Applet {

	TextField t1,t2;
	
	public void init() {
	
		t1 = new TextField(8);
		t2 = new TextField(8);
		add(t1);
		add(t2);
		t1.setText("0");
		t2.setText("0");
	}
	
	public void paint(Graphics g) {
	
		String s1,s2;
		int a = 0, b = 0, sum = 0;
		
		s1 = t1.getText();
		s2 = t2.getText();
		
		try {
		
			a = Integer.parseInt(s1);
			b = Integer.parseInt(s2);
		
		} catch(Exception e) {}
		
		sum = a + b;
		
		s1 = "The sum is " + sum;
		
		g. drawString(s1,50,50);
	}
	
	public boolean action(Event e, Object o) {
	
		repaint();
		return true;
	}
}