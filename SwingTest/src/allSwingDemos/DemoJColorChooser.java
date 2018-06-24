// Demo fo JColorChooser dialog box
// date: 30-07-14

package allSwingDemos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoJColorChooser extends JFrame implements ActionListener {

    JLabel l;
    JButton b;
    Color c;
    
    public DemoJColorChooser()
    {
        try {
            UIManager.setLookAndFeel( new javax.swing.plaf.nimbus.NimbusLookAndFeel());
            
        }
        catch (Exception e)
        {
            System.err.println("Error!");
        }
        
        setTitle("Color Chooser Demo...");
        setBounds(400, 200, 500, 150);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout( new FlowLayout(FlowLayout.CENTER, 350, 30) );
        
        l = new JLabel("All works and no play makes Jack a dull boy!", JLabel.CENTER);
        b = new JButton("Choose Color");
        
        this.add(l);        this.add(b);
        b.addActionListener(this);
    }
    

    public void actionPerformed(ActionEvent e)
    {
        // show a color chooser dialog box
        c = JColorChooser.showDialog(null, "Pick your color...", Color.RED);
        
        if(c == null)
        {
           JOptionPane.showMessageDialog(null, "You didn't pick any color!", "Color Message", JOptionPane.PLAIN_MESSAGE);
        }
        else
            l.setForeground(c);
    }
    
    
    public static void main(String[] args)
    {
        // swing is not thread safe
        SwingUtilities.invokeLater( new Runnable() {

            public void run()
            {
                new DemoJColorChooser();
            }
        });
    }
}
