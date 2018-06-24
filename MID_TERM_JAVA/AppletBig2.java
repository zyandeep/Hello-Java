import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletBig2 extends Applet implements ActionListener {
	
	TextField t1, t2, t3;
	Label l1, l2, l3;
	Button b;
	int big = 0;

	public void init() {
		t1 = new TextField(8);
		t2 = new TextField(8);
		t3 = new TextField(8);

		l1 = new Label("FIRST NO: ");
		l2 = new Label("SECOND NO: ");
		l3 = new Label("THIRD NO: ");
		
		b = new Button("Find");

		t1.setText("0");
		t2.setText("0");
		t3.setText("0");

		add(l1); add(t1);
		add(l2); add(t2);
		add(l3); add(t3);
		add(b);
		
		b.addActionListener(this);
		
	}
    
    public void actionPerformed(ActionEvent e) {
        int n1 = 0, n2 = 0, n3 = 0, big = 0;

		try {
			n1 = Integer.parseInt(t1.getText());
			n2 = Integer.parseInt(t2.getText());
			n3 = Integer.parseInt(t3.getText());  
		}
		catch(Exception ex) {}

		big = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
    }
    
    
	public void paint(Graphics g) {
		g.drawString("INPUT A NUMBER ON EACH BOX", 10, 100);
		g.drawString("BIGGEST NUMBER IS = " + String.valueOf(big), 10, 130);	

	}

	public boolean action(Event e, Object o) {
		repaint();
		return true;
	}
}
