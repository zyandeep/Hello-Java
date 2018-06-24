// How to use JDialogs
// date: 21-09-14

package textPad;

import javax.swing.*;
import java.awt.event.*;

public class SwingDialogDemo extends JFrame implements ActionListener {

    JButton but;
    JDialog dialog;
    
    public SwingDialogDemo() 
    {
        super("JDialog demo");
        super.setSize(400, 300); 
        super.setResizable(false); 
        super.setLocationRelativeTo(null);
        super.setVisible(true); 
        super.setDefaultCloseOperation( EXIT_ON_CLOSE ); 
        
        but = new JButton("Click me!!");
        but.addActionListener(this); 
        
        this.add(but);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == but)
        {
            new FontChooserDialog(this);
        }
    }
    
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater( new Runnable() {

            public void run() 
            {
                new SwingDialogDemo();
            }
        });
    }
}
