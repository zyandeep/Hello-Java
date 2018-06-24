// A class to implements filter file types in the JFileChooser
// date: 27-07-14

package textPad;

import java.io.File;

public class FilterFileType extends javax.swing.filechooser.FileFilter {

    public FilterFileType()
    {
        
    }

    public boolean accept(File f)
    {
        if( f.isDirectory() || f.getName().endsWith(".txt") )
            return true;
        else
            return false;
        
    }

    public String getDescription() 
    {
        return "text files (.txt)";
         
    }
}
