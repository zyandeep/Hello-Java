import java.awt.*;
import java.applet.*;

public class StringConcat extends Applet {

	TextField t1, t2;

	public void init() {
		t1 = new TextField(8);
		t2 = new TextField(8);

		t1.setText(" ");
		t2.setText(" ");

		add(t1); add(t2);
	}

	public void paint(Graphics g) {
		String s1, s2;

		s1 = t1.getText();
		s2 = t2.getText();

		g.drawString("The Concatened String: " + s1 + " " + s2,  10, 200);
	}

	public boolean action(Event e, Object o) {
		repaint();
		return true;
	}
}