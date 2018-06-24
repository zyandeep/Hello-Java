// Button class demo

import javax.swing.*;
import java.awt.*;

public class ButtonDemo extends JFrame {

    Container bg;
    JButton rb, gb, bb;

    public ButtonDemo() {
        super("*** Button Demo ***");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        bg = getContentPane();
        bg.setLayout(new FlowLayout(FlowLayout.CENTER, 8, 20));
        
        rb = new JButton("Red");
        gb = new JButton("Green");
        bb = new JButton("Blue");
        JLabel lb = new JLabel();
        lb.setText("Hit a button to change the screen color");

        // adding components to the JFrame
        bg.add(rb);
        bg.add(gb);
        bg.add(bb);
        bg.add(lb);
        eventHandle();
    }

    void eventHandle() {
        DemoActionEvent aEvent = new DemoActionEvent( this );
        
        rb.addActionListener(aEvent);
        gb.addActionListener(aEvent);
        bb.addActionListener(aEvent);
    }
    
    public static void main(String[] args) {
        new ButtonDemo();
    }
}
