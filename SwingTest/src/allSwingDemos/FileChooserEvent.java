// A class to handle event of JFileChooser and JColorChooser
// date: 27-07-14

package allSwingDemos;

import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class FileChooserEvent implements ActionListener {

    int result;
    DemoJFileChooser f;
    private PrintWriter pw;
    private File file;

    public FileChooserEvent(DemoJFileChooser ff)
    {
        this.f = ff;
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand().equals(" Open File..."))
        {
            f.fc.setDialogTitle("Open file...");
            result = f.fc.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION)
            {
                file = f.fc.getSelectedFile();

                this.f.setTitle(file.getAbsolutePath());

                try {
                    f.br = new BufferedReader(new FileReader(file));

                    f.ta.setText(" ");

                    while (true)
                    {
                        String text = f.br.readLine();

                        if (text == null) {
                            break;
                        }

                        f.ta.append(text + "\n");
                    }
                } 
                catch (IOException ioe)
                {
                    System.out.println("File operation can't be completed!");
                }

            }

        } 
        else 
        {
            f.fc.setDialogTitle("Save file...");
            result = f.fc.showSaveDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) 
            {
                try {
                    
                    file = f.fc.getSelectedFile();
                    
                    String fileName = file.getName();
                    
                    if( fileName.lastIndexOf('.') <= 0) 
                    {
                        file = new File(file.getAbsoluteFile() + ".txt");
                    }
                    
                    pw = new PrintWriter(file);
                    pw.println(f.ta.getText());
                    
                    this.f.setTitle(file.getAbsolutePath());
                } 
                catch (IOException ioe)
                {
                    System.err.println("File can't be saved!!");
                } 
                finally 
                {
                    pw.close();
                    System.out.println("saved file is closed successfully!!");
                    
                }
            }

        }

    }
}
