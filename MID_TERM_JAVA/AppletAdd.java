import java.awt.*;
import java.applet.*;

public class AppletAdd extends Applet {
	
	TextField t1, t2;
	Label l1, l2;

	public void init() {
		t1 = new TextField(8);
		t2 = new TextField(8);
		l1 = new Label("FIRST NO: ");
		l2 = new Label("SECOND NO: ");

		t1.setText("0");
		t2.setText("0");

		add(l1); add(t1);
		add(l2); add(t2);
	}

	public void paint(Graphics g) {
		g.drawString("INPUT A NUMBER ON EACH BOX", 10, 100);

		int n1 = 0, n2 = 0, sum = 0;

		try {
			n1 = Integer.parseInt(t1.getText());
			n2 = Integer.parseInt(t2.getText()); 

			sum = n1 + n2;
		}
		catch(Exception e) {}

		g.drawString("SUM IS = " + String.valueOf(sum), 10, 130);	

	}

	public boolean action(Event e, Object o) {
		repaint();
		return true;
	}
}