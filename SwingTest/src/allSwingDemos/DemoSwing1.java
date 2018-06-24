
package allSwingDemos;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class DemoSwing1 extends JFrame {

    JLabel lb;
    
    // to create border
    Border bor;
    
    // to get Screen Size
    Toolkit tk;
    
    public DemoSwing1() {
        
        lb = new JLabel("Testing JLabel", JLabel.CENTER);
        
        // instantiating a Border object (Etched Border)
        bor = BorderFactory.createEtchedBorder();
        
        // instantiating a Toolkit object
        tk = Toolkit.getDefaultToolkit();
        
        // Dimension class deals with width and height
        // reading the screen size
        Dimension d = tk.getScreenSize();
        
        setLayout(null);
        setTitle("Demo Swing 1");
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 380);

        // calculating the position to place the JFrame
        int x = (d.width/2) - (getWidth() / 2);
        int y = (d.height/2) - (getHeight() / 2);               
        this.setLocation(x, y);
              
        // creating a border around the JLabel
        lb.setBorder(bor);
        
        // this method works if Layout meneger set to  null
        // setLocation() and setSize()
        lb.setBounds(100, 100, 200, 50);
        
        this.add(lb);
        
    }
                                                           
    public static void main (String[] args) {
        new DemoSwing1();
    }
}
