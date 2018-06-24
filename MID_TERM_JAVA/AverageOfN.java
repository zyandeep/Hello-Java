import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AverageOfN extends Applet implements ActionListener {
	
	int size = 0;
	TextField t1;
	Label l1;
	Button b1;
	TextField[] numbers;
	double avg = 0.0;

	public void init() {
		t1 = new TextField(8);
		t1.setText("0");
		l1 = new Label("How many numbers: ");
		b1 = new Button("OK");
		
		b1.addActionListener(this);		

		add(l1); add(t1); add(b1);	
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == b1) {
			try {
				size = Integer.parseInt(t1.getText());
			}
			catch(Exception ex) {}
		
			numbers = new TextField[size];

			Button b2 = new Button("Average");
		
			for(int i = 0; i < size; i++) {
				numbers[i] = new TextField(8);
				numbers[i].setText("0");
				add(numbers[i]);
			}
		
			add(b2);
			b2.addActionListener(this);

		}
		else {
			double sum = 0;
			
			try {
				for(int i = 0; i < size; i++) {
					sum = sum + Integer.parseInt(numbers[i].getText());
				}
				avg = sum / size;
			}
			catch(Exception ex) {}
			
			repaint();
		}
	}

	public void paint(Graphics g) {
		g.drawString("The average is: " + avg, 10, 100);
	}
}
