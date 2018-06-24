// demo of Print dialog (how to print a document)
// date: 17-08-14

package textPad;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class DemoPrint extends JFrame {
    
    JTextArea ta;
    JButton b;
    JPanel p;

    public DemoPrint()
    {
        setTitle("Print Demo");
        setVisible(true);
        setBounds(300, 300, 400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ta = new JTextArea();
        this.add(ta,BorderLayout.CENTER);
        
        p = new JPanel();
        b = new JButton("Click me");
        p.add(b);
        this.add(p, BorderLayout.SOUTH);
        
        b.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               try 
               {
                   // show the print dialog box
                   if( ta.print() )
                       System.out.println("Success printing! ");
                   else
                       System.out.println("Failed printing! ");
               } 
               catch(Exception ex)
               {
                   System.err.println(ex);
               }
            }
        });
        
    }
    
    
    public static void main(String[] args)
    {
        // swing is not thread-safe
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new DemoPrint();
            }
        });
    }
    
}
