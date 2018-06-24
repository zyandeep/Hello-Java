// find, findNext demo
// date: 29-08-14

package textPad;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SearchBackward extends JFrame implements ActionListener {

    private JTextArea ta;
    private JScrollPane sp;
    private JTextField find;
    private JLabel lb;
    private JButton f;
    private JCheckBox cb;
    private JPanel p;
    
    private boolean caseMatch;
    
    public SearchBackward() 
    {
        super("Find text backward");
        setBounds(300, 200, 500, 350);
        setVisible(true);
        setResizable(false); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ta = new JTextArea("Write some text here...");
        sp = new JScrollPane(ta);
        this.add(sp, BorderLayout.CENTER);
        
        p = new JPanel(new FlowLayout( FlowLayout.LEADING, 15, 10)); 
        find = new JTextField(15);  
        lb = new JLabel(" Find what: ");
        f = new JButton("Find next");
        f.addActionListener(this); 
        
        cb = new JCheckBox("Match case");
        cb.addActionListener( new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                if( cb.isSelected() )
                    caseMatch = true;
                else
                    caseMatch = false;
            }
        });
        
        p.add(lb);        p.add(find);     p.add(f);        
        p.add(cb);
       
        this.add(p, BorderLayout.PAGE_END);
    }

    
    public void actionPerformed(ActionEvent e) 
    {
        String findText = find.getText();
        String text = ta.getText();
        
        if( findText.isEmpty() || text.isEmpty() )
            JOptionPane.showMessageDialog(this, "Empty find text!");
        else
        {
            findTextFunc(text, findText, caseMatch);
        }
    }
    
    
    private void findTextFunc(String text, String fText, boolean cm)
    {
        // focus on text area to highlight text
        ta.requestFocusInWindow();
         
        int start, end, carPos ; 
        
        if( ta.getSelectedText() == null )
        {
            carPos = ta.getCaretPosition();
        }
        
        else
        {
            carPos = ta.getCaretPosition() - (fText.length() + 1) ;
        }
       
        
        if(cm)
        {
            start = text.lastIndexOf( fText, carPos );
            end = start + fText.length();
           
            if(start == -1)
            {
                JOptionPane.showMessageDialog(this, "Nothing found!!");
            }
             
            else
            {
//                ta.setSelectionStart(start); 
//                ta.setSelectionEnd(end);    
                
                ta.select(start, end); 
            }
            
        }
        
        
        else
        {
            text = text.toLowerCase();
            fText = fText.toLowerCase();
            
            start = text.lastIndexOf( fText, carPos );
            end = start + fText.length();
            
            if(start == -1)
            {
                JOptionPane.showMessageDialog(null, "Nothing found!!");
            }
            else
            {
                ta.select(start, end); 
            }
            
        }
    }
    
    
    
    //////////////////////////////////////////
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater( new Runnable() 
        {   
            public void run()
            {
                new SearchBackward();
            }
        });
    }
}
