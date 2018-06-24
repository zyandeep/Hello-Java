import java.awt.*;
import java.applet.*;

public class AppletBig extends Applet {
	
	TextField t1, t2, t3;
	Label l1, l2, l3;

	public void init() {
		t1 = new TextField(8);
		t2 = new TextField(8);
		t3 = new TextField(8);

		l1 = new Label("FIRST NO: ");
		l2 = new Label("SECOND NO: ");
		l3 = new Label("THIRD NO: ");

		t1.setText("0");
		t2.setText("0");
		t3.setText("0");

		add(l1); add(t1);
		add(l2); add(t2);
		add(l3); add(t3);
	}

	public void paint(Graphics g) {
		g.drawString("INPUT A NUMBER ON EACH BOX", 10, 100);

		int n1 = 0, n2 = 0, n3 = 0, big = 0;

		try {
			n1 = Integer.parseInt(t1.getText());
			n2 = Integer.parseInt(t2.getText());
			n3 = Integer.parseInt(t3.getText());  
		}
		catch(Exception e) {}

		//big = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
		
		if (n1 > n2 && n1 > n3) {
		    big = n1;
		}
		else if (n2 > n1 && n2 > n3) {
		    big = n2;
		}
		else if (n3 > n1 && n3 > n2) {
		    big = n3;
		}

		g.drawString("BIGGEST NUMBER IS = " + String.valueOf(big), 10, 130);	
	}

	public boolean action(Event e, Object o) {
		repaint();
		return true;
	}
}
