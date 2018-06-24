// creating a JFrame window 

package myJGui;

import java.awt.FlowLayout;
import javax.swing.*;

public class JavaFrame extends JFrame {

    public JavaFrame() {
        
        super("Hello WOrld!");
        setSize(400, 400);
        setVisible(true);
        
        setLayout( new FlowLayout() );  // setting a layout manager
        
        //setResizable(false); 
        
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();   // create a Jpanel to hold swing buttons
        
        JButton b1 = new JButton("Touch me!");  // creating Jbuttons
        JButton b2 = new JButton("Cancle");
        
        JCheckBox cb1 = new JCheckBox("are you indian?");
        JCheckBox cb2 = new JCheckBox("are you female?", true);     // creating JCheckbox
        
        p1.add(b1);      p1.add(b2);     // adding Jbuttons to Jpanel p1
        
        add(p1);  // finaly, adding Jpanel p1 to JFrame 
        
        p2.add(cb1);      p2.add(cb2);     // adding Jcheckboxes to Jpanel p1
        
        add(p2);  // finaly, adding Jpanel p2 to JFrame 
        
    }
    
    public static void main(String[] args) {
        
        new JavaFrame().setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
