// JToggleButton has two states: on and off (selected/de-selected)
// date: 19-07-14

package allSwingDemos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoToggleButton extends JFrame implements ItemListener {

    JToggleButton tb;
    JLabel l;
    
    public DemoToggleButton()
    {
        setTitle("JToggle Button demo");
        setBounds(300, 300, 400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        
        tb = new JToggleButton("Love video games?", new ImageIcon("D:\\Java\\pics\\1.png"));
        l = new JLabel(" ", JLabel.CENTER);
        
        add(tb);        add(l); 
        tb.addItemListener(this);
        
    }

    public void itemStateChanged(ItemEvent e) 
    {
//        if (e.getSource() == tb)
//        {
//            int state = e.getStateChange();
//            
//            if (state == ItemEvent.SELECTED)
//                l.setText("You love video games!");
//            else
//                l.setText("You don't love video games!");
//            
//        }
        
        if (tb.isSelected())
           l.setText("You love video games!");
        else
           l.setText("You don't love video games!");
    }
       
    public static void main(String[] args)
    {
        new DemoToggleButton();
    }
}
