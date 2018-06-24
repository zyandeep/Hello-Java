// Swings BoxLayout demo
// date: 21-07-14
// Layout managers use Jcomponents' "Preffered Size" while setting out components

package allSwingDemos;

import java.awt.*;
import javax.swing.*;

public class DemoBoxLayout extends JFrame {

    JButton b1, b2, b3, b4;
    JCheckBox c1, c2, c3;
    JPanel p1, p2;
    
    public DemoBoxLayout() 
    {
        super ("Box Layout demo");
        setBounds(400, 100, 450, 400);
        setVisible(true);
        //setResizable(false);
        this.setLayout( new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        p1 = new JPanel();
        p2 = new JPanel();
        p1.setLayout( new BoxLayout(p1, BoxLayout.X_AXIS));
        p2.setLayout( new BoxLayout(p2, BoxLayout.Y_AXIS));
        
        c1 = new JCheckBox("C++");
        c2 = new JCheckBox("Java");
        c3 = new JCheckBox("C#");
        b4 = new JButton("Done!!");
        
        Dimension d1 = new Dimension(50, 80);
        Dimension d2 = new Dimension(50, 50);
        
        // adding invisible components to JPanels
        p1.add(Box.createHorizontalStrut(30));
        p1.add(c1);
        p1.add(Box.createRigidArea(d1));
        p1.add(c2);
        p1.add(Box.createRigidArea(d1));
        p1.add(c3);
        p1.add( Box.createRigidArea(d2));
        p1.add(b4);
        
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        
        p2.add(Box.createRigidArea(d2));
        p2.add(b1);
        p2.add(Box.createRigidArea(d2));
        p2.add(b2);
      
        p2.add( Box.createVerticalGlue());
        p2.add(Box.createRigidArea(d2));
        p2.add(b3); 
        
        this.add(p1);
        this.add(p2);
    }
    
    public static void main (String[] args) 
    {
        new DemoBoxLayout();
    }
}
