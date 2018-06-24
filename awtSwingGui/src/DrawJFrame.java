// Drawing in JFrame

import java.awt.*;
import javax.swing.*;

public class DrawJFrame extends JFrame {

    int yCor = 70;

    public DrawJFrame() {

        super("Drawing in JFrame");

        getContentPane().setBackground(Color.red);

        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    // dummy method drawing graphics
    public void testDrawing(Graphics g) {

        g.drawLine(50, 100, 100, 100);
    }

    //modified paint() for drawing in swing container
    public void paint(Graphics g) {

        super.paint(g);

        g.setColor(Color.white);
        g.drawString("Hello Java", 50, 70);
        testDrawing(g);
    }

    public static void main(String[] args) {

        new DrawJFrame();

    }
}
