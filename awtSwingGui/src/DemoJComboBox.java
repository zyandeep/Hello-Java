// JChoice demo

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoJComboBox extends JFrame implements ItemListener {

    String[] color = {"Red", "Blue", "White", "Orange"};
    JComboBox cb = new JComboBox(color);

    public DemoJComboBox() {
        super("*** JComboBox Demo ***");
        setSize(300, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new JLabel("Demo of JComboBox "));
        add(cb);
        cb.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        String c = (String) cb.getSelectedItem();

        if (c.equalsIgnoreCase("red")) {
            getContentPane().setBackground(Color.red);
        } else if (c.equalsIgnoreCase("blue")) {
            getContentPane().setBackground(Color.blue);
        } else if (c.equalsIgnoreCase("white")) {
            getContentPane().setBackground(Color.white);
        } else {
            getContentPane().setBackground(Color.orange);
        }
    }

    public static void main(String[] args) {
        new DemoJComboBox();
    }
}
