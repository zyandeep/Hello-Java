// Action event handling

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoActionEvent implements ActionListener {

    ButtonDemo bd;

    public DemoActionEvent(ButtonDemo bd) {
        this.bd = bd;
    }

    
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();

        if (str.equalsIgnoreCase("red")) {
            bd.bg.setBackground(Color.red);
        } else if (str.equalsIgnoreCase("green")) {
            bd.bg.setBackground(Color.green);
        } else {
            bd.bg.setBackground(Color.blue);
        }

    }
}
