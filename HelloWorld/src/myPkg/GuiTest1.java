// My first Java GUI program in linux
// date: 03/04/14

package myPkg;

import javax.swing.JOptionPane;

public class GuiTest1 {
    
    public static void main(String[] args) {
        
        String n1 = JOptionPane.showInputDialog("Enter the 1st number");
        String n2 = JOptionPane.showInputDialog("Enter the 2st number");
        
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        int res = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "The answer is" + res, "Answer", JOptionPane.ERROR_MESSAGE);
    }
}
