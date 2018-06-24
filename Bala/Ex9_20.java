import java.util.Vector;
import java.util.Scanner;

class Ex9_20 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector list = new Vector();
        for (String str : args) {
            list.addElement(str);
        }

        list.remove("Hello");
        list.insertElementAt(24, 1);    // Featuring Autoboxing!!!
        int[] test = {12, 89, 90};

        list.addElement(test);

        System.out.println(list.toString());
    }
}