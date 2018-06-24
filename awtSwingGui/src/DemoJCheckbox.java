// JCheckbox demo

import javax.swing.*;
import java.awt.*;

public class DemoJCheckbox extends JFrame {

    JCheckBox rm, rs, ns;
    JLabel rmL, rsL, nsL;
    JButton b = new JButton("Submit");

    public DemoJCheckbox() {
        super("JCheckbox Demo");
        setSize(400, 400);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 40));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        rm = new JCheckBox("Ram");
        rs = new JCheckBox("Ramesh");
        ns = new JCheckBox("Naresh");
        add(rm); add(rs); add(ns);  add(b);
        
        rmL = new JLabel();
        rsL = new JLabel();
        nsL = new JLabel();
        
        add(rmL);   add(rsL);   add(nsL);
        
        setUpCB();

    }

    public void setUpCB() {
      
        DemoItemEvent ie = new DemoItemEvent(this);
        ActionEventDemo ae = new ActionEventDemo(this);

        rm.addItemListener(ie);
        rs.addItemListener(ie);
        ns.addItemListener(ie);
        b.addActionListener(ae); 
    }
          
    public static void main(String[] args) {
        new DemoJCheckbox();
    }
}
