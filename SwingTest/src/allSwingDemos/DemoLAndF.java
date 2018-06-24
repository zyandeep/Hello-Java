// Swings puagable look-and-feel demo
// lnf can be set for lightweigted components (JComponents)
// date: 24-07-14

package allSwingDemos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.nimbus.*;
import javax.swing.plaf.metal.*;

public class DemoLAndF extends JFrame implements ActionListener {
    
    JButton b1, b2, b3, b4, b5;
    JComboBox cb;  
    JPanel p;

    public DemoLAndF() 
    {
        super ("Java PLAF demo");
        setBounds(400, 100, 600, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        p = new JPanel( new FlowLayout(FlowLayout.CENTER, 20, 40));
        
        String[] items = {"C", "C++", "Java", "C#", "PHP", "ASP", "Perl", "JavaScript"};
        cb = new JComboBox(items);
        cb.setMaximumRowCount(5);
        
        b1 = new JButton("Metal themed");
        b2 = new JButton("Nimbus");
        b3 = new JButton("Windows");
        b4 = new JButton("Motif");
        b5 = new JButton("GTK+");
        
        b1.addActionListener(this);     b2.addActionListener(this);
        b3.addActionListener(this);     b4.addActionListener(this);     b5.addActionListener(this);
        
        p.add(b1);      p.add(b2);      p.add(b3);
        p.add(b4);      p.add(b5);      p.add(cb);
        
        this.add(p);
    }

    public void actionPerformed(ActionEvent e)
    {
        // setting lnf acc. to request
        String lnf = e.getActionCommand();
        
        try 
        {
            if (lnf.equalsIgnoreCase("Nimbus"))
            {
                UIManager.setLookAndFeel( new NimbusLookAndFeel());
                
                SwingUtilities.updateComponentTreeUI(p);
                this.pack();
                
            }
            
            else if (lnf.equalsIgnoreCase("Windows"))
            {
                UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName());
                
                SwingUtilities.updateComponentTreeUI(p);
                this.pack();
                
            }
            
            else
            {
                MetalTheme theme = MetalLookAndFeel.getCurrentTheme();
                
                if (theme.getName().equalsIgnoreCase("Ocean"))
                    MetalLookAndFeel.setCurrentTheme( new DefaultMetalTheme());
                else
                    MetalLookAndFeel.setCurrentTheme( new OceanTheme());  
                    
                UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName());
                
                SwingUtilities.updateComponentTreeUI(p);
                this.pack();
            }
             
        }
        
        catch (Exception ex)
        {
            System.err.println("ERROR in setting the lnf!");
            System.err.println("METAL is set automatically!");
            ex.printStackTrace();
        }
            
        
    }
    
    
    public static final void main(String[] args)
    {
        // swing is not thread safe
        SwingUtilities.invokeLater( new Runnable()
        {           
            public void run()
            {
               new DemoLAndF();
            }
        });
    }
}
