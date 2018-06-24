// demo of using borders with swing controls
// date: 20-07-14
package allSwingDemos;

import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import javax.swing.*;

public class PizzaOrder extends JFrame {

    JRadioButton s, m, l;
    JCheckBox pep, mush, arc;
    JPanel p1, p2;
    JButton ok;
    ButtonGroup bg;

    public PizzaOrder() 
    {
        try {
            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName());
            
        } catch (Exception e) {
            System.err.println(e);
        } 
        
        setTitle("Order Your Pizza!!");
        setBounds(400, 170, 600, 330);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 40, 25);

        setLayout(fl);

        p1 = new JPanel(fl);
        p2 = new JPanel(fl);

        p1.setBorder(BorderFactory.createTitledBorder("SIZE"));
        Border b = BorderFactory.createRaisedBevelBorder();
        p2.setBorder(BorderFactory.createTitledBorder(b, "Toppings", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Comic Sans MS", Font.ITALIC, 14), Color.RED));

        s = new JRadioButton("Small");
        m = new JRadioButton("Medium");
        l = new JRadioButton("Large");
        bg = new ButtonGroup();
        bg.add(s);
        bg.add(m);
        bg.add(l);
        p1.add(s);
        p1.add(m);
        p1.add(l);

        pep = new JCheckBox("Pepperoni");
        mush = new JCheckBox("Mushroom");
        arc = new JCheckBox("Archovies");
        ok = new JButton("Order Now!!");
        p2.add(pep);
        p2.add(mush);
        p2.add(arc);
        p2.add(ok);

        this.add(p1);
        this.add(p2);

        eventHandle();
    }

    void eventHandle() {
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String size, topp = " ", msg;

                //
                if (s.isSelected()) {
                    size = "Small";
                } else if (m.isSelected()) {
                    size = "Medium";
                } else {
                    size = "Large";
                }

                //
                if (pep.isSelected()) {
                    topp += "\nPepperoni";
                }
                if (mush.isSelected()) {
                    topp += "\nMushroom";
                }
                if (arc.isSelected()) {
                    topp += "\nArchovies";
                }

                msg = "You have ordered a " + size + " size of pizza with following toppings: " + topp;
                JOptionPane.showMessageDialog(null, msg, "Your Pizza's spec...", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
    
        //
        SwingUtilities.invokeLater( new Runnable() {

            public void run()
            {
               new PizzaOrder(); 
            }
        });
    }
    
}