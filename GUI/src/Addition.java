/**
 * Addition of two numbers in GUI
 * Date: 08/04/2014]
 * 
 */

// JOptionPane class has static methods for all necessary dialog boxes
import javax.swing.JOptionPane;

public class Addition {

	public static void main(String[] args) {
		
		int num1, num2, sum;
		String s1, s2;
		
		// input dialog box or text-input
		s1 = JOptionPane.showInputDialog("Enter the frist number");
		num1 = Integer.parseInt(s1);
		s2 = JOptionPane.showInputDialog("Enter the second number");
		num2 = Integer.parseInt(s2);
		
		sum = num1 + num2;
		
		// display the result in a message dialog box
		//JOptionPane.showMessageDialog(null, "Sum is " + sum);
		JOptionPane.showMessageDialog( null, String.format( "%s %d", "The Sum is", sum ));

	}

}
