//

package allSwingDemos;

import javax.swing.*;
import java.awt.*;

public class DemoJLabel extends JFrame {

    JPanel p1, p2;
    JLabel l1, l2;
    
    public DemoJLabel() {
  
        setTitle("Demo JLabel");
        setBounds(500, 200, 500, 400);
        setVisible(true);
        setLayout(new GridLayout(2, 1));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        p1 = new JPanel(new FlowLayout( FlowLayout.CENTER, 10, 50 ));
        l1 = new JLabel();
        l1.setText("My Button 1");
        p1.add(l1);
        
        p2 = new JPanel(new FlowLayout( FlowLayout.CENTER, 10, 50 ));
        l2 = new JLabel();
        l2.setIcon(new ImageIcon("D:\\music.png"));
        l2.setText("Listen to music!!");
        l2.setToolTipText("music lovers");
        p2.add(l2);
        
        this.add(p1);
        this.add(p2);
    }
    
    public static void main (String[] args) {
        new DemoJLabel();
    }
    
}
