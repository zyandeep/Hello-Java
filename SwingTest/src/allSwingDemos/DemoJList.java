// demo of using JList
// date: 20-07-14

package allSwingDemos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class DemoJList extends JFrame implements ActionListener, ListSelectionListener {
    
    JList list;
    JLabel l, ans;
    JButton b;
    String[] city = {"New York", "New Delhi", "Mumbai", "Paris", "London", "Hong Kong", "Channai", "Tokiyo",
                          "Toronto", "Canada"};
 
    public DemoJList() 
    {
        super ("JList Demo");
        setBounds(400, 170, 450, 350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        
        // settings Java's new Nimbus look-and-feel
        try {
            UIManager.setLookAndFeel( new NimbusLookAndFeel());
            
        }
        catch ( Exception e)
        {
            System.err.println("You don't have the Nimbus lnf ");
            System.err.println("going back to Java's METAL lnf");
        }
        
        list = new JList(city);
        list.setVisibleRowCount(5);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(1);
        
        // setting up rows width and height
        list.setFixedCellHeight(25);
        list.setFixedCellWidth(100);
        list.addListSelectionListener(this);
        
        JScrollPane sp = new JScrollPane
                (list, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        l = new JLabel("Where do you wanna go??", JLabel.CENTER);
        ans = new JLabel(" ", JLabel.CENTER);
        b = new JButton("Done!");
        b.addActionListener(this);
        
         this.add(l);      this.add(sp);    
         this.add(b);      this.add(ans);
      
    }
    
    public static void main (String[] args)
    {
        // swing is not thread safe, so can't use the main thread
        SwingUtilities.invokeLater( new Runnable() {

            public void run()
            {
                new DemoJList();
            }
        });
    }

    public void actionPerformed(ActionEvent e) 
    {
        // checks whether any item is selected or not
        if ( list.isSelectionEmpty())
        {
            JOptionPane.showMessageDialog(null, "Nothing is selected!");
            return;
            
        }
        
        else
        {
            String output = " ";
            int[] items = list.getSelectedIndices();
            
            for (int i : items)
            {
                output += city[i] + "  ";
               
            }
            ans.setText(output);
    
        }
        
    }

    public void valueChanged(ListSelectionEvent e) 
    {
        b.setEnabled(false);
        
        ans.setText( (String) list.getSelectedValue() );
    
    }
    
}
