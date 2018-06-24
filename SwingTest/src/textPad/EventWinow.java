// A class to implement window lastener
// date: 30-07-14

package textPad;

import allSwingDemos.*;
import java.awt.event.*;

public class EventWinow extends WindowAdapter {

    FontChooser fc;
    
    public EventWinow(FontChooser f)
    {
        this.fc = f;
    }

   
    public void windowClosed(WindowEvent e)
    {
        this.fc.df.setFocusableWindowState(true);
        this.fc.df.b1.setEnabled(true);
        this.fc.df.b2.setEnabled(true);
    }
    
}
