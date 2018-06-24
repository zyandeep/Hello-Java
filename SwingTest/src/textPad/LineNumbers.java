// Show and hide line numbers
// date: 19-08-14

package textPad;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;

public class LineNumbers extends JFrame implements ActionListener, DocumentListener 
{
    private int lineNum = 0;
    JTextArea ta;
    JLabel l;
    JPanel p;
    JMenuBar mb;
    JMenu option;
    JCheckBoxMenuItem line;
   
    public LineNumbers() 
    {
        setTitle("Show Hide Line numbers");
        setBounds(400, 300, 500, 400);
        setVisible(true);
        setResizable(false);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //add text area in the JFeame
        ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.add(sp, BorderLayout.CENTER);
        ta.getDocument().addDocumentListener(this);

        //set up the panel to show line numbers
        p = new JPanel(new FlowLayout(FlowLayout.LEADING));
        p.setBackground(Color.lightGray);
        l = new JLabel(" ");
        p.add(l);
        p.setVisible(false);
        this.add(p, BorderLayout.WEST);

        setUpMenu();

    }

    void setUpMenu() 
    {
        mb = new JMenuBar();
        this.setJMenuBar(mb);

        option = new JMenu("Option");
        option.setMnemonic(KeyEvent.VK_O);
        // option.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
        mb.add(option);

        line = new JCheckBoxMenuItem("Show Line numbers", false);
        line.addActionListener(this);
        option.add(line);

    }

    
    //
    void addLineNumber() 
    {
        int noOfLines = this.ta.getLineCount();
        String lineNum = " ";

        for (int i = 1; i <= noOfLines; i++) 
        {
            lineNum += String.valueOf(i) + "<br/>";
        }
        this.l.setText("<html>" + lineNum + "</html>");
    }

    //
    int giveLineNum() 
    {
        int curLineNum = 0;

        try {
            curLineNum = ta.getLineOfOffset(ta.getCaretPosition());
        } catch (Exception e) {
            //System.err.println(e.getMessage());
        }

        return curLineNum;
    }
    
    
    //
    void updateLineNum()
    {
        int line = giveLineNum();
        
        if (lineNum != line) 
        {
            this.lineNum = line;
            addLineNumber();

        }

    }
    
    
    //
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == line)
        {
            if (line.isSelected())
            {
                addLineNumber();
                p.setVisible(true);
            } 
            else 
            {
                p.setVisible(false);
            }

        }
    }

    public void insertUpdate(DocumentEvent e) 
    {
        updateLineNum();
    }

    public void removeUpdate(DocumentEvent e) 
    {
         updateLineNum();
    }

    public void changedUpdate(DocumentEvent e) 
    {
        updateLineNum();
    }

   

    public static void main(String[] args) 
    {
        // swing is not thread safe. So use event-dispatch thread
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new LineNumbers();

            }
        });
    }
}
