// Handling key event
package awtEvent;

import java.awt.event.*;
import java.awt.*;

public class KeyEventEx extends Frame {

    String str;
    int ycor = 40;

    public KeyEventEx() {
        setTitle("Key event");
        setSize(300, 400);
        setVisible(true);
        setBackground(Color.blue);
        setForeground(Color.white);

        addKeyListener(new Demo()); // registering the mouseMotion listner

        addWindowListener(new WindowClose());   // registering the window listner

        requestFocus();
    }

    public void paint(Graphics g) {
        g.drawString(str, 50, ycor + 10);
    }

    class Demo implements KeyListener {

        public void keyTyped(KeyEvent e) {
            str = "key typed: " + e.getKeyChar();

            repaint();
        }

        public void keyPressed(KeyEvent e) {
        }

        public void keyReleased(KeyEvent e) {
        }
    }
}
