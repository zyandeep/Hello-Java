import java.awt.event.*;

public class ActionEventDemo implements ActionListener {

    DemoJCheckbox jcb;
    
    public ActionEventDemo( DemoJCheckbox jcb) {
        this.jcb = jcb;
    }

    public void actionPerformed(ActionEvent e) {
        
      if( DemoItemEvent.rmState == ItemEvent.SELECTED) 
           jcb.rmL.setText(jcb.rm.getText());
      else
          jcb.rmL.setText(" ");
           
      if( DemoItemEvent.rsState == ItemEvent.SELECTED) 
           jcb.rsL.setText(jcb.rs.getText());
      else
          jcb.rsL.setText(" ");
       
      if( DemoItemEvent.nsState == ItemEvent.SELECTED) 
           jcb.nsL.setText(jcb.ns.getText());
      else
          jcb.nsL.setText(" ");    
    }
    
}
