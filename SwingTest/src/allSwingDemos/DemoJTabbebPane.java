// demo of using JTabbedPane
// Layout managers use Jcomponents' "Preffered Size" while setting out components
// date: 21-07-14

package allSwingDemos;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class DemoJTabbebPane extends JFrame {

    JTabbedPane tp;
    JLabel l;
    JPanel p1, p2, p3, p4;
    JButton b1;
    JCheckBox ckb;
    JComboBox cmb;
    
    public DemoJTabbebPane() 
    {
        super ("JTabbedPane Demo");
        setBounds(350, 120, 550, 450);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        
        // settings Java's new Nimbus look-and-feel
        try {
            UIManager.setLookAndFeel( new NimbusLookAndFeel());
            
        }
        catch ( Exception e)
        {
            System.err.println("You don't have the Nimbus lnf ");
            System.err.println("going back to Java's METAL lnf");
        }
        
        p1 = new JPanel(new FlowLayout());
        p2 = new JPanel(new FlowLayout());
        p3 = new JPanel(new FlowLayout());
        p4 = new JPanel(new FlowLayout());
        
        b1 = new JButton("Mark Jukerburg!!");
        p1.add(b1);
        
        ckb = new JCheckBox("Larry Page", true);
        p2.add(ckb);
        
        cmb = new JComboBox();
        cmb.addItem("UNIX");    cmb.addItem("Linux");
        cmb.addItem("Windows");    cmb.addItem("OSX");       cmb.addItem("BSD");
        cmb.setPreferredSize( new Dimension(150, 30));
        p3.add(cmb);
        
        l = new JLabel("Open JDK", new ImageIcon("D:\\JAVA\\pics\\openjdk.png"), JLabel.CENTER);
        p4.add(l);
        
        // setting up the tabbed pane
        tp = new  JTabbedPane();
        tp.addTab("Tab 1", p1);
        tp.addTab("Tab 2", new ImageIcon("D:\\JAVA\\pics\\fav2.png"), p2, "Love g+?");
        tp.addTab("Tab 3", p3);
        tp.addTab("Tab 4", p4);
        tp.setIconAt(0, new ImageIcon("D:\\JAVA\\pics\\fav.png"));
        tp.setToolTipTextAt(0, "Love Facebook??");
        tp.setMnemonicAt(0, KeyEvent.VK_1);
        tp.setMnemonicAt(1, KeyEvent.VK_2);
        tp.setMnemonicAt(2, KeyEvent.VK_3);
        tp.setMnemonicAt(3, KeyEvent.VK_4);
        tp.setSelectedIndex(2);
          
        this.add(tp);
    }
    
    public static void main (String[] args)
    {
        // swing is not thread safe, so can't use the main thread
        SwingUtilities.invokeLater( new Runnable() {

            public void run()
            {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new DemoJTabbebPane();
            }
        });
        
    }
 
}
