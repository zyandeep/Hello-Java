
import java.awt.event.*;
import javax.swing.*;

public class DemoItemEvent implements ItemListener {

    DemoJCheckbox jcb;
    static JCheckBox temp;
    static int rmState, rsState, nsState;

    public DemoItemEvent(DemoJCheckbox jcb) {
        this.jcb = jcb;
    }

    public void itemStateChanged(ItemEvent e) {
        
       temp = (JCheckBox) e.getItem();
       
       if(temp == jcb.rm)
       rmState = e.getStateChange();
       
       else if(temp == jcb.rs)
       rsState = e.getStateChange();
       
       else
           nsState = e.getStateChange();
       
       /*if( state == ItemEvent.SELECTED ) {
           if(temp == jcb.rm) 
               jcb.rmL.setText(temp.getText());
           else if (temp == jcb.rs)
               jcb.rsL.setText(temp.getText());
           else
               jcb.nsL.setText(temp.getText());
           
       }
       
       else {
           if(temp == jcb.rm) 
               jcb.rmL.setText(" ");
           else if (temp == jcb.rs)
               jcb.rsL.setText(" ");
           else
               jcb.nsL.setText(" ");
       }*/
           
    }
}
