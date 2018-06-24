import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MyBarChart extends Applet implements ActionListener {

	Label[] years;
	TextField t1, t2, t3, t4;
	Button b;
	int[] values;
	int i;

	public void init() {
		values = new int[4];
		years = new Label[4];

		years[0] = new Label("2000");
		years[1] = new Label("2001");
		years[2] = new Label("2002");
		years[3] = new Label("2003");

		t1 = new TextField(8);
		t1.setText("0");
		t2 = new TextField(8);
		t2.setText("0");
		t3 = new TextField(8);
		t3.setText("0");
		t4 = new TextField(8);
		t4.setText("0");

		b = new Button("OK");
		b.addActionListener(this);

		add(years[0]); add(t1);
		add(years[1]); add(t2);
		add(years[2]); add(t3);
		add(years[3]); add(t4);

		add(b);
	}

	public void paint(Graphics g) {
		g.drawLine(0, 570, 600, 570);

		for (i = 0; i < values.length; i++) {
			g.drawString(years[i].getText(), i*100+20, 590);

			g.fillRect(i*100+20, 570-values[i], 40, values[i]);
		}
	}

	public void actionPerformed(ActionEvent e) {
		try {
			values[0] = Integer.parseInt(t1.getText());
			values[1] = Integer.parseInt(t2.getText());
			values[2] = Integer.parseInt(t3.getText());
			values[3] = Integer.parseInt(t4.getText());
		}
		catch(Exception ex) {}

		repaint();
	}
}
