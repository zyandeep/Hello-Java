// change the look and feel
// date: 23-08-14

package textPad;

import javax.swing.*;
import java.awt.event.*;

public class ChangeLnF extends JFrame implements ActionListener
{
    JMenuBar menuBar;
    JMenu opMenu, subMenu;
    JRadioButtonMenuItem java, sys, nim;
    JTextArea ta;
    
    public ChangeLnF()
    {
        setTitle("Change the LnF...");
        setVisible(true);
        setBounds(400, 200, 400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ta = new JTextArea("App's theme will be changed!");
        JScrollPane sp = new JScrollPane( ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
                                            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED );
        this.add(sp);
        setMenu();
    }
    
    private void setMenu()
    {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        opMenu = new JMenu("Option");
        opMenu.setMnemonic(KeyEvent.VK_O);
        menuBar.add(opMenu);
        
        subMenu = new JMenu("Set the Look and Feel...");
        subMenu.setMnemonic(KeyEvent.VK_S);
        opMenu.add(subMenu);
        
        java = new JRadioButtonMenuItem("Java", true);
        sys = new JRadioButtonMenuItem("System");
        nim = new JRadioButtonMenuItem("Nimbus");
        java.addActionListener(this);     sys.addActionListener(this);     nim.addActionListener(this);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(java);       bg.add(sys);           bg.add(nim);
        
        
        subMenu.add(java);      subMenu.add(sys);      subMenu.add(nim);
        
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
        try {
            setLnF();
            
        }
        catch (Exception e)
        {
            System.err.println(e);
        }
        
    }
    
     public void setLnF() throws Exception
    {
        if(java.isSelected())
        {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName()); 
            SwingUtilities.updateComponentTreeUI(this); 
            
        }
        else if(sys.isSelected())
        {
            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName()); 
            SwingUtilities.updateComponentTreeUI(this); 
           
        }
        else
        {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); 
            SwingUtilities.updateComponentTreeUI(this); 
        }
    }
           
     
     
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater( new Runnable()
        {
            public void run()
            {
               new ChangeLnF();
            }
        });
    }
}
