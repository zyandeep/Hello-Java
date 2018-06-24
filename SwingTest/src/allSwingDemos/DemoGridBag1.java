// GridBagLayout demo
// date: 22-07-14

package allSwingDemos;

import java.awt.*;
import javax.swing.*;

public class DemoGridBag1 extends JFrame {

    JTextField t1;
    JPasswordField pw;
    JButton ok, cancel;
    JPanel p;
    
    public DemoGridBag1()
    {
        super ("Box Layout demo");
        setBounds(400, 100, 450, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        p = new JPanel( new GridBagLayout());
        
        t1 = new JTextField(20);
        pw = new JPasswordField(10);
        ok = new JButton("ok");
        cancel = new JButton("cancel");
        
        //
        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.BOTH;
        gc.anchor = GridBagConstraints.EAST;
        gc.insets = new Insets(45, 45, 45, 45);
        gc.ipadx = 2;      gc.ipady = 2;
        gc.weightx = 100.0;       gc.weighty = 100.0;
        
        //
        gc.gridx = 0;       gc.gridy = 1;
        gc.gridwidth = 5;   gc.gridheight = 1;
        p.add(t1, gc);
        
        //
        gc.gridy = 2;       gc.gridwidth = 1;  
        p.add(pw, gc);
        
        //
       gc.gridy = 5;
       gc.gridwidth = 1;   gc.gridheight = 1;
       p.add(cancel, gc);
       
       gc.gridx = 4;       gc.gridy = 5;
       gc.gridwidth = 1;   gc.gridheight = 1;
       p.add(ok, gc);
       
       this.add(p);
    }
    
    public static void main (String[] args) 
    {
        new DemoGridBag1();
    }
}
