// Accept name and dispaly it
// date: 15-07-2014

package allSwingDemos;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.Border;

public class Hello extends JFrame implements ActionListener {

    // declears controls
    JLabel nameL, printName ;
    JTextField nameT;
    JButton b;
    JPanel p1, p2, p3;
    Border border;
   
    // codes necessary to inisialised and positions the components inside JFrame
    public Hello() {
        
        super("Hello JFrame");
        setLayout(new GridLayout(2, 1));
        setResizable(false);
        
        //
        border = BorderFactory.createLineBorder(Color.red);
       
        //
        nameL = new JLabel("Enter your name");
        nameT = new JTextField(30);
        p1 = new JPanel( new FlowLayout(FlowLayout.CENTER, 20, 40) );
        p1.add(nameL);          p1.add(nameT);
    
        //
        printName = new JLabel();
        printName.setBorder(border);
        b = new JButton("click");
        b.setForeground(Color.red);
        
        //
        b.addActionListener(this);
        p2 = new JPanel( new GridBagLayout());
     
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 1;
        gc.gridy = 0;
        gc.gridwidth = 3;
        gc.gridheight = 1;
        gc.weightx = 0.0;
        gc.weighty = 0.0;
        gc.insets = new Insets(10, 10, 10, 10);
        gc.fill = GridBagConstraints.EAST;
        gc.anchor = GridBagConstraints.EAST;
        
        p2.add(printName, gc);
        
        gc.gridx = 2;
        gc.gridy = 2;
        
         p2.add(b, gc);
        
        //
        add(p1);
        add(p2);
        
        this.setSize(550, 350);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //
    public void actionPerformed(ActionEvent e) {
        printName.setText("Hello! " + nameT.getText());
 
    }
    
    
    public static void main (String[] args) {
        
        new Hello();
    }
}
