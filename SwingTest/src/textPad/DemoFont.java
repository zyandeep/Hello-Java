// remove a component, working with Font class
// date: 27-07-14

package textPad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoFont extends JFrame implements ActionListener {

    JPanel p1, p2;
    JButton b1, b2;
    JLabel l;
    Font newFont;
    Color newCol;

    public DemoFont()
    {
        super("Demo of Font, Color");
        setBounds(500, 200, 500, 220);
        setVisible(true);
        setResizable(false);
        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        p1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));
        p2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 20));

        l = new JLabel("Java is easy to LEARN and USE!!", JLabel.CENTER);
        p1.add(l);

        b1 = new JButton("Change FONT!");
        b1.addActionListener(this);
        b2 = new JButton("Change COLOR!");
        b2.addActionListener(this);

        p2.add(b1);
        p2.add(b2);

        this.add(p1);
        this.add(p2);
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() {
                new DemoFont();
            }
        });
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b1) 
        {
            new FontChooser(this);
        }
        else 
        {
            new ColorPicker(this);
        }
    }
}