// Main application of cascaded shapes

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainbarChart {

	public static void main(String[] args) {
		
		String s;
		int[] arr = new int[5];
		
		JOptionPane.showMessageDialog(null, "Enter 5 numbers between 1-30");
		
		for(int i = 0; i<5; i++) {
			s = JOptionPane.showInputDialog("Enter number");
			arr[i] = Integer.parseInt(s);			
		}
		
		
		JFrame jf = new JFrame( "Bar Chart drawing program" );
		jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		jf.setSize( 700, 500 );
		jf.add( new BarChart(arr));
		jf.setVisible(true);
	}

}
