// implementing MouseListener
package awtEvent;

import java.awt.*;

public class MouseListenerEx extends Frame {

    String myStr = " ";

    public MouseListenerEx() {
        super("*** MouseEvent handling ***");
        setSize(400, 400);
        setVisible(true);

        addWindowListener(new WindowClose());
        addMouseListener( new MouseListenerImp( this ));

    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawString(myStr, 50, 50);
    }

    public static void main(String[] args) {
        new MouseListenerEx();
    }
}
