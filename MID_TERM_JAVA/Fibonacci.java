import java.io.*;

class Fibonacci {

    public static void main(String[] args) {
        DataInputStream br = new DataInputStream(System.in);
        int a = 0, b = 1, n = 0, c;

        System.out.print("Enter the value of n: ");

        try {
            n = Integer.parseInt(br.readLine());
        }
        catch(Exception e) {}

        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}