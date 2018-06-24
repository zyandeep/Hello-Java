// Demo to position JFrame on the screen
// date: 16-07-14

package allSwingDemos;

import java.awt.*;
import javax.swing.*;

public class DemoJFrame2 extends JFrame {

    // Dimension class to represent dimension, i.e width and height
    Dimension dm ;
    
    // Toolkit class to get screen size
    Toolkit tk ;
    
    public DemoJFrame2() {
    
        super("Hello world! I'm JFrame!");
        
        tk = Toolkit.getDefaultToolkit();
        
        this.setSize(400, 350);
//        this.setLocation(500, 250);
        
//        this.setBounds(500, 250, 400, 350);
        
        // get the screen size
        dm = tk.getScreenSize();
        
        int x = (dm.width / 2) - (this.getWidth() / 2);
        int y = (dm.height / 2) - (this.getHeight() / 2);
        
        // placing JFrame on middle of the screen
        this.setLocation(x, y);
       
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
    }

    public static void main (String[] args) {
        
        new DemoJFrame2();
    }
}
