/**
 * GUI applcation to dispaly student information
 * Date: 08/01/2014
 * 
 */

// allow us to create a standard window
import javax.swing.JFrame;   
import javax.swing.JOptionPane; // provides standard dialog boxes

public class MainApp {

	public static void main(String[] args) {
		
		String name, cls, roll, age;
		JFrame jf = new JFrame();
		
		// getting input
		name = JOptionPane.showInputDialog( "Enter student name" );
		cls = JOptionPane.showInputDialog( "Enter student class" );
		roll = JOptionPane.showInputDialog( "Enter student roll number" );
		age = JOptionPane.showInputDialog( "Enter student age" );
		
		//MessageDisplsy o1 = new MessageDisplsy();
		MessageDisplsy o2 = new MessageDisplsy(name, cls, Integer.parseInt(roll), Integer.parseInt(age));
		
		jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		jf.add( o2 );
		jf.setSize(400, 400);
		
		JOptionPane.showMessageDialog( null, "Thank you for submitting information!" );
		
		// set the window(JFrame) in visible mood
		// and paintComponent() is automatically invoked
		jf.setVisible( true );
		
		
	}

}
