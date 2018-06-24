//

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPanelEx extends JPanel {
    
    JFrame f = new JFrame();
    JButton b = new JButton("Click me");

    public JPanelEx() {
        f.setTitle("*** Drawing in swing ***");
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.add(this);
        //setBackground(Color.red);
        add(b);
    }
    
//     protected void paintComponent(Graphics g) {
//        super.paintComponent(g); 
//        g.setColor(Color.white);
//        g.drawString("Testing", 50, 40);
//        g.drawLine(80, 80, 100, 300);
//    }
    
    public static void main(String[] args) {
        new JPanelEx();
    }
   
    
}
