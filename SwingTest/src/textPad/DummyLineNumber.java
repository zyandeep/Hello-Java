// Show and hide line numbers
// date: 19-08-14


/***
 *  The LOGIC:
 *  we calculates the number of wrapped lines between two "actual lines" ends with newLine (\n). And that number
 *  of \n are added to the text area that shows line numbers. This is done by calculating the vertical distance
 *  ( distance in y-axis ) between the two points from where an "actual line" starts and the dividing the number
 *  by the height of the font.
 */


package textPad;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;


public class DummyLineNumber extends JFrame implements ActionListener, DocumentListener {

    int newLine = 1;            // this stores the total no of lines of the text area
    
    JTextArea ta;
    JTextArea taLine;
    JMenuBar mb;
    JMenu option;
    JScrollPane sp;
    JCheckBoxMenuItem line;
    
    Rectangle r1;               // converts offset of a '\n' to point(x, y) of the view coordinate system.
    int[] offsetArr;            // stores the offsets of '\n' of the text.
    Point p1, p2;               // position of the lines in the view coordinate system ( as x,y )

    
    public DummyLineNumber() 
    {
        setTitle("Show Hide Line numbers");
        setBounds(400, 300, 500, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        //add text area in the JFrame
        ta = new JTextArea();
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        sp = new JScrollPane(ta);
        this.add(sp, BorderLayout.CENTER);
        ta.getDocument().addDocumentListener(this);

        //set up the text area to show line numbers
        taLine = new JTextArea("1");
        taLine.setColumns(2);
        taLine.setMargin(new Insets(1, 5, 1, 2));
        taLine.setBackground(Color.LIGHT_GRAY);
        taLine.setEditable(false);
        sp.setRowHeaderView(taLine);

       
        // instaning the array that stores the offset of "\n" within the text
        // the size of the array is gonna vary with the no. of "\n"
        offsetArr = new int[1];
        
        setUpMenu();

        
        // listener to listen the resizing of the JFrame
        this.addComponentListener(new ComponentAdapter() 
        {
            public void componentResized(ComponentEvent e) 
            {
                setLines();      // update the text area that displayes line number
            }
        });

    }

    
    private void setUpMenu() 
    {
        mb = new JMenuBar();
        this.setJMenuBar(mb);

        option = new JMenu("Option");
        option.setMnemonic(KeyEvent.VK_O);
        mb.add(option);

        line = new JCheckBoxMenuItem("Show Line numbers", true);
        line.addActionListener(this);
        option.add(line);

    }

    
    
    /// method to check addition/deletion of lines, calculate lines and display them
    private void updateLines()
    {
        String text = ta.getText();

        int count = 1, j = 0;


        // count total number of new lines 
        // can be used: textArea.getLineCount();
        
        for (int i = 0; i < text.length(); i++) 
        {
            if (text.charAt(i) == '\n') 
            {
                count++;
                
                // stores the offset of '\n'
                offsetArr[j++] = i;

            }
        }



        if ( count != newLine )          // if condition true, then new line(s) are added/removes 
        {
            
            //System.out.println("count = " + count + "\t" + ta.getLineCount() );
            
            newLine = count;        // save the current line numbers

            setLines();
            
        }

    }

    
    
    int calWrappedLines( int offset ) 
    {
        try {

            System.out.println("offset: " + offset );
            
            
            // offset of '\n' to point(x, y)
            r1 = ta.modelToView( offset );     

////////////////////    TESTING   //////////////////////////////////////
            System.out.println("r1 : " + r1);
            System.out.println("p1 : " + p1);
////////////////////////////////////////////////////////////////////

            
            // the new point/position where the new line number should be displayed
            p2 = new Point(5, r1.y + r1.height);
            
            
////////////////////      TESTING       /////////////////////////////////////               
            System.out.println("p2 : " + p2);
///////////////////////////////////////////////////////////////////////////////
            
            
            // calcutale the number of wrapped line between two points that represents two actual lines
            int nl = (p2.y - p1.y) / r1.height;

            
            // the second point will be first point while calculating wapped lines from that point
            p1 = p2;

            
            return nl;      // return the no of wapped lines to its caller

        } 
        catch (Exception e) 
        {
            // when two( or more) consecutive new lines are added to text area the exception occures (?)
            // the offset of the new lines (except the frist one) can't be converted to point. (??)
        }

        
        return -1;         // if exception occures return -1
    }

    
    
    //
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == line) 
        {
            if (line.isSelected()) 
            {
                sp.setRowHeaderView(taLine);
            } 
            else 
            {
                sp.setRowHeaderView(null);
            }

        }
    }

    
    
    ///////////////////////////////////////////
    public void insertUpdate(DocumentEvent e) 
    {

        // (in real) no of newline  =  textarea.getLineCount() - 1
        
        if ( offsetArr.length != ( ta.getLineCount() - 1 ) ) 
        {
            offsetArr = new int[ ta.getLineCount() - 1 ];

            
////////////////////////////////     TESTING       ///////////////////////////////////               
            System.out.println("new Arry length: " + offsetArr.length);
///////////////////////////////////////////////////////////////////////////////
            
        }

        updateLines();
    }

    
    
    public void removeUpdate(DocumentEvent e) 
    {
        if ( offsetArr.length != ( ta.getLineCount() - 1 ) ) 
        {
             offsetArr = new int[ ta.getLineCount() - 1 ];

             
////////////////////////////////     TESTING       ///////////////////////////////////               
            System.out.println("new Arry length: " + offsetArr.length);
///////////////////////////////////////////////////////////////////////////////
            
        }

        updateLines();
    }

    
    public void changedUpdate(DocumentEvent e)
    {
        // never called for PlainTextDocument
    }

    
    
    // this method actually displays line numbers in the text area
    private void setLines() 
    {
        taLine.setText("");
        
        // the fisrt point that represents a actual line.
        // It's the view-coordinate position of the line number "1"
        p1 = new Point(5, 1);


        for ( int i = 1; i <= newLine; i++ ) 
        {
            if (i == 1) 
            {
                taLine.append("1" + "\n");
            } 
            else 
            {
                // get the number of wrapped line s between two actual lines ( between two (offset) of "\n" )
                
                // parameter of calWrappedLines() is the offset of the second "\n" upto which we need to 
                // count the number of wrapped lines.
                
                int wpLn = calWrappedLines( offsetArr[i - 2] );

                
////////////////////////////////     TESTING       ///////////////////////////////////               
                System.out.println("wrap lines: " + wpLn);
/////////////////////////////////////////////////////////////////////////////////////
                


                for (int j = 1; wpLn > 0 && j <= wpLn; j++) 
                {
                    taLine.append("\n");
                }
                
                
                if( wpLn == -1)              // if two or more onsecutive new lines are added
                {
                    taLine.append("\n");
                }

                taLine.append( Integer.toString(i) );
            }

        }
    }

    
    
    public static void main(String[] args) {

        // swing is not thread safe. So use event-dispatch thread
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new DummyLineNumber();

            }
        });
    }
}
