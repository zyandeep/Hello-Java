// GUI Patter drawing in Java

import javax.swing.JFrame;

public class MainPattern2 {

	public static void main(String[] args) {

		JFrame jf = new JFrame("Test Pattern3");
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(500, 500);
		jf.add(new Pattern3());
		jf.setVisible(true);
		
	}

}
