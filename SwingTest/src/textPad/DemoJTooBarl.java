// Demo of JToolbar
// date: 21-08-14

package textPad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoJTooBarl extends JFrame implements ActionListener
{
    JPopupMenu pm;
    JMenuItem cut, copy, paste, del;
    JButton b1, b2, b3;
    JLabel lb;
    JTextField tf;
    JTextArea ta;
    JToolBar tb;
    
    public DemoJTooBarl() 
    {

        setTitle("JPopUpMenu, JToolBar Demo");
        setVisible(true);
        setBounds(400, 200, 600, 500);
        setResizable(false); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ta = new JTextArea("Demo of JPopUp menu...");
        JScrollPane sp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.add(sp, BorderLayout.CENTER);
        
        // creating the ToolBar
        tb = new JToolBar("My toolbar");
        b1 = new JButton(new ImageIcon("D:\\JAVA\\Toolbar\\cut.png") ); 
        b2= new JButton(new ImageIcon("D:\\JAVA\\Toolbar\\copy.png"));
        b3= new JButton(new ImageIcon("D:\\JAVA\\Toolbar\\paste.png"));
        lb = new JLabel("  Write something...  ");
        tf = new JTextField(15);
        b1.addActionListener(this);     b2.addActionListener(this);
        b3.addActionListener(this);     tf.addActionListener(this);  
        tb.add(b1);     tb.add(b2);     tb.add(b3);  tb.addSeparator();
        tb.add(lb);     tb.add(tf);
        tb.setBorderPainted(false); 
        tb.setRollover(true); 
        tb.setFloatable(false); 
        this.add(tb, BorderLayout.PAGE_START);
        
        // creating the PopUPMenu
        pm = new JPopupMenu();
        cut = new JMenuItem("Cut", new ImageIcon("D:\\JAVA\\Toolbar\\cut.png") ); 
        copy = new JMenuItem("Copy", new ImageIcon("D:\\JAVA\\Toolbar\\copy.png"));
        copy.setIconTextGap(8);
        paste = new JMenuItem("paste", new ImageIcon("D:\\JAVA\\Toolbar\\paste.png"));
        paste.setIconTextGap(8);
        del = new JMenuItem("Delete");
        cut.addActionListener(this);  copy.addActionListener(this);   
        paste.addActionListener(this);  del.addActionListener(this); 
        pm.add(cut);    pm.add(copy);    pm.add(paste);
        pm.addSeparator();
        pm.add(del);
        
        // adding the PopUPMenu with the target container
        ta.setComponentPopupMenu(pm); 
        tf.setComponentPopupMenu(pm); 
    }

    
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == tf)
        {
            JOptionPane.showMessageDialog(null, tf.getText());
        }
        else
        {
            JOptionPane.showMessageDialog(null, e.getActionCommand());
        }
         
    }
    
    
    
    public static void main(String[] args)
    {
        // swing is not thread-safe
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                //JFrame.setDefaultLookAndFeelDecorated(true);
                new DemoJTooBarl();
            }
        });
    }
    
}
