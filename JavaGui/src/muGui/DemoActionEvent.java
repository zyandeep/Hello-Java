// Action listener demo

import java.awt.event.*;

import javax.swing.*;

public class DemoActionEvent implements ActionListener {

	DemoJPanel jp;

	public DemoActionEvent(DemoJPanel jp) {

		this.jp = jp;
	}

	public void actionPerformed(ActionEvent e) {
		
		JButton temp = (JButton) e.getSource();
		
		if(temp == jp.b1)
			jp.cl.show(jp.dp, "Red");
		
		else if(temp == jp.b2)
			jp.cl.show(jp.dp, "Blue");
		
		else
			jp.cl.show(jp.dp, "Green");
			
	}

}
