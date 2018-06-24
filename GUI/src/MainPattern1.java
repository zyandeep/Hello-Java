// GUI Patter drawing in Java

import javax.swing.JFrame;

public class MainPattern1 {

	public static void main(String[] args) {

		JFrame jf1 = new JFrame("Test Pattern1");
		JFrame jf2 = new JFrame("Test Pattern2");
		
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf1.setSize(500, 500);
		jf2.setSize(500, 500);
		
		jf1.add(new Pattern1());
		jf2.add(new Pattern2());
		
		jf1.setVisible(true);
		jf2.setVisible(true);
		
	}

}
