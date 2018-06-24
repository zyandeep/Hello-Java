package awtEvent;

import java.awt.event.*;
import javax.swing.JOptionPane;

public class AEventHandle implements ItemListener {

    public void itemStateChanged(ItemEvent e) {

        if (QEventHandling.rb == null) {
            JOptionPane.showMessageDialog(null, "select state name first!", null, JOptionPane.ERROR_MESSAGE);
           
            
        } else if ((e.getItem() == Design.a1 && QEventHandling.rb == Design.q1)
                || (e.getItem() == Design.a2 && QEventHandling.rb == Design.q2)
                || (e.getItem() == Design.a3 && QEventHandling.rb == Design.q3)
                || (e.getItem() == Design.a4 && QEventHandling.rb == Design.q4)
                || (e.getItem() == Design.a5 && QEventHandling.rb == Design.q5)) {

            Design.result.setText("Y O U  A R E  C O R R E C T !!");

        }
        
        else {
            Design.result.setText("Y O U   A R E  W R O N G !!");
        }



    }
}
