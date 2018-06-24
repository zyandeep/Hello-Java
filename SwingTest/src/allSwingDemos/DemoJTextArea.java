// JTextArea-only demo
// date: 19-07-14

package allSwingDemos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoJTextArea extends JFrame {

    JTextArea ta;
    JButton b;
    
    public DemoJTextArea()
    {
        super("Demo JTextArea");
        setBounds(300, 200, 500, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        ta = new JTextArea("write somthing...", 20, 40);
        b = new JButton("OK");
        
        // enable line and word wrapp 
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        
        this.add(ta);           this.add(b);
      
        // using annonymous inner class
        b.addActionListener( new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                JOptionPane.showMessageDialog(null, "All data is copied to a new Frame!!");
                
                //
                JFrame j = new JFrame("New JFrame");
                j.setBounds(400, 300, 450, 350);
                j.setVisible(true);
                j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               
                JTextArea t = new JTextArea(50, 50);
                t.append(ta.getText());
                t.setLineWrap(true);
                t.setWrapStyleWord(true);
                j.add(t);
                
            }
                
        } );
          
    }
    
    public static void main (String[] args) 
    {
        SwingUtilities.invokeLater( new Runnable()
        {
            public void run()
            {
                new DemoJTextArea();
            }
        });
      
    }
    
}
