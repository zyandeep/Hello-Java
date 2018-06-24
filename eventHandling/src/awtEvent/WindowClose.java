// window event handling

package awtEvent;

import java.awt.event.*;

public class WindowClose extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
       
        System.exit(0);
    }
}
