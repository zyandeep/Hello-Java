import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class AppAddition extends Applet implements ActionListener {

    TextField t1, t2, t3;
    Label l1, l2, l3;
    Button b;
    
    public void init() {
        t1 = new TextField(8);
        t2 = new TextField(8);
        t3 = new TextField(8);
        l1 = new Label("FIRST NUMBER");
        l2 = new Label("SECOND NUMBER");
        l3 = new Label("SUM");
        b = new Button("Add");
        
        add(l1);add(t1);
        add(l2);add(t2);
        add(b);
        add(l3);add(t3);
        
        b.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        int n1, n2, sum = 0;
        
        try {
            n1 = Integer.parseInt(t1.getText());
            n2 = Integer.parseInt(t2.getText());
            sum = n1 + n2;
        }
        catch(Exception ex) {}
        
        t3.setText(String.valueOf(sum));
    }
}
