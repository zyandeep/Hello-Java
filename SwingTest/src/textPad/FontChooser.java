// A class to implement font chooser dialog box
// date: 28-07-14

package textPad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class FontChooser extends JFrame implements ActionListener, ListSelectionListener {
   
    private JPanel fp, sp, ap;
    private JList flist;
    private JComboBox fsize;
    private JCheckBox p, b, i;
    private JLabel fn, fs;
    private JButton ok, cancel;
    private Font newFont;
    
    private JTextArea ta;
    
    DemoFont df;
    
    public FontChooser(DemoFont df)
    {
        this.df = df;
        df.setFocusableWindowState(false);
        df.b1.setEnabled(false);
        df.b2.setEnabled(false);
        
        setTitle("Font Chooser Dialog...");
        setBounds(400, 200, 650, 450);
        setVisible(true);
        setResizable(false);
        addWindowListener( new EventWinow(this));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 300, 20));
        
        // setting up panels
        fp = new JPanel( new FlowLayout(FlowLayout.LEADING, 15, 20));
        sp = new JPanel( new BorderLayout());
        sp.setBorder( BorderFactory.createTitledBorder("<html><b> Sample Text </b></html>"));
        ap = new JPanel();
        ap.setLayout( new BoxLayout(ap, BoxLayout.LINE_AXIS) );
        this.add(fp);       this.add(sp);       this.add(ap);
        
        // setting up font-selection components in the fp
        fn = new JLabel("<html><b>Font Name</b></html>");
        fp.add(fn);
        
        GraphicsEnvironment gev = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fonts = gev.getAvailableFontFamilyNames();
        flist = new JList(fonts);
        flist.setSelectedValue("Comic Sans MS", true);
        flist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        flist.addListSelectionListener(this);
        
        JScrollPane scp = new JScrollPane(flist, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        fp.add(scp);
        
        fs = new JLabel("<html><b>Font Size</b></html>");
        fp.add(fs);
        
        fsize = new JComboBox();
        for (int i = 10; i <= 70; i+=2)
        fsize.addItem("  " + i + "  ");
        fsize.setSelectedIndex(1);
        fsize.addActionListener(this);
        fp.add(fsize);
        
        p = new JCheckBox("<html><b>Plain</b></html>", true);
        p.addActionListener(this);
        fp.add(p);
        b = new JCheckBox("<html><b>Bold</b></html>");
        b.addActionListener(this);
        fp.add(b);
        i = new JCheckBox("<html><b>Italic</b></html>");
        i.addActionListener(this);
        fp.add(i);
       
        String t = " Java is Plate-Form independent !!";
        ta = new JTextArea(t);
        ta.setEditable(false); 
        sp.add(ta);
        
        // setting up approve buttons in the ap
        ok = new JButton("<html><b> OK </b></html>");
        ok.addActionListener(this);
        cancel = new JButton("<html><b> Cancel </b></html>");
        cancel.addActionListener(this);
        
        ap.add( Box.createRigidArea( new Dimension(30, 90)));       
        ap.add(ok);
        ap.add( Box.createHorizontalStrut(50));
        ap.add(cancel);
        ap.add( Box.createRigidArea( new Dimension(30, 90)));
    }
   
    // method to show user the requested font
    private void setFont()
    {
        String fontName = (String) flist.getSelectedValue();
        
        String num = (String) fsize.getSelectedItem();
        int fontSize = Integer.parseInt(num.trim());
        int fontType = 0;
         
        if(p.isSelected())
            fontType = fontType | Font.PLAIN;
        if(b.isSelected())
            fontType = fontType | Font.BOLD;
        if(i.isSelected())
            fontType = fontType | Font.ITALIC;
            
         // creating the requested font
         newFont =  new Font(fontName, fontType, fontSize);
         ta.setFont(newFont);
    }

    public void actionPerformed(ActionEvent e)
    { 
         if(e.getSource() == ok)
         {
             // setting the requested font to the user's component
             df.l.setFont(newFont);
             df.setFocusableWindowState(true);
             df.b1.setEnabled(true);
             df.b2.setEnabled(true);
             
             this.dispose();
         }
         
         else if(e.getSource() == cancel)
         {
             JOptionPane.showMessageDialog(null, "<html><b>Thank you for using Font Chooser!</b></html>");
             this.dispose();
         }
         else
         {
            setFont();
         }
         
    }

    public void valueChanged(ListSelectionEvent e)
    {
        setFont();
    }
  
}
