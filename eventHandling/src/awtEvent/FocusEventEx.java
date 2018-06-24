package awtEvent;

import java.awt.*;
import java.awt.event.*;

public class FocusEventEx extends Frame {

    private String str = " ";

    public FocusEventEx() {
        setTitle("*** Focus Event ***");
        setSize(400, 400);
        setVisible(true);

        addWindowListener(new WindowClose());
        
        addFocusListener(new FocusAdapter() {          // event handling by annonymous class
            public void focusGained(FocusEvent e) {
                str = "Focus gained!";
                repaint();
            }

            public void focusLost(FocusEvent e) {
                str = "Focus lost!";
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString(str, 50, 50);
    }
    
    public static void main(String[] args) {
        new FocusEventEx();
    }
}
