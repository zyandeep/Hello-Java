// Main application of cascaded shapes

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapeTest {

	public static void main(String[] args) {
		
		String s;
		int choice;
		
		s = JOptionPane.showInputDialog( String.format( "%s\n \t%s \t%s", "Enter your choice", "1. Rectangle", "2. Ovel" ));
		choice = Integer.parseInt(s);
		
		JFrame jf = new JFrame( "Cascaded Shapes" );
		jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		jf.setSize( 500, 500 );
		jf.add( new Shapes( choice ));
		jf.setVisible(true);
	}

}
