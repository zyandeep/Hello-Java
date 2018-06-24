// Implementing DocumentListener interface
// date: 15-08-14

package allSwingDemos;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class DemoDocument extends WindowAdapter implements DocumentListener 
{
    boolean editText;
    JTextAreaFeatures tf;
    
    public DemoDocument( JTextAreaFeatures t) 
    {
        this.tf = t;
        editText = false;
    }

    // overriding WindowAdepter
    public void windowClosing(WindowEvent e)
    {
        if(editText)
        {
            int result = JOptionPane.showConfirmDialog(null, "Want to save the file?", "My NotePad", JOptionPane.YES_NO_OPTION); 
            
            if(result == JOptionPane.YES_OPTION)
               JOptionPane.showMessageDialog(null, "File is saved successfully"); 
            else
            {
                tf.dispose();
            }
                
        }
            
        else
            tf.dispose();      
    }
    
    
    //
    void fileEdit()
    {
        this.editText = true;
        
        if( tf.getTitle().startsWith("*") == false) 
            tf.setTitle("*" + tf.getTitle());
    }
    
    
    
    // implementing DocumentListener
    public void changedUpdate(DocumentEvent e)
    {
        // is never called for a plainDocument
    }

    public void insertUpdate(DocumentEvent e)
    {
        fileEdit();
    }

    
    public void removeUpdate(DocumentEvent e)
    {
         fileEdit();
    }
}
