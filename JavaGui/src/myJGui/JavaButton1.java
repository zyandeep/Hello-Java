// example of JButton
package myJGui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JavaButton1 extends JFrame {

    JButton b = new JButton("quit");

    public JavaButton1() throws HeadlessException {

        super("my Jbutton");
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        add(b);

        b.addActionListener(new ListnerImp());   // registering the Actionlistner with the Jbutton

    }

    public static void main(String[] args) {

        new JavaButton1();
    }

}

class ListnerImp implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        String str = e.getActionCommand();

        if (str.equalsIgnoreCase("qT")) {
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "button is out of order!", "Jbutton dialog", JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
