// demo of features of JTextComponent
// date: 15-08-14

package allSwingDemos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.* ;

public class JTextAreaFeatures extends JFrame implements ActionListener 
{
    JTextArea ta;
    JPanel p;
    JLabel line;
    JButton test;

    private DemoDocument de;
    
    public JTextAreaFeatures()
    {
        setLnf();
        setTitle("Untitled Text");
        setBounds(300, 200, 400, 300);
        setResizable(false);
        setVisible(true);

        
        de = new DemoDocument(this); 
        this.addWindowListener(de); 
        
        p = new JPanel();
        test = new JButton("Click Me!!");
        test.addActionListener(this);
        line = new JLabel(" ");
        p.add(test);    p.add(line);
        this.add(p, BorderLayout.PAGE_END);

        ta = new JTextArea();
        ta.getDocument().addDocumentListener(de); 
        JScrollPane sc = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.add(sc);
    }

    public void actionPerformed(ActionEvent e) 
    {
         //select all the text of the text area
        ta.requestFocus();  
        this.ta.selectAll();

//         //converting carate position to cordinate
//        try {
//            offToPos();
//           
//        } catch (BadLocationException ex) {
//            System.err.println(ex);
//        }
//        
        //goto a particular line 
        gotoLine();
        
    }

    
    // converting carat position to cordinates
    void offToPos() throws BadLocationException
    {
        int offset = ta.getCaretPosition(); 
        int lineNumber = ta.getLineOfOffset(offset) ;    // converts an offset to line number
        int colNumber = (offset - lineNumber) + 1;      // calculates column number
            
        System.out.println("\n\noffset/carat position: " + ta.getCaretPosition() );
        System.out.println("line number: " + lineNumber);
        System.out.println("row num = " + ( lineNumber + 1));    // calculates row number
        System.out.println("col num = " + colNumber);
    }
    
    
    // goto a particular line number
    void gotoLine()
    {
        String input = JOptionPane.showInputDialog(null, "Enter line number: ");
        int lineNumber = Integer.parseInt(input) - 1;
        
        try {
            int offset = ta.getLineStartOffset(lineNumber);
            
            ta.requestFocus();
            ta.setCaretPosition(offset); 
            
        } catch ( BadLocationException ex) {
            System.err.println();
        }
      
    }
            
    
    // setting the app's look-N-fill
    void setLnf()
    {
        try 
        {
            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );   
        } 
        catch (Exception e) 
        {
            System.err.println(e);
        }
        
    }
    
   
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new JTextAreaFeatures();
            }
        });
    }
}
