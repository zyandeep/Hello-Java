// Main application of concentric circle

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainConCircle {

	public static void main(String[] args) {
			
		JFrame jf = new JFrame( "Concentric Circles" );
		jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		jf.setSize( 500, 500 );
		jf.add( new ConCircle());
		jf.setVisible(true);
	}

}
