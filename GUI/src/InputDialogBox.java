/**
 * Input dialog box
 * Date: 07/01/2014
 * 
 */

// JOptionPane class provides all necessary dialog boxes
import javax.swing.JOptionPane;

public class InputDialogBox {

	public static void main(String[] args) {
		
		// input dialog box for getting text-input from user
		String name = JOptionPane.showInputDialog( "What is your name?" );
		
		// message dialog box
		//JOptionPane.showMessageDialog( null, "Welcome to Swing " + name + "!" );
		JOptionPane.showMessageDialog( null, String.format( "%s %s !", "Welcome to Swing", name ) );
	}

}
