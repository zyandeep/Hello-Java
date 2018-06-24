// GridBagLayout demo
// date: 22-07-14

package allSwingDemos;

import java.awt.*;
import javax.swing.*;

public class DemoGridBag2 extends JFrame {
    
    JLabel name, passwd, add;
    JTextField nt, at;
    JPasswordField passw;

    public DemoGridBag2()
    {
        super ("Box Layout demo");
        setBounds(400, 100, 450, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout( new GridBagLayout());
        
        name = new JLabel("Name", JLabel.CENTER);
        passwd = new JLabel("Password", JLabel.CENTER);
        add = new JLabel("Address", JLabel.CENTER);
        nt = new JTextField(30);
        at = new JTextField(10); 
        passw = new JPasswordField(30);
        
        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.EAST;
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.insets = new Insets(20, 20, 20, 20);
        gc.ipadx = 5;       gc.ipady = 5;
        gc.weightx = 100.0;     gc.weighty = 100.0;
        
        gc.gridx = 0;       gc.gridy = 0;
        gc.gridwidth = 1;       gc.gridheight = 1;
        this.add(name, gc);
        
        gc.gridx = 2;       gc.gridy = 0;
        gc.gridwidth = 4;       gc.gridheight = 1;
        this.add(nt, gc);
        
        gc.gridx = 0;       gc.gridy = 1;
        gc.gridwidth = 1;       gc.gridheight = 1;
        this.add(passwd, gc);
        
        gc.gridx = 2;       gc.gridy = 1;
        gc.gridwidth = 2;       gc.gridheight = 1;
        this.add(passw, gc);
        
        gc.gridx = 0;       gc.gridy = 2;
        gc.gridwidth = 1;       gc.gridheight = 1;
        this.add(add, gc);
        
        gc.gridx = 2;           gc.gridy = 2;
        gc.gridwidth = 4;       gc.gridheight = 1;
        this.add(at, gc);
    }
    
    public static void main (String[] args) 
    {
        new DemoGridBag2();
    }
    
}
