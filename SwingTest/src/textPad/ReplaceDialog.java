// implementing Replace, replace all
// date: 27-08-14

package textPad;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReplaceDialog extends JFrame implements ActionListener {
    
    private JTextArea ta;
    private JScrollPane sp;
    private JTextField fromField;
    private JTextField toField ;
    private JLabel lb;
    private JButton r, ra;
    private JCheckBox cb;
    private JPanel p;
    
    private boolean caseMatch ;

    public ReplaceDialog() 
    {
        super("Replace text");
        setBounds(300, 200, 600, 350);
        setVisible(true);
        setResizable(false); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ta = new JTextArea("Write some text here...");
        sp = new JScrollPane(ta);
        this.add(sp, BorderLayout.CENTER);
        
        p = new JPanel(new FlowLayout( FlowLayout.LEADING, 8, 10));
        fromField = new JTextField(10); 
        toField = new JTextField(10); 
        lb = new JLabel(" with ");
        r = new JButton("Replace");
        r.addActionListener(this); 
        ra = new JButton("Replace all");
        ra.addActionListener(this);
        
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
        
        p.add(fromField);        p.add(lb);     p.add(toField);        
        p.add(r);       p.add(ra);      p.add(cb);
        this.add(p, BorderLayout.PAGE_END);
    }
    
    
    public void actionPerformed(ActionEvent e) 
    {
        String from = fromField.getText();
        String to = toField.getText();
        String text = ta.getText();
        
        if( text.isEmpty() || from.isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "empty text!!");
            return;
        }
        
        if( to.isEmpty())
            to = " ";
                
        if( e.getSource() == r)
        {
            if(caseMatch)
                replaceText(text, from, to);
            
            else
            {
                replaceTextIgnoreCase(text, from, to);
            }
        }
        
        else if(e.getSource() == ra)
        {
            if(caseMatch)
                ta.setText( text.replaceAll(from, to) );
            
            else
            {
                 replaceAllIgnoreCase(text, from, to);
            }
          
        }
    }
  
    
    //////////////////////////////////////
    private void replaceText(String text, String from, String to)
    {
         ta.requestFocusInWindow();
         
         String selText = ta.getSelectedText();
         
         if(selText != null && selText.equals(from) )
         {
            ta.replaceSelection(to);
            text = ta.getText();
         }
         
         int start = text.indexOf(from);
         int end  = start + from.length();
         
         if(start == -1)
         {
             JOptionPane.showMessageDialog(null, "Nothing found!!");
         }
             
         else
         {
             ta.setSelectionStart(start); 
             ta.setSelectionEnd(end);    
         }
         
    }
    
    
    private void replaceTextIgnoreCase(String text, String from, String to)
    {
        int start, end;
        
        ta.requestFocusInWindow();
        
        String selText = ta.getSelectedText();
         
        if(selText != null && selText.equalsIgnoreCase(from) )
        {
            ta.replaceSelection(to);
            text = ta.getText();
        }
         
        text = text.toLowerCase();
        from = from.toLowerCase();
            
        start = text.indexOf(from, ta.getCaretPosition());
        end = start + from.length();
            
        if(start == -1)
        {
           JOptionPane.showMessageDialog(null, "Nothing found!!");
        }
        else
        {
            ta.select(start, end); 
        }
       
    }
    
    
    private void replaceAllIgnoreCase(String text, String from, String to)
    {
        int start = 0, end = -1;
     
        ta.requestFocusInWindow();
        
        while(true)
        {
            text = text.toLowerCase();
            from = from.toLowerCase();
            
            start = text.indexOf(from, end + 1);
            end = start + from.length();
           
            if(start == -1)
                break;
            
            ta.replaceRange(to, start, end);
            text = ta.getText();
            
        }
      
    }
    
    
    
   /////////////////////////////////////////////////////
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater( new Runnable() 
        {   
            public void run()
            {
                new ReplaceDialog();
            }
        });
    }

}
