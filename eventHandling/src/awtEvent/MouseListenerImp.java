package awtEvent;

import java.awt.event.*;

public class MouseListenerImp implements MouseListener {

    MouseListenerEx mob;

    public MouseListenerImp( MouseListenerEx temp ) {
        this.mob = temp;
    }

    public void mouseClicked(MouseEvent e) {
       // mob.myStr = "mouse clicked: " + e.getClickCount();
        //mob.repaint();
    }

    public void mouseEntered(MouseEvent e) {
        mob.myStr = "mouse has entered! " + "position (" + e.getX() + ", " + e.getY() + " )";
        mob.repaint();
    }

    public void mouseExited(MouseEvent e) {
        mob.myStr = "mouse has exited! ";
        mob.repaint();
    }

    public void mousePressed(MouseEvent e) {
        mob.myStr = "mouse is pressed! ";
        mob.repaint();
    }

    public void mouseReleased(MouseEvent e) {
        mob.myStr = "mouse is released! ";
        mob.repaint();
    }
}
