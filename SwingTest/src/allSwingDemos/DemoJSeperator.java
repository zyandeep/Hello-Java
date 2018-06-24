// demo of using JSeparator
// date: 21-07-14

package allSwingDemos;

import java.awt.*;
import javax.swing.*;

public class DemoJSeperator extends JFrame {

    JSeparator sp1, sp2;
    JPanel p;
   
    public DemoJSeperator() 
    {
        super ("JSeparator Demo");
        setBounds(350, 120, 500, 450);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        p = new JPanel( new FlowLayout(FlowLayout.CENTER, 50, 40));
        
        sp1 = new JSeparator(JSeparator.HORIZONTAL);
        sp1.setPreferredSize( new Dimension(400, 10));
        
        sp2 = new JSeparator(JSeparator.VERTICAL);
        sp2.setPreferredSize( new Dimension(10, 200));
        
        p.add(sp1);     p.add(sp2);
                
        this.add(p);
       
    }
    
    public static void main (String[] args)
    {
        new DemoJSeperator();
    }
    
}
