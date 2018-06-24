// demo of JPopup menu
// accelarators are not added to popup menu items
// date: 26- 07-14

package allSwingDemos;

import java.awt.event.*;
import javax.swing.*;

public class DemoJPopupMenu extends MouseAdapter {

    ActionItemEvent obj;
    JPopupMenu p;
    JMenuItem undo, cut, copy, paste, del, date;
    
    public DemoJPopupMenu( ActionItemEvent obj )
    {
        this.obj = obj;
        
        p = new JPopupMenu();
        
        undo = new JMenuItem("Undo");
        undo.addActionListener(obj);
        cut = new JMenuItem("Cut");
        cut.addActionListener(obj);
        copy = new JMenuItem("Copy");
        copy.addActionListener(obj);
        paste = new JMenuItem("Paste");
        paste.addActionListener(obj);
        del = new JMenuItem("Delete");
        del.addActionListener(obj);
        date = new JMenuItem("Insert date & time");
        date.setActionCommand("date");
        date.addActionListener(obj);
        
        p.add(undo);
        p.addSeparator();
        p.add(cut);     p.add(copy);         p.add(paste);          p.add(del);
        p.addSeparator();
        p.add(date);
        
    }

    private void showPopup(MouseEvent e)
    {
        if( e.isPopupTrigger() ) 
        {
            p.show(e.getComponent(), e.getX(), e.getY());
            
        }
    }
    
    public void mousePressed(MouseEvent e)
    {
        showPopup(e);
    }

    public void mouseReleased(MouseEvent e)
    {
        showPopup(e);
    }
    
    
}
