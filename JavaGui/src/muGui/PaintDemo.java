// paint within a JFrame 
package muGui;

import java.awt.*;
import java.awt.event.*;

public class PaintDemo extends Frame {

    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    String[] fontList = ge.getAvailableFontFamilyNames();
    int i = 0;
    String str = "I Love Java";

    public PaintDemo() {
        super("Drawing");
        setSize(400, 400);
        setVisible(true);
        
        // event handling with anonymous class
        addWindowListener(new WindowAdapter() {
        
               @Override
               public void windowClosing( WindowEvent e) {
                    System.exit(0);
                }
        });
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);

        g.setFont(new Font(fontList[i++], Font.PLAIN, 16));
        g.drawString(str, 40, 50);

        g.setFont(new Font(fontList[i++], Font.BOLD, 20));
        g.drawString(str, 40, 100);

        g.setFont(new Font(fontList[i++], Font.ITALIC, 24));
        g.drawString(str, 40, 150);

        g.setFont(new Font(fontList[i++], Font.TRUETYPE_FONT, 24));
        g.drawString(str, 40, 200);

        g.setFont(new Font(fontList[i++], Font.PLAIN, 24));
        g.drawString(str, 40, 250);

        g.setFont(new Font(fontList[i++], Font.BOLD, 25));
        g.drawString(str, 40, 300);
        
        g.setFont( new Font(fontList[i++], Font.ITALIC, 25) );
        g.drawString(str, 40, 350);


    }

    public static void main(String[] args) {
        new PaintDemo();
    }
}
