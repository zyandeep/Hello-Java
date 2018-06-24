// demo of creating menu and its components
// can't use Accelerator for JMenus, as it needs to be displayed!
// date: 25-07-14

package allSwingDemos;

import java.awt.event.*;
import javax.swing.*;

public class DemoJMenu1 extends JFrame {

    JMenuBar menuBar;
    JMenu menu1, menu2, subMenu;
    JMenuItem mi1, mi2, mi3, mi4, mi5;
    JRadioButtonMenuItem rb1, rb2;
    JCheckBoxMenuItem cb1, cb2;
    
    public DemoJMenu1()
    {
        super("JMenu demo");
        setVisible(true);
        setBounds(400, 200, 400, 300);
        setIconImage( new ImageIcon("D:\\java\\pics\\openjdk.png").getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        //
        setMenu();
                
    }
    
    void setMenu()
    {
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        
        menu1 = new JMenu("A Menu");
        menu1.setMnemonic(KeyEvent.VK_A);
        menuBar.add(menu1);
        mi1 = new JMenuItem("A text-only menu item");
        mi1.setMnemonic(KeyEvent.VK_T);
        mi1.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menu1.add(mi1);
        mi2 = new JMenuItem("Both text and icon", new ImageIcon("D:\\java\\pics\\fav.png"));
        mi2.setMnemonic(KeyEvent.VK_B);
        menu1.add(mi2);
        mi3 = new JMenuItem(new ImageIcon("D:\\java\\pics\\fav2.png"));
        menu1.add(mi3);
        
        menu1.addSeparator();
        
        rb1 = new JRadioButtonMenuItem("A radio button menu item", true);
        rb1.setMnemonic(KeyEvent.VK_R);
        rb2 = new JRadioButtonMenuItem("Another one");
        rb2.setMnemonic(KeyEvent.VK_O);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);        bg.add(rb2);
        menu1.add(rb1);     menu1.add(rb2);
        
        menu1.addSeparator();
        
        cb1 = new JCheckBoxMenuItem("A check box menu item", true);
        cb1.setMnemonic(KeyEvent.VK_C);
        cb2 = new JCheckBoxMenuItem("Another one");
        cb1.setMnemonic(KeyEvent.VK_H);
        menu1.add(cb1);     menu1.add(cb2);
        
        menu1.addSeparator();
        
        subMenu = new JMenu("A sub menu");
        subMenu.setMnemonic(KeyEvent.VK_S);
        mi4 = new JMenuItem("An item in the sub menu");
        mi4.setMnemonic(KeyEvent.VK_I);
        mi4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, KeyEvent.ALT_DOWN_MASK));
        mi5 = new JMenuItem("Another sub menu item");
        subMenu.add(mi4);       subMenu.add(mi5);
        menu1.add(subMenu);
        
        menu2 = new JMenu("Another Menu");
        menu2.setMnemonic(KeyEvent.VK_N);
        menu2.add( new JMenuItem("Another JMenu item!!"));
        
        menuBar.add(menu2);
    }
    
    
    public static void main(String[] args)
    {
        // swing is not thread-safe
        SwingUtilities.invokeLater( new Runnable() 
        {
            public void run() 
            {
                //JFrame.setDefaultLookAndFeelDecorated(true);
                new DemoJMenu1();
            }
        });
    }
}
