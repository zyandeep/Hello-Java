/** How to...
 *  1. use HTML with swing components
 *  2. set action command
 *  3. set default button
 *  4. set mnemonics
 *  5. decorate a window border
 *  6. set icon for a window
 */
// date: 25-07-14

package allSwingDemos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.nimbus.*;

public class SwingFeatures extends JFrame implements ActionListener {

    JPanel p;
    JLabel l;
    JButton ok, cancel;
    
    public SwingFeatures()
    {   
        setTitle("Swing features");
        setLocationRelativeTo(null);
        setSize(300, 200);
        setVisible(true);
        
        // how to get an Image object
        Image im;
        ImageIcon icon = new ImageIcon("D:\\Java\\pics\\openjdk.png");
        im = icon.getImage();
        setIconImage(im);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        try {
            UIManager.setLookAndFeel( new NimbusLookAndFeel());
        }
        catch ( Exception e)
        {
            System.err.println("Nimbus LnF can't be set");
            System.err.println("switch back to Java's default LnF (aka METAL with OCEAN theme)" );
        }
        
        p = new JPanel();
        p.setLayout( new FlowLayout(FlowLayout.LEADING, 20, 20));
        
        // html text formatting in Java
        l = new JLabel();
        l.setText("<html><b><u><i> HTML text formatting with Swing components </i></u></b></html> ");
        
        ok = new JButton("<html><b>Two</b><br><i>Lines</i></html>");
        ok.setMnemonic(KeyEvent.VK_L);
        ok.setActionCommand("ok");
        ok.addActionListener(this);
        
        cancel = new JButton("Not HTML formatting");
        cancel.setMnemonic(KeyEvent.VK_H);
        cancel.addActionListener(this);
        
        // setting "ok" to the default button
        getRootPane().setDefaultButton(ok);
        
        p.add(l);       p.add(ok);      p.add(cancel);
        this.add(p);
        
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater( new Runnable() {
            
            public void run() 
            {
                // use Java's lnf to decorate window border
                JFrame.setDefaultLookAndFeelDecorated(true);
                new SwingFeatures();
            }
        });
    }

    public void actionPerformed(ActionEvent e)
    {
        JButton b = (JButton) e.getSource();
        
        if (b == ok)
            JOptionPane.showMessageDialog(null, "HTML formatting, " + e.getActionCommand() + " " + ok.isDefaultButton());
        else
            JOptionPane.showMessageDialog(null, e.getActionCommand());
        
    }
}
