// demo of JFileChooser
// date: 27-07-14

package textPad;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.Date;

public class DemoJFileChooser extends JFrame 
{
    JMenuBar menuBar;
    JMenu menu1;
    JMenuItem mi1, mi2, mi3;
    JScrollPane sp;
    JTextArea ta;
    JFileChooser fc;
    BufferedReader br;

    public DemoJFileChooser()
    {
        setTitle("JFileChooser demo");
        setVisible(true);
        setBounds(400, 100, 650, 500);
        setIconImage(new ImageIcon("D:\\JAVA\\icons\\text.png").getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e)
            {
                    try {
                    if (br != null)
                    {
                        br.close();
                        System.out.println("Open file is closed successfully!!");
                    }

                } 
                catch (IOException ioe) 
                {
                    System.err.println("File can't be closed!");
                }

            }
        });

        ta = new JTextArea(300, 200);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        sp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.add(sp);

        setUpMenu();
        setUpFileChooser();
    }

    public static void main(String[] args)
    {
        // swing is not thread-safe
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                //JFrame.setDefaultLookAndFeelDecorated(true);
                new DemoJFileChooser();
            }
        });
    }

    private void setUpMenu()
    {
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        menu1 = new JMenu("Test Menu");
        menu1.setMnemonic(KeyEvent.VK_T);
        menuBar.add(menu1);

        ActionListener al = new FileChooserEvent(this);

        mi1 = new JMenuItem(" Open File...", new ImageIcon("D:\\JAVA\\icons\\openFile.png"));
        mi1.setAccelerator(KeyStroke.getKeyStroke("control O")); 
        mi1.addActionListener(al);

        mi2 = new JMenuItem(" Sava File... ", new ImageIcon("D:\\JAVA\\Icons\\newFile.png"));
        mi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
        mi2.addActionListener(al);
        
        //
        menu1.addSeparator();
                
        mi3 = new JMenuItem(" Insert Date", new ImageIcon("D:\\JAVA\\Icons\\saveAll.png"));
        mi3.setAccelerator(KeyStroke.getKeyStroke("F5"));
        mi3.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String curDate = new Date().toString();
                JOptionPane.showMessageDialog(null,  curDate);
            }
        });

        menu1.add(mi1);
        menu1.add(mi2);
        menu1.add(mi3);

    }
    
    
    //
    private void setLnF()
    {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
            

    
    private void setUpFileChooser()
    {
        fc = new JFileChooser();
        fc.addChoosableFileFilter(new FilterFileType());
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fc.setFileHidingEnabled(false);
    }
}
