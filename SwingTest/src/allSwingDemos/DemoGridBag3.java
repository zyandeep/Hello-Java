// Swings BoxLayout demo
// date: 21-07-14

package allSwingDemos;

import java.awt.*;
import javax.swing.*;

public class DemoGridBag3 extends JFrame {

    JLabel nm, pw;
    JTextField nt;
    JPasswordField pp;
    JPanel p;
    
    public DemoGridBag3()
    {
        super ("GridBag Layout demo 3");
        setBounds(400, 100, 400, 350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // setting Windows default look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        }
        catch ( Exception e)
        {
            e.printStackTrace();
        }
        
        p = new JPanel();
        p.setLayout( new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        nm = new JLabel("name");
        pw = new JLabel("password");
        nt = new JTextField(20);
        pp = new JPasswordField(15);
        
        gbc.weightx = 100.0;        gbc.weighty = 100.0;
        gbc.insets = new Insets(5, 5, 5, 5);
        
        gbc.gridx = 0;      gbc.gridy = 0;
        p.add(nm, gbc);      
        gbc.gridx = 2;      gbc.gridy = 0;
        p.add(nt, gbc);
        gbc.gridx = 0;      gbc.gridy = 1;
        p.add(pw, gbc);      
        gbc.gridx = 2;      gbc.gridy = 1;
        p.add(pp, gbc);
        
        this.add(p);
               
    }
    
    public static void main (String[] args) 
    {
        new DemoGridBag3();
    }
}
