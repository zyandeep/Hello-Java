// Windows, Mofit, GTK+ lnf

package allSwingDemos;

import java.awt.event.*;
import javax.swing.*;

public class DemoLAndF2 extends JFrame {

    JButton b;
    JComboBox cb;
    JPanel p;
    
    public DemoLAndF2() 
    {
        super ("Java PLAF demo");
        setBounds(400, 100, 400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //
        try {
            //UIManager.setLookAndFeel( new com.sun.java.swing.plaf.motif.MotifLookAndFeel());
            
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
           
        }
        catch (Exception e)
        {
            System.err.println(e);
        }
        
        b = new JButton("Motif LNF!!");
        
        String[] items = {"C", "C++", "Java", "C#", "PHP", "ASP", "Perl", "JavaScript"};
        cb = new JComboBox(items);
        cb.setMaximumRowCount(5);
        
        p = new JPanel();
        p.add(b);
        p.add(cb);
                
        this.add(p);
        
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater( new Runnable() {

            public void run() 
            {
              new DemoLAndF2();  
            }
        });
        
    }
    
}
