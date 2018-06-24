// A class to demo JColorChooser dialog box
// date: 30-07-14

package allSwingDemos;

import javax.swing.*;
import java.awt.*;

public class ColorPicker {

    private DemoFont df;
    private Color newCol;
    
    public ColorPicker(DemoFont df) 
    {
        this.df = df;
        
        // show the JColorChooser
        newCol = JColorChooser.showDialog(null, "Pick your color...", Color.RED);
        
        if(newCol == null)
        {
           JOptionPane.showMessageDialog(null, "You didn't pick any color!", "Color Message", JOptionPane.PLAIN_MESSAGE);
        }
        else
            df.l.setForeground(newCol);  
    }
    
}
