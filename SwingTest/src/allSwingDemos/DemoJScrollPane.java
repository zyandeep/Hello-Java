// JTextArea with JScrollPane demo
// date: 19-07-14

package allSwingDemos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoJScrollPane extends JFrame {

    JTextArea ta;
    JButton b;
    JScrollPane sp;
    
    public DemoJScrollPane()
    {
        super("Demo JTextArea");
        setBounds(300, 200, 500, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        ta = new JTextArea("write somthing...", 20, 40);
        b = new JButton("OK");
        
        // setting the scroll pane with text area object and h/v scroll bars
        sp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        // enable line and word wrapp 
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        
        // adding the scroll pane to the JFrame
        this.add(sp);           
        
        this.add(b);
      
        // using annonymous inner class
        b.addActionListener( new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                JOptionPane.showMessageDialog(null, "All data is copied to a new Frame!!");
                
                // creating a new JFrame, JTextArea and JScroll Pane 
                JFrame j = new JFrame("New JFrame");
                j.setBounds(400, 300, 450, 350);
                j.setVisible(true);
                j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               
                JTextArea t = new JTextArea(50, 50);
                t.append(ta.getText());
//                t.setLineWrap(true);
//                t.setWrapStyleWord(true);
                
                JScrollPane sp = new JScrollPane(t);
                sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
                
                j.add(sp);
                
            }
                
        } );
          
    }
    
    public static void main (String[] args) 
    {
        new DemoJScrollPane();
    
    }
    
}
