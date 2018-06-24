// cut, copy, paste, redo, undo
// date: 4-08-2014

package textPad;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.undo.*;
import java.awt.event.*;

public class EditMenu extends JFrame implements ActionListener,  UndoableEditListener, DocumentListener 
{
    JTextArea ta;
    JPanel p;
    JButton cut, copy, paste, redo, undo, delete;
    private UndoManager um; 
    private CaratListenerDemo cd;
    
    public EditMenu()
    {
        setTitle("cut, copy, paste, redo, undo...");
        setBounds(300, 300, 490, 250);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        um = new UndoManager();
        
        ta = new JTextArea(50, 50);
        ta.setWrapStyleWord(true);
        ta.setLineWrap(true);
        ta.getDocument().addUndoableEditListener(this);
        ta.getDocument().addDocumentListener(this); 
        
        cd = new CaratListenerDemo(this);
        ta.addCaretListener(cd); 
        
        cut = new JButton("Cut");
        copy = new JButton("Copy");
        paste = new JButton("Paste");
        redo = new JButton("Redo");
        undo = new JButton("Undo");
        delete = new JButton("Delete");
        cut.addActionListener(this);        copy.addActionListener(this);       paste.addActionListener(this);
        redo.addActionListener(this);       undo.addActionListener(this);       delete.addActionListener(this);
        
        p = new JPanel( new FlowLayout());
        
        undo.setEnabled(false);
        redo.setEnabled(false);
        
        cut.setEnabled(false);
        copy.setEnabled(false);
        paste.setEnabled(false);
        delete.setEnabled(false); 
        
        p.add(copy);        p.add(cut);        p.add(paste);
        p.add(redo);        p.add(undo);        p.add(delete);
       
        this.add(ta, BorderLayout.CENTER);
        this.add(p, BorderLayout.SOUTH);
        
    }

    
    // implementing Action Listener
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == copy)
        {
            ta.copy();
            this.paste.setEnabled(true); 
        }
            
        if (e.getSource() == cut)
        {
            ta.cut();
            this.paste.setEnabled(true); 
        }
            
        if (e.getSource() == paste)
        {
            ta.paste();
        }
            
        if (e.getSource() == delete)
        {
            ta.replaceSelection(" ");
        }
        
        if (e.getSource() == redo)
        {
           try {
               um.redo();
           }
           catch(CannotRedoException cre)
           {
               System.err.println("REDO ERROR!!");
           }
           
           updateRedoUndo();
        }
        
        if (e.getSource() == undo)
        {
           try {
               um.undo();
           }
           catch(CannotUndoException cue)
           {
               System.err.println("UNDO ERROR!!");
           }
           
           updateRedoUndo();
        }
    }
    
    private void updateRedoUndo()
    {
        undo.setEnabled(um.canUndo());
        redo.setEnabled(um.canRedo());
    }
    
    //
    public void undoableEditHappened(UndoableEditEvent e)
    {
        //Remember the edit 
        um.addEdit(e.getEdit());
        updateRedoUndo();
    }
    
    
    // implementing Document listener methods
    public void changedUpdate(DocumentEvent e)
    {
        // never invoked
    }

    public void insertUpdate(DocumentEvent e)
    {
        
    }

    public void removeUpdate(DocumentEvent e)
    {
        if( ta.getText().isEmpty() )
        {
            cut.setEnabled(false); 
            copy.setEnabled(false); 
            delete.setEnabled(false); 
        }
    }
    
    
    //
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater( new Runnable() 
        {

            public void run()
            {
               JFrame.setDefaultLookAndFeelDecorated(true); 
               new EditMenu();
            }
            
        });
        
    }
    
}
