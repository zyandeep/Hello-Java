// drawing in Swing

import javax.swing.*;

import java.awt.*;

public class DemoJPanel extends JFrame {

	JPanel dp = new JPanel();
	JPanel bp = new JPanel();
	JButton b1, b2, b3;
	JPanel p1, p2, p3;
	CardLayout cl = new CardLayout();

	public DemoJPanel() {
		super("*** Button Demo ***");
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(dp, BorderLayout.CENTER); // adding panels two JFrame
		add(bp, BorderLayout.SOUTH);
		
		setUp();
	}
	
	public void setUp() {

		bp.setLayout(new FlowLayout(FlowLayout.CENTER, 8, 20));
		b1 = new JButton("Red");
		b2 = new JButton("Blue");
		b3 = new JButton("Green");
		bp.add(b1);
		bp.add(b2);
		bp.add(b3); // adding buttons to panel

		dp.setLayout(cl); 			// adding "cards" to panel
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		
		p1.setBackground(Color.red);
		p2.setBackground(Color.green);
		p3.setBackground(Color.blue);
		
		dp.add(p1, "Red");
		dp.add(p2, "Green");
		dp.add(p3, "Blue");
		
		DemoActionEvent ae = new DemoActionEvent(this);
		
		b1.addActionListener(ae);
		b2.addActionListener(ae);
		b3.addActionListener(ae);
	}

	public static void main(String[] args) {
		new DemoJPanel();

	}

}
