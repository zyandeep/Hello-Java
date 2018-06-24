import java.awt.*;
import java.applet.*;

public class MyGraphics extends Applet {
    
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        
        g.drawString("METHODS OF GRAPHICS CLASS", 200, 70);
        
        g.setColor(Color.green);
        setBackground(Color.red);
        
        //g.drawLine(100, 100, 250, 400);
        //g.drawRect(150, 130, 30, 50);
        //g.fillRect(120, 70, 80, 70);
        
        g.drawOval(10, 100, 100, 60);
        g.fillOval(10, 200, 100, 60);
        g.fillOval(10, 330, 60, 60);
    }    
}
