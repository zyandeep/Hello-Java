// JButton demo
// date: 18-07-14
// Layout managers use Jcomponents' "Preffered Size" while setting out components

package allSwingDemos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoJButton extends JFrame implements ActionListener {
    
    JPanel p;
    JButton b1, b2;

    public DemoJButton(String title) 
    {
        super (title);
        setBounds(300, 400, 500, 350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        p = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        b1 = new JButton(" ");
        b2 = new JButton();
        
        b1.setIcon( new ImageIcon("D:\\Java\\pics\\1.png"));
        b1.setToolTipText("YAHOO!!");
        b2.setText("Love music?");
        b2.setPreferredSize( new Dimension(200, 50));
        
        b2.addActionListener(this);
      
        p.add(b1);          p.add(b2);
        this.add(p);
        
        b2.doClick();
    }

    
    public void actionPerformed(ActionEvent e) 
    {
        JOptionPane.showMessageDialog(null, "did you click the button?", "DoClick() test", 
                JOptionPane.PLAIN_MESSAGE);
    }
    
    public static void main (String[] args) 
    {
        new DemoJButton("JButton demo");
    }
            
}
