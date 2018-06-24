package awtEvent;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ColorChanger extends JFrame {

    JLabel l1 = new JLabel("JFrame demo of keyTyped");
    JLabel l2 = new JLabel("R - red, G - green, B - blue, default - gray");
    Container bg;

    public ColorChanger() {
        super("*** color changer ***");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        bg = getContentPane();
        bg.setBackground(Color.yellow);
        bg.add(l1);
        bg.add(l2);

        //requestFocus();

        addKeyListener(new KeyAdapter() {
           
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == 'r') {
                    bg.setBackground(Color.red);
                } else if (e.getKeyChar() == 'g') {
                    bg.setBackground(Color.green);
                } else if (e.getKeyChar() == 'b') {
                    bg.setBackground(Color.blue);
                } else {
                    bg.setBackground(Color.gray);
                }
            }
        });
    }

    public static void main(String[] args) {
        new ColorChanger();
    }
}
