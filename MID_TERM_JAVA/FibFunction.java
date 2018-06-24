import java.io.*;

class Fibonacci {

    void generate(int n) {
        int a = 0, b = 1, c;
        
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}



public class FibFunction {

    public static void main(String[] args) {
        DataInputStream br = new DataInputStream(System.in);
        int n = 0;
       
        System.out.print("Enter the value of n: ");

        try {
            n = Integer.parseInt(br.readLine());
        }
        catch(Exception e) {}


        new Fibonacci().generate(n);
    }
}