// how to use Desktop to launch OS's native application 
// date: 21-09-14

package textPad;

import javax.swing.*;
import java.awt.event.*;
import java.awt.* ;
import java.io.File;
import java.io.IOException;

public class DesktopClass extends JFrame implements ActionListener {

    JTextField tf1, tf2, tf3;
    JButton b1, b2, b3;
    JRadioButton r1, r2;
    JLabel l1, l2, l3;
    
    JPanel p;
    
    Desktop desktop;

    public DesktopClass() 
    {
        initAndShowGUI();
    }

    
    private void initAndShowGUI()
    {
        setTitle("Desktop Class Demo");
        setSize( 430, 330);
        setResizable(false); 
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        p = new JPanel( new FlowLayout(FlowLayout.CENTER, 20, 20));
        
        l1 = new JLabel("URL: ");
        l2 = new JLabel("Email: ");
        l3 = new JLabel("File: ");
        
        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        tf3 = new JTextField(20);
        
        b1 = new JButton("Launch");
        b2 = new JButton("Launch");
        b3 = new JButton("Launch");
        b3.addActionListener(this); 
        
        r1 = new JRadioButton("Open");
        r2 = new JRadioButton("Edit");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);         bg.add(r2);
        
        //
        p.add(l1);      p.add(tf1);     p.add(b1);
        p.add(l2);      p.add(tf2);     p.add(b2);
        p.add( new JLabel("                                     ") ); 
        p.add(r1);      p.add(r2);
        p.add( new JLabel("                                      "));
        
        p.add(l3);      p.add(tf3);     p.add(b3);
        
        //
        this.add(p);
    }
    
    
    //
    public void actionPerformed( ActionEvent e) 
    {
        if( Desktop.isDesktopSupported() == false)
        {
            JOptionPane.showMessageDialog(this, "Not Supported!", "Java", JOptionPane.ERROR_MESSAGE ); 
            return;
        }
        
        desktop = Desktop.getDesktop();
        
        if(e.getSource() == b3)
        {
            String path = tf3.getText();
            
            File f = new File(path);
            
            if( desktop.isSupported( Desktop.Action.OPEN) )
            {
                try { 
                    desktop.open(f);
                } catch (IOException ex) {
                    System.err.println("can't call the native app!!");
                }
            }
            
        }
    }
    
    //
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater( new Runnable() {

            public void run()
            {
                new DesktopClass();
            }
        });
    }
        
}