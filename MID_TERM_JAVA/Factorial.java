import java.io.*;

class Factorial {

    public static void main(String[] args) {
        DataInputStream br = new DataInputStream(System.in);
        long fact = 1L;
        int number = 0;
        
        System.out.println("Enter a number: ");
        
        try {
            number = Integer.parseInt(br.readLine());
        } 
        catch(Exception e) {}

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial = " + fact);
    }
}
