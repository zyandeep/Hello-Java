// handling different keys of the keyboards
// date: 18-07-14

package allSwingDemos;

import java.awt.event.*;
import javax.swing.*;

public class DemoKeyEvent extends JFrame {

    public DemoKeyEvent(String title) 
    {
        this.setTitle(title);
        setBounds(300, 200, 550, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.requestFocus();
        
        HandleKey k = new HandleKey();
        this.addKeyListener(k);
    }
    
    class HandleKey extends KeyAdapter {

        public void keyPressed(KeyEvent e) 
        {
            int k = e.getKeyCode();
            char c = e.getKeyChar();
            
            if (k >= KeyEvent.VK_0 && k <= KeyEvent.VK_9 )
            {
                JOptionPane.showMessageDialog(null, "numeric key: " + c);
            }
            else if (k >= KeyEvent.VK_A && k <= KeyEvent.VK_Z )
            {
                JOptionPane.showMessageDialog(null, "alphabetic key: " + c);
            }
            else if (k >= KeyEvent.VK_F1 && k <= KeyEvent.VK_F12 )
            {
                JOptionPane.showMessageDialog(null, "function key: ");
            }
            else if (k >= KeyEvent.VK_NUMPAD0 && k <= KeyEvent.VK_NUMPAD9 )
            {
                JOptionPane.showMessageDialog(null, "numpad key: " + c);
            }
            else if (k == KeyEvent.VK_WINDOWS)
            {
                JOptionPane.showMessageDialog(null, "it's the GREAT WINDOWS key!!: ");
            } 
            else if ( k == KeyEvent.VK_KP_DOWN )
            {
                JOptionPane.showMessageDialog(null, " aerrow/direction key ");
            }
        }
        
    }
  
    public static void main(String[] args) 
    {
        new DemoKeyEvent("Key event handling");
    }
}
