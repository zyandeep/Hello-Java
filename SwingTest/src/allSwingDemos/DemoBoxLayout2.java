// Swings BoxLayout demo
// date: 21-07-14

package allSwingDemos;

import java.awt.*;
import javax.swing.*;

public class DemoBoxLayout2 extends JFrame {

    JPanel p;
    JButton b1, b2, b3;
    
    public DemoBoxLayout2()
    {
        super ("Box Layout demo");
        setBounds(400, 100, 300, 200);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        p = new JPanel();
        p.setLayout( new BoxLayout(p, BoxLayout.Y_AXIS));
        
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("ok");
        
        p.add(b1);
        p.add(Box.createRigidArea( new Dimension(0, 10)));
        p.add(b2);
        p.add( Box.createVerticalGlue());
        p.add(b3);
        p.add(Box.createRigidArea( new Dimension(0, 10)));
        
        this.add(p);
    }
    
    public static void main (String[] args) 
    {
        new DemoBoxLayout2();
    }
    
}
