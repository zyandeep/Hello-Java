// example of JtextField
package myJGui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JavaTextField extends JFrame {

    JButton b;

    static JTextField t1, t2;

    public JavaTextField() {

        super("JTextField Demo");
        setSize(400, 400);
        setVisible(true);

        setLayout(new FlowLayout() );

        b = new JButton("copy");
        b.addActionListener(new ImpListner());

        t1 = new JTextField(30);
        t2 = new JTextField(30);

        add(t1);
        add(t2);
        add(b);
    }

}

class ImpListner implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equalsIgnoreCase("copy")) {

            JavaTextField.t2.setText( JavaTextField.t1.getText() );

        }

    }

}
