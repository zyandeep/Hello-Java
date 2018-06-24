// demo of using JCombo box
// date: 20-07-14

package allSwingDemos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoJCombo extends JFrame implements ActionListener, ItemListener {

    JLabel lb, im;
    JComboBox cb;
    JPanel p1, p2;
    String[] items = {"Game", "Music", "HTML", "Sun MS", "NetBeans", "OpenJDK", "Pic"};
    
    public DemoJCombo() 
    {
        super ("JList Demo");
        setBounds(350, 120, 800, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        
        p1 = new JPanel( new FlowLayout(FlowLayout.CENTER, 50, 20));
        p2 = new JPanel( new BorderLayout(50, 5));
        
        lb = new JLabel("Choose an item from the combo box: ");
        
        cb = new JComboBox(items);
        cb.setMaximumRowCount(4);
        //cb.addActionListener(this);
        cb.addItemListener(this);
        //cb.setSelectedIndex(2);
        //cb.setEditable(true);
        
        im = new JLabel(" ", JLabel.CENTER);
        
        p1.add(lb);         p1.add(cb);
        p2.add(im, BorderLayout.CENTER);
        
        this.add(p1);       this.add(p2);
        
    }
    
    public static void main (String[] args)
    {
        new DemoJCombo();
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String pic = "D:\\Java\\pics\\" + (String) cb.getSelectedItem() + ".png";
       
        im.setIcon( new ImageIcon(pic));
        
    }

    public void itemStateChanged(ItemEvent e)
    {
        //JOptionPane.showMessageDialog(null, "Total item: " + cb.getItemCount());
        //cb.addItem("1");
        //cb.removeAllItems();
        
        int index = cb.getSelectedIndex();
        String path = "D:\\Java\\pics\\" + items[index] + ".png";
        
        im.setIcon( new ImageIcon(path));
        
    }
 
}
