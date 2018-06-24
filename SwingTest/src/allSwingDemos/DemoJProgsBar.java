// demo of using JPrograssBar
// date: 20-07-14

package allSwingDemos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoJProgsBar extends JFrame implements ActionListener {

    JProgressBar pb;
    JButton ok;
    JLabel l;
    JPanel p1, p2;
    
    public DemoJProgsBar()
    {
        super ("JProgressBar Demo");
        setBounds(400, 170, 450, 350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        p1 = new JPanel( new FlowLayout(FlowLayout.CENTER, 80, 50));
        p2 = new JPanel( new FlowLayout(FlowLayout.CENTER, 50, 50));
        
        pb = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
        pb.setValue(0);
        pb.setStringPainted(true);
        p1.add(pb);
        
        ok = new JButton("Start!!");
        ok.addActionListener(this);
 
        l = new JLabel("Current value: ", JLabel.CENTER);
        p2.add(ok);         p2.add(l);
        
        this.add(p1);    this.add(p2);
       
    }

    public void actionPerformed(ActionEvent e)
    {
        //pb.setString("java");
        
         l.setText( " completed: " + pb.getString() + ", " + pb.getValue() + ", " + pb.getPercentComplete());

         //pb.setIndeterminate(true);
        pb.setValue(pb.getValue() + 5);
        
    }
    
    
    public static void main (String[] args)
    {
        new DemoJProgsBar();
    }
    
}
