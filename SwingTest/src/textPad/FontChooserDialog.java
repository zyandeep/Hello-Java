//

package textPad;

import java.awt.*;
import javax.swing.*;

public class FontChooserDialog {

    JLabel lb;
    JButton but;
    JDialog dialog;
    
    SwingDialogDemo sdd;
    
    public FontChooserDialog( SwingDialogDemo sdd ) 
    {
        this.sdd = sdd;
        
        showDialog();
    }

    
    private void showDialog()
    {
        
        JDialog.setDefaultLookAndFeelDecorated(true); 
        
        dialog = new JDialog(sdd, "JDialog", true);
        
        dialog.setSize(300, 200); 
        dialog.setResizable(false); 
        dialog.setLayout( new FlowLayout() ); 
        dialog.setDefaultCloseOperation( JDialog. DISPOSE_ON_CLOSE );
        
        but = new JButton("out of order");
        lb = new JLabel("Hello there!");
        
        dialog.getContentPane().add(lb);       dialog.getContentPane().add(but);
        
        dialog.setVisible(true);
    }
    
}
