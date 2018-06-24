// class to handle Action and Item events for JMenuItem
// date: 26-07-14

package textPad;

import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

public class ActionItemEvent implements ActionListener, ItemListener {

    DemoNotePad obj;
    
    public ActionItemEvent(DemoNotePad obj)
    {
        this.obj = obj;
    }

    public ActionItemEvent()
    {
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
       String command = e.getActionCommand();
       
       if (command.equals("date"))
       {
           Date d = new Date();
           obj.ta.append(d.toString() + "\n");
       }
       else
       {
           obj.ta.append("Action Event detected !\n");
           obj.ta.append("  Event source: JMenuItem " + "\t" + e.getActionCommand() + "\n");
           
       }
       
    }

    public void itemStateChanged(ItemEvent e)
    {
        Object o = e.getSource();
        obj.ta.append("ItemEvent detected !\n");
       
        if (o instanceof JRadioButtonMenuItem)
        {
            obj.ta.append(" Event source: JRadioButtonMenuItem" + "\t" + 
                    "is selected: " + ((JRadioButtonMenuItem) o ).isSelected() + "\n");
        }
        else
        {
              obj.ta.append(" Event source: JCheckBoxMenuItem" + "\t" + 
              "is selected: " + ((JCheckBoxMenuItem) o ).isSelected() + "\n");
            
        }
    }
    
}
