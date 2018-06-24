// Implementing CaretListener
// date: 20-08-2014

package textPad;

import javax.swing.event.*;

public class CaratListenerDemo implements CaretListener 
{
    EditMenu em;
    
    public CaratListenerDemo( EditMenu e)
    {
        this.em = e;
    }

    
    //
    public void caretUpdate(CaretEvent e)
    {
        if(em.ta.getSelectedText() != null)
        {
            em.cut.setEnabled(true); 
            em.copy.setEnabled(true);
            em.delete.setEnabled(true); 
        }
      
    }
    
}
