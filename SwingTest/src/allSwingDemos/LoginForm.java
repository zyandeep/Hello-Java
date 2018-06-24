// Login Form with Swing 
// date: 16-07-14

package allSwingDemos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class LoginForm extends JFrame implements ActionListener, WindowListener {
    
    JPanel p1;
    JLabel userName, passwd;
    JTextField name;
    JPasswordField pass;
    JButton ok, exit;
    boolean bool = true;
   
    public LoginForm() {
        
        super("Login form demo");
        this.setSize(500, 350);
        this.setVisible(true);
        this.setResizable(false);
        this.addWindowListener(this);
    
        // settings Java's new Nimbus look-and-feel
        try {
            UIManager.setLookAndFeel( new NimbusLookAndFeel());
            
        }
        catch ( Exception e)
        {
            System.err.println("You don't have the Nimbus lnf ");
            System.err.println("going back to Java's METAL lnf");
        }
        
        p1 = new JPanel( new FlowLayout(FlowLayout.CENTER, 70, 40));
        userName = new JLabel("UserName");
        passwd = new JLabel("Password");
        name = new JTextField(20);
        pass = new JPasswordField(20);
        ok = new JButton("OK");
        exit = new JButton("EXIT");
        
        //
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
            
            //
            if(name.isEmpty() || passwd.isEmpty() ) {
                JOptionPane.showMessageDialog(null, "Fill the form first",  "Login Dialog", JOptionPane.INFORMATION_MESSAGE);
            }
                
            else
               System.exit(0);
        }
                        
    }

      
    // how to prevent user closing the window before feeling form
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
        
       // swing is not thread safe, so can't use the main thread
        SwingUtilities.invokeLater( new Runnable() {

            public void run()
            {
                new LoginForm();
            }
        });
        
    } 
}
