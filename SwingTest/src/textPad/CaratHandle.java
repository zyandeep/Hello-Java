// handling carate position 
// date: 05-08-2014

package textPad;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.BadLocationException;

public class CaratHandle extends JFrame implements CaretListener, ActionListener {

    JTextArea ta;
    JScrollPane sc;
    JButton b;
    JLabel carat;
    
    public CaratHandle()
    {
        setTitle(" Handling carat position ");
        setSize(400, 300); 
        setVisible(true);
        setResizable(false);
        setLayout( new BorderLayout()); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        b = new JButton("Enable Status bar");
        b.addActionListener(this);
        this.add(b, BorderLayout.PAGE_START);
        
        ta = new JTextArea("Tracking the carate...");
        ta.addCaretListener(this); 
        sc = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.add(sc, BorderLayout.CENTER);
        
        carat = new JLabel("row: 0,  col: 0 ", JLabel.TRAILING);
        
    }

    public void actionPerformed(ActionEvent e)
    {
        if(b.getActionCommand().equalsIgnoreCase("Enable Status bar"))
        {
            b.setText("Disable Status bar");
            this.add(carat, BorderLayout.SOUTH);
        }
            
        else
        {
            b.setText("Enable Status bar");
            this.remove(carat); 
        }
            
    }

    // how to trake the carate position
    public void caretUpdate(CaretEvent e)
    {
        int offset, lineNumber, colNumber;
        
        offset = ta.getCaretPosition();
        
        try {
            
            lineNumber = ta.getLineOfOffset(offset) ;    // converts an offset to line number
            colNumber = (offset - ta.getLineStartOffset(lineNumber) ) + 1;      // calculates column number
            
            
            carat.setText( String.format("||  row:  %d,  col:  %d  " , lineNumber + 1,colNumber)); 
        }
        catch(BadLocationException ble)
        {
            System.err.println(ble);
        }
        
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater( new Runnable() 
        {

            public void run()
            {
               new CaratHandle();
            }
            
        });
    }
}
