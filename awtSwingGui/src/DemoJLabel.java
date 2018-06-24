// JLabel Demo

import javax.swing.*;
import java.awt.*;

public class DemoJLabel extends JFrame {

    public DemoJLabel(String str) {
        super(str);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 15, 20));
        setUp();
    }
    
    public void setUp() {
        JLabel l1 = new JLabel();
        l1.setText("Labels exist simply");
        add(l1);
        
        JLabel l2 = new JLabel("to place text on the screen.");
        add(l2);
        
        JLabel l3 = new JLabel("They can be aligned left, right or center");
        l3.setFont( new Font("Comic Sans MS", Font.BOLD, 17));
        l3.setForeground(Color.red);
  
        add(l3);
    }

    public static void main(String[] args) {
        new DemoJLabel("*** JLable Demo ***");
    }
}
