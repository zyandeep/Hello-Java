// A class to implement Find, Replace 
// date: 16-08-14

package allSwingDemos;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*; 

public class FindReplaceDemo extends JFrame implements ActionListener {

    JTextArea ta;
    JPanel p;
    JButton find, replace ;
    
    public FindReplaceDemo()
    {
        super("Find and Replace demo");
        setBounds(300, 300, 400, 300);
        setResizable(false); 
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ta = new JTextArea();  
        JScrollPane sp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        p = new JPanel( new FlowLayout(FlowLayout.CENTER, 10, 10)); 
        find = new JButton("Find..");
        replace = new JButton("Replace..");
        
        find.addActionListener(this);       replace.addActionListener(this);
        
        p.add(find);        p.add(replace);
       
        this.add(sp, BorderLayout.CENTER);
        this.add(new JLabel("  "), BorderLayout.WEST);
        this.add(new JLabel("  "), BorderLayout.EAST);
        this.add(p, BorderLayout.PAGE_END);
    }

    
    //
    void enableButton()
    {
        if(ta.getText().isEmpty() == false)
        {
            this.find.setEnabled(true); 
            this.replace.setEnabled(true);
        }
        
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == find)
        {
                    }
        else if(e.getSource() == replace)
        {
            
            
        }
        
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater( new Runnable() 
        {
            public void run()
            {
               new  FindReplaceDemo();
            }
            
        });
    }
}
