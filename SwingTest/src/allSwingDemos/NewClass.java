// When does resizing of JFrame end????
// date: 29/08/2014

package allSwingDemos;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.*;

public class NewClass {
    
    JFrame frame;
    
    public NewClass() 
    {
        frame = new JFrame("Test Frame");
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null); 
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
        
        frame.addComponentListener( new ComponentAdapter() 
        {
            public void componentResized(ComponentEvent e) 
            {
                System.out.println(" i am resized ");
            }
            
        });
        
        frame.setVisible(true); 
    }
    
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater( new Runnable()
        {
            public void run()
            {
                 new NewClass();
            }
        }); 
    }
}
