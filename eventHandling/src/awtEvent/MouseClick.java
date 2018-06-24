// Mouse event handling
package awtEvent;

import java.awt.*;

public class MouseClick extends Frame {
    
    String str = " ";

    public MouseClick() {
        super("*** Mouse click ***");
        setSize(400, 400);
        setVisible(true);
        setForeground(Color.black);
   
        addWindowListener(new WindowClose());
        addMouseListener( new CilickColor(this));
    }

    public void paint(Graphics g) { 
        g.drawString(str, 40, 50);
    }

    public static void main(String[] args) {
        new MouseClick();
    }
}
