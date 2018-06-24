// event handling with JMenuItems
// date: 26- 07-14

package allSwingDemos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoNotePad extends JFrame {
    
    JMenuBar menuBar;
    JMenu menu1, menu2, subMenu;
    JMenuItem mi1, mi2, mi3, mi4, mi5;
    JRadioButtonMenuItem rb1, rb2;
    JCheckBoxMenuItem cb1, cb2, cb3;
    JScrollPane sp;
    JTextArea ta;
    JLabel statusBar;
    
    // listener object
    ActionItemEvent ai;
    
    public DemoNotePad()
    {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        } catch (Exception e) 
        {
            System.err.println("ERROR!!!");
        }

        setTitle("JMenu demo");
        setVisible(true);
        setBounds(400, 100, 650, 500);
        setIconImage( new ImageIcon("D:\\java\\pics\\openjdk.png").getImage());
        setLayout( new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ai = new ActionItemEvent(this);
       
        // addtind a menu bar to the content pane
        setMenu();
        
        ta = new JTextArea(300, 200);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setFont( new Font("Courier New", Font.PLAIN, 15));
        
        // generates popup menu
        ta.addMouseListener( new DemoJPopupMenu(ai));  
        
        sp = new JScrollPane();
        sp.setViewportView(ta);
        
        statusBar = new JLabel("||   row 1,  col 1", JLabel.TRAILING);
        
        this.add(sp, BorderLayout.CENTER);
        this.add(statusBar, BorderLayout.SOUTH);
    }
    
    void setMenu()
    {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        menu1 = new JMenu("A Menu");
        menu1.setMnemonic(KeyEvent.VK_A);
        menuBar.add(menu1);
        mi1 = new JMenuItem("A text-only menu item");
        mi1.setMnemonic(KeyEvent.VK_T);
        mi1.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        mi1.addActionListener(ai);
        menu1.add(mi1);
        mi2 = new JMenuItem("Both text and icon", new ImageIcon("D:\\java\\pics\\fav.png"));
        mi2.setMnemonic(KeyEvent.VK_B);
        mi2.addActionListener(ai);
        menu1.add(mi2);
        mi3 = new JMenuItem(new ImageIcon("D:\\java\\pics\\fav2.png"));
        mi3.addActionListener(ai);
        menu1.add(mi3);
        
        menu1.addSeparator();
        
        rb1 = new JRadioButtonMenuItem("A radio button menu item", true);
        rb1.setMnemonic(KeyEvent.VK_R);
        rb1.addItemListener(ai);
        rb2 = new JRadioButtonMenuItem("Another one");
        rb2.setMnemonic(KeyEvent.VK_O);
        rb2.addItemListener(ai);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);        bg.add(rb2);
        menu1.add(rb1);     menu1.add(rb2);
        
        menu1.addSeparator();
        
        cb1 = new JCheckBoxMenuItem("A check box menu item", true);
        cb1.setMnemonic(KeyEvent.VK_C);
        cb1.addItemListener(ai);
        cb2 = new JCheckBoxMenuItem("Another one");
        cb1.setMnemonic(KeyEvent.VK_H);
        cb2.addItemListener(ai);
        menu1.add(cb1);     menu1.add(cb2);
        
        menu1.addSeparator();
        
        subMenu = new JMenu("A sub menu");
        subMenu.setMnemonic(KeyEvent.VK_S);
        mi4 = new JMenuItem("An item in the sub menu");
        mi4.setMnemonic(KeyEvent.VK_I);
        mi4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, KeyEvent.ALT_DOWN_MASK));
        mi4.addActionListener(ai);
        mi5 = new JMenuItem("Another sub menu item");
        mi5.addActionListener(ai);
        subMenu.add(mi4);       subMenu.add(mi5);
        menu1.add(subMenu);
        
        menu2 = new JMenu("Another Menu");
        menu2.setMnemonic(KeyEvent.VK_N);
        cb3 = new JCheckBoxMenuItem("Status bar", true);
        cb3.setActionCommand("sbar");
        cb3.setMnemonic(KeyEvent.VK_S);
        cb3.addItemListener(ai);
        menu2.add(cb3);
        
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
                new DemoNotePad();
            }
        });
    }
}
