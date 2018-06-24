/*
*	Applet program to create a button
*	Date: 19/11/13 
*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AppButton extends Applet implements ActionListener {

	String msg = "";
	Button b;
	
	public void init() {
	
		b = new Button("Yes");
		add(b);
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
	
		String str = e.getActionCommand();
		if(str.equals("Yes") ) 
			msg = "You have clicked Yes ";
			
		repaint();
	}
	
	public void paint(Graphics g) {
	
		g.drawString(msg, 6, 100);
	}
	
}