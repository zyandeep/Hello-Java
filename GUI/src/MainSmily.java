// Main application of smile face

import javax.swing.JFrame;

public class MainSmily {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("Smily Face");
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(500, 500);
		jf.add( new SmilyFace());
		jf.setVisible(true);

	}

}
