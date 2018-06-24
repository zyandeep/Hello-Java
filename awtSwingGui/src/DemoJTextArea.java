// JTextArea demo

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class DemoJTextArea extends JFrame implements ActionListener {
    
    JTextArea ta = new JTextArea("enter some text here", 50, 50);
    JButton b = new JButton("Submit");
    
    public DemoJTextArea() throws HeadlessException {
        super("*** JTextArea Demo ***");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        getContentPane().add(ta, BorderLayout.CENTER);
        getContentPane().add(b, BorderLayout.SOUTH);
        
        b.addActionListener(this);
        ta.addFocusListener(new Demo());
        ta.setBackground(Color.pink);
        ta.setFont(new Font("comic sans ms", Font.ITALIC, 20));
    }
    
    public void actionPerformed(ActionEvent e) {
        String myStr = ta.getText();
        JOptionPane.showMessageDialog(null, myStr, "Jtext Area", JOptionPane.INFORMATION_MESSAGE);
        ta.setText(" ");
    }
    
    class Demo extends FocusAdapter {
        
        public void focusGained(FocusEvent e) {
            ta.append("Focus gained!");
        }
        
        public void focusLost(FocusEvent e) {
            ta.append("Focus lost!");
        }
    }
    
    public static void main(String[] args) {
        new DemoJTextArea();
    }
}
