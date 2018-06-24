// Login Form with Swing 
// date: 16-07-14

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener, WindowListener {
    
    JPanel p1;
    JLabel userName, passwd;
    JTextField name;
    JPasswordField pass;
    JButton ok, exit;
    
    public LoginForm() {
        
        super("Login form demo");
        this.setSize(500, 350);
        this.setVisible(true);
 
        p1 = new JPanel( new FlowLayout(FlowLayout.CENTER, 70, 40));
        userName = new JLabel("UserName");
        passwd = new JLabel("Password");
        name = new JTextField(20);
        pass = new JPasswordField(20);
        ok = new JButton("OK");
        exit = new JButton("EXIT");
        
        // registering listeners with corresponding components
		this.addWindowListener(this);
        ok.addActionListener(this);
        exit.addActionListener(this);
        pass.addActionListener(this);
        
        p1.add(userName);           p1.add(name);
        p1.add(passwd);             p1.add(pass);
        p1.add(ok);                 p1.add(exit); 
        
        this.add(p1);
        
    }

    public void actionPerformed(ActionEvent e) {
        
        String name = (this.name).getText();
        
        // getPassword() returns the password as a char[] 
        char[] p = (this.pass).getPassword();
        String passwd = new String(p);
      
        if (e.getSource() == ok)
            JOptionPane.showMessageDialog(null, "Button\n" + "Name: " + name + "\n" + 
                    "Password: " + passwd,  "Login Dialog", JOptionPane.INFORMATION_MESSAGE);
        else if (e.getSource() == pass)
            JOptionPane.showMessageDialog(null, "JPasswd\n" + "Name: " + name + "\n" + 
                    "Password: " + passwd,  "Login Dialog", JOptionPane.INFORMATION_MESSAGE);
        else {
            
            // check whether a filed of the form is empty
            if(name.isEmpty() || passwd.isEmpty() ) {
                JOptionPane.showMessageDialog(null, "Fill the form first",  "Login Dialog", JOptionPane.INFORMATION_MESSAGE);
            }
                
            else
               System.exit(0);
        }
                        
    }
      
    // how to prevent user from closing the window before felling a form
    public void windowClosing(WindowEvent e) {
      
        char[] p = pass.getPassword();
        String n = name.getText();
        
      if (n.isEmpty() || p.length == 0 ) {
          
          this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
          JOptionPane.showMessageDialog(null, "Fill the form first",  "Login Dialog", JOptionPane.INFORMATION_MESSAGE); 
      }
      else
          this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void windowActivated(WindowEvent e) { }

    public void windowClosed(WindowEvent e) { }
   
    public void windowDeactivated(WindowEvent e) { }
    
    public void windowDeiconified(WindowEvent e) { }
    
    public void windowIconified(WindowEvent e) { }
    
    public void windowOpened(WindowEvent e) {}
    
   
    public static void main (String[] args) {
        new LoginForm();
    } 
}