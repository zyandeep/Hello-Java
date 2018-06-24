// JCheckBox demo
// date: 19-07-14

package allSwingDemos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoJRadio extends JFrame {

    JLabel l, op;
    JRadioButton cpp, java, cHas, php, asp;
    ButtonGroup bg;
    
    public DemoJRadio() 
    {
        super ("JCheck box demo");
        setBounds(300, 200, 430, 270);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout( new FlowLayout(FlowLayout.CENTER, 30, 45));
        
        l = new JLabel("which programming languages do you want to learn in the future ?? ", JLabel.CENTER);
        op = new JLabel();
        cpp = new JRadioButton("C++");
        java = new JRadioButton("JAVA");
        cHas = new JRadioButton("C#");
        php = new JRadioButton("PHP");
        asp = new JRadioButton("ASP");
        
        // ButtonGroup to group several radio buttons togather so that only one of them
        // can be selected at a time
        bg = new ButtonGroup();
        bg.add(cpp);    bg.add(java);   bg.add(cHas);  
        bg.add(php);    bg.add(asp);
        
        this.add(l);
        add(cpp);   add(java);   add(cHas);   add(php);   add(asp);   
        add(op);
        
        handleEvent();
    }
    
    // handling check box events with ActionListener
    void handleEvent ()
    {
       class EventAction implements ActionListener, ItemListener
       {
            public void actionPerformed(ActionEvent e)
            {
                op.setText("you choose: " + e.getActionCommand());
            }

            public void itemStateChanged(ItemEvent e)
            {
                Object sc = e.getItem();  // e.getSource()
                int state = e.getStateChange();
                
                if (sc == cpp)
                    if (state == ItemEvent.SELECTED)
                        op.setText("you choose: C++" );
                
                if (sc == java)
                    if (state == ItemEvent.SELECTED)
                        op.setText("you choose: Java" );
                
                if (sc == cHas)
                    if (state == ItemEvent.SELECTED)
                        op.setText("you choose: C#" );
                
                if (sc == php)
                    if (state == ItemEvent.SELECTED)
                        op.setText("you choose: PHP" );
                   
                if (sc == asp)
                    if (state == ItemEvent.SELECTED)
                        op.setText("you choose: ASP" );
            }
       }
       
       EventAction e = new EventAction();
       
       //
       cpp.addItemListener(e);
       java.addItemListener(e);
       cHas.addItemListener(e);
       php.addItemListener(e);
       asp.addItemListener(e);
    }
    
    public static void main (String[] args)
    {
        new DemoJRadio();
    }
 
}
