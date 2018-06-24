// find, findNext demo
// date: 29-08-14

package textPad;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FindDialog extends JFrame implements ActionListener {

    private JTextArea ta;
    private JScrollPane sp;
    private JTextField find;
    private JLabel lb;
    private JButton f;
    private JCheckBox cb;
    private JPanel p;
    
    private boolean caseMatch;
    
    public FindDialog() 
    {
        super("Find text");
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
            JOptionPane.showMessageDialog(null, "Empty find text!");
        else
        {
            findTextFunc(text, findText, caseMatch);
        }
    }
    
    
    private void findTextFunc(String text, String fText, boolean cm)
    {
        ta.requestFocusInWindow();
         
        int start, end;
        
        if(cm)
        {
            start = text.indexOf(fText, ta.getCaretPosition() );
            end = start + fText.length();
           
            if(start == -1)
            {
                JOptionPane.showMessageDialog(null, "Nothing found!!");
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
            
            start = text.indexOf(fText, ta.getCaretPosition());
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
                new FindDialog();
            }
        });
    }
}
