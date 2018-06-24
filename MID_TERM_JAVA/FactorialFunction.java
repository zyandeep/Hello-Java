import java.io.*;

class Factorial {
    
    long calFact(int number) {
        long fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        return fact;
    }
}

public class FactorialFunction {
    
    public static void main(String[] args) {
        DataInputStream br = new DataInputStream(System.in);
        int number = 0;
        
        System.out.println("Enter a number: ");
        
        try {
            number = Integer.parseInt(br.readLine());
        } 
        catch(Exception e) {}

        Factorial f = new Factorial();
        
        System.out.println("Factorial = " + f.calFact(number));
    }
}