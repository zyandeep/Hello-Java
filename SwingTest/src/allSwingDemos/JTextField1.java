// demo of JTextField
// date: 18-07-14

package allSwingDemos ;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class JTextField1 extends JFrame implements ActionListener {

    JTextField t1, t2, ans;
    JLabel l1, l2;
    JButton ok;
    
    public JTextField1()
    {
        this.setTitle("JTextField demo");
        setBounds(300, 200, 400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 80, 40));
        
        l1 = new JLabel("Enter Width");
        l2 = new JLabel("Enter Height");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        ans = new JTextField(20);
        ok = new JButton("OK");
       
        add(l1);        add(t1);
        add(l2);        add(t2);
        add(ok);        add(ans);

        t1.addActionListener(this);
        t2.addActionListener(this);
        ok.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) 
    {
        String w, h;
        double ww, hh, a;
        
        ans.setText(" ");
        
        w = t1.getText();           h = t2.getText();
        
        if (w.isEmpty() || h.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Fill the form");
            return ;
        }
           
       ww = Double.parseDouble(w);         hh = Double.parseDouble(h);
       a = ww * hh;
       
       ans.setText( String.valueOf(a) );  
    }
        
    
    public static void main (String[] text)
    {
        new JTextField1();
    }
    
    
}
