// this class creates a custome dialog
// date: 15-09-14

package textPad;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class JDialogDemo extends JFrame implements ActionListener {

    JLabel lb;
    JButton dbut, fbut;
    JTextField tf;
    
    public JDialogDemo() 
    {
        super("Custome dialog demo"); 
        setVisible(true); 
        setSize(400, 300); 
        setResizable(false);
        setLayout( new FlowLayout(FlowLayout.CENTER, 20, 30) ); 
        setDefaultCloseOperation(EXIT_ON_CLOSE );
        
        fbut = new JButton("Click me!!");
        fbut.addActionListener( this );
        
        this.add(fbut);
    }

    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == fbut )
        {
            lb = new JLabel("You Are a SOB!!! ");
            dbut = new JButton("Click me...");
            tf = new JTextField("Enter your name", 20);
            Object[] msg = {lb, dbut, tf};
            
            //
            JOptionPane.showMessageDialog(this, msg, "Dummy dialog", JOptionPane.INFORMATION_MESSAGE ); 
        
            
        }
    }
    
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater( new Runnable()
        {
            public void run()
            {
                new JDialogDemo();
            }
            
        }); 
    }
}
