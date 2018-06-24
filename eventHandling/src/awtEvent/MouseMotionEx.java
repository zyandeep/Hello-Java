// Demo of MouseEvent and MouseMotion Listener
package awtEvent;

import java.awt.*;
import java.awt.event.*;

public class MouseMotionEx extends Frame implements MouseMotionListener {

    int xCor, yCor;

    public MouseMotionEx() {
        setTitle("mouse event");
        setSize(300, 400);
        setVisible(true);
        setBackground(Color.blue);
        setForeground(Color.white);

        addMouseMotionListener(this);  // registering the mouseMotion listner

        addWindowListener(new WindowClose());   // registering the window listner

        // requestFocus();   
    }

    public void paint(Graphics g) {
        g.drawString("(" + xCor + " ," + yCor + ")", xCor, yCor);
    }

    public void mouseMoved(MouseEvent e) {
        xCor = e.getX();
        yCor = e.getY();

        repaint();
    }

    public void mouseDragged(MouseEvent e) {
    }

    public static void main(String[] args) {

        new MouseMotionEx();
    }
}
