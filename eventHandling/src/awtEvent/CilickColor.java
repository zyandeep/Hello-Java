package awtEvent;

import java.awt.Color;
import java.awt.event.*;

public class CilickColor extends MouseAdapter {

    MouseClick mc;
    int i = 0;
    String[] colName = {"white", "blue", "green", "cyan", "gray", "magenta", "orange",
        "pink", "red", "yellow"};
    
    // array of Color objects
    Color[] col = {
        Color.white, Color.blue, Color.green, Color.cyan, Color.gray, Color.magenta, Color.orange,
        Color.pink, Color.red, Color.yellow
    };

    public CilickColor(MouseClick mc) {
        this.mc = mc;
    }

    public void mouseClicked(MouseEvent e) {
        
        if(i == col.length )
            i = 0;
        
        mc.str = colName[i];
        mc.setBackground(col[i++]);
        mc.repaint();
    }
}
