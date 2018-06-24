// Drawing with swing container
// for drawing in swing, we use JPanel 
// And overides it's paintComponent method

import javax.swing.*;
import java.awt.*;

public class DrawingEx extends JPanel {

    JFrame f = new JFrame();
    
    public DrawingEx() {
        f.setTitle("*** Drawing in swing ***");
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.add(this);
        setBackground(Color.red);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.setColor(Color.white);
        g.drawString("Testing", 50, 40);
        g.drawLine(80, 80, 100, 300);
    }
    
    public static void main(String[] args) {
        new DrawingEx();
    }
   
}
