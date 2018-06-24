// demo of using JSlider
// date: 20-07-14

package allSwingDemos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class DemoJSlider extends JFrame {

    JPanel p1, p2;
    JSlider s1, s2;
    JButton ok;
    JLabel l;
    
    public DemoJSlider() 
    {
        super ("JSlider Demo");
        setBounds(400, 170, 500, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2, 5, 10));
        
        p1 = new JPanel( new FlowLayout(FlowLayout.CENTER, 10, 70));
        p2 = new JPanel( new FlowLayout(FlowLayout.CENTER, 50, 40));
        
        s1 = new JSlider(0, 50, 10);
        s1.setMajorTickSpacing(10);
        s1.setSnapToTicks(true);
        s1.setPaintTicks(true);
        s1.setPaintLabels(true);
        s1.setMinorTickSpacing(5);
        ok = new JButton("OK");
        p1.add(s1);     p1.add(ok);
        
        s2 = new JSlider();
        s2.setInverted(true);
        s2.setMinimum(10);
        s2.setMaximum(100);
        s2.setValue(50);
        s2.setOrientation(SwingConstants.VERTICAL);
        s2.setMajorTickSpacing(10);
        s2.setMinorTickSpacing(5);
        s2.setPaintTicks(true);
        s2.setPaintLabels(true);
        l = new JLabel("Slider's current value: ", JLabel.CENTER);
        p2.add(s2);     p2.add(l);
        
        this.add(p1);
        this.add(p2);
        
        handleEvent();
    }
    
    void handleEvent()
    {
        ok.addActionListener( new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, " Silders current value: " + s1.getValue());
            }
                  
         });
        
        
        s2.addChangeListener( new ChangeListener() {
           
            public void stateChanged(ChangeEvent e)
            {
                l.setText(" Silders current value: " + s2.getValue());
                
            }
        });
    }
    
    public static void main (String[] args)
    {
        new DemoJSlider();
    }
    
}