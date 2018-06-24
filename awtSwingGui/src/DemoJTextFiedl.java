// JTextField demo

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DemoJTextFiedl extends JFrame implements ActionListener {

    JTextField name = new JTextField(30);
    JButton b = new JButton("Submit");

    public DemoJTextFiedl() {
        super("*** Button Demo ***");
        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 50));

        add(new JLabel("Your Name : "));
        add(name);
        add(b);

        name.addActionListener(this);
        b.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == name) {
            JOptionPane.showMessageDialog(null, "Event source is textField!", null, JOptionPane.INFORMATION_MESSAGE);
            name.setFont(new Font("Comic Sans MS", Font.BOLD + Font.ITALIC, 14));
            name.setText("Hi " + name.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Event source is button", null, JOptionPane.INFORMATION_MESSAGE);
            name.setFont(new Font("Courier New", Font.ITALIC, 18));
            name.setText("Hi " + name.getText());
        }


    }

    public static void main(String[] args) {
        new DemoJTextFiedl();
    }
}
