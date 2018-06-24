// JCheckBox demo
// date: 19-07-14

package allSwingDemos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoJCheckBox extends JFrame {

    JLabel l;
    JCheckBox c, cpp, java, cHas, php;
    JButton ok;
    
    public DemoJCheckBox() 
    {
        super ("JCheck box demo");
        setBounds(300, 200, 400, 270);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout( new FlowLayout(FlowLayout.CENTER, 30, 30));
        
        l = new JLabel("what programming languages do you want to learn???", JLabel.CENTER);
        c = new JCheckBox("C");
        cpp = new JCheckBox("C++");
        java = new JCheckBox("JAVA");
        cHas = new JCheckBox("C#");
        php = new JCheckBox("PHP");
        ok = new JButton("DONE");
        
        this.add(l);
        add(c);   add(cpp);   add(java);   add(cHas);   add(php);   
        this.add(ok);
        
        handleEvent();
    }
    
    // handling check box events with ActionListener
    void handleEvent ()
    {
        ok.addActionListener( new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                String output = " ";
                
                if (c.isSelected())
                    output += " C ";
                if (cpp.isSelected())
                    output += " C++ ";
                if (java.isSelected())
                    output += " Java ";
                if (cHas.isSelected())
                    output += " C# ";
                if (php.isSelected())
                    output += " PHP ";
                
                JOptionPane.showMessageDialog(null, output);
            }  
        });    
    }
    
    public static void main (String[] args)
    {
        new DemoJCheckBox();
    }
 
}
