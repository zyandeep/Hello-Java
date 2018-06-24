import java.io.*;

class PrimeNo {

    void check(int number) {
        int isPrime = 1;

        if (number <= 1) {
            isPrime = 0;
        }
        else {
            for (int i = 2; i <= number/2; i++) {
                if (number % i == 0) {
                    isPrime = 0;
                }
            }
        }

        if (isPrime == 1) {
            System.out.println(number + " is a Prime No");
        }
        else {
            System.out.println(number + " isn't a Prime No");
        }
    } 
}


public class PrimeFunction {
    
    public static void main(String[] args) {
        DataInputStream br = new DataInputStream(System.in);
        int number = 0;
        System.out.print("Enter a number: ");
        
        try {
            number = Integer.parseInt(br.readLine());
        }
        catch(Exception e) {}

        PrimeNo p = new PrimeNo();

        p.check(number);
    }
}
