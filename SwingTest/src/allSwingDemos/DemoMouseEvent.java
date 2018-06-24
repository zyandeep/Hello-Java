// Mouse click handling
// date: 18-07-14

package allSwingDemos;

import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;

public class DemoMouseEvent extends JFrame {

    JButton b;
    JPanel p;
    
    public DemoMouseEvent(String title)
    {
        super(title);
        setBounds(500, 200, 400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        p = new JPanel( new FlowLayout(FlowLayout.CENTER, 10, 50));
        b = new JButton("Click me!");
        
        //
        Mouse m = new Mouse();
        b.addMouseListener(m);
        
        p.add(b);
        
        this.add(p);
        
    }
    
    class Mouse extends MouseAdapter 
    {
        String msg = " ";
        int click = 0;
        
        public void mouseClicked(MouseEvent e) 
        {
            click = click + e.getClickCount();
        
            if (click > 2)
                msg = + click + " times";
            
            JOptionPane.showMessageDialog( null, "I hava been clicked " + msg, " Mouse events", JOptionPane.PLAIN_MESSAGE );
        }
    }
    
    public static void main (String[] args)
    {
        new DemoMouseEvent("Mouse Event");
    }
}
