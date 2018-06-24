// demo of using JPrograssBar to monitor a loop
// date: 20-07-14

package allSwingDemos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoPbar2 extends JFrame {

    JProgressBar pb;
    JButton b; 
    JTextArea ta;
    JScrollPane sp;
    
    public DemoPbar2() 
    {
        super ("Swing Prograss Bar");
        setBounds(400, 170, 500, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 70, 30));
        
        pb = new JProgressBar(0, 100000);
        pb.setStringPainted(true);
        
        b = new JButton("Start!!");
       
        ta = new JTextArea(15, 35);
        
        sp = new JScrollPane();
        sp.setViewportView(ta);       
        sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        this.add(pb);   this.add(b);   this.add(sp);
    }
    
    public static void main (String[] args)
    {
        new DemoPbar2();  
    }
    
}
