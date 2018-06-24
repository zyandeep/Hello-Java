package awtEvent;

import java.awt.*;
import java.awt.event.*;

public class AwtPaint extends Frame {

    public AwtPaint() {
        super("awt frame");
        setSize(400, 400);
        setVisible(true);
        setBackground(Color.BLUE);

        addWindowListener(new Demo());
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 14));

        g.drawString("awt painting", 50, 50);
    }

    class Demo extends WindowAdapter {

        public void windowClosing(WindowEvent e) {
            System.exit(0);

        }
    }
}
