/**
 * Creating a window to hold the panel
 * Date: 08/01/2014
 *
 */

// JFrame class allow us to create standard window (its a Java's GUI container)
import javax.swing.JFrame;

public class DrawPanel {

	public static void main(String[] args) {
		
		// creating a frame/window
		JFrame jf = new JFrame();
		
		// indicates the application terminates when user clicks on close button(X button) of the window
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// add component(Jpanel's object) to the container(Jframe's object)
		jf.add(new LineDrawing());
		
		// set the width and height of the window
		jf.setSize(400, 400);
		
		// set the window(JFrame) in visible mood
		// and paintComponent() is automatically invoked
		jf.setVisible(true);
		
	}

}
