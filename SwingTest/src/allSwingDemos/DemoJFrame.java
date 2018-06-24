// JFrame Demo
// date: 16-07-14

package allSwingDemos;

import java.awt.*;
import javax.swing.*;

public class DemoJFrame extends JFrame {

    // Dimension class to represent dimension, i.e width and height
    Dimension dm ;
    
    public DemoJFrame() {
    
        super("Hello world! I'm JFrame!");
        
        dm = new Dimension(400, 350);
        
        //this.setTitle("Hello world! I'm JFrame!");
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(dm);
    }

    public static void main (String[] args) {
        
        new DemoJFrame();
    }
}
