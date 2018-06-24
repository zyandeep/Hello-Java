import java.io.*;

class PrimeNo {

    public static void main(String[] args) {
        DataInputStream br = new DataInputStream(System.in);
        int isPrime = 1;
        int number = 0;
        System.out.print("Enter a number: ");
        
        try {
            number = Integer.parseInt(br.readLine());
        }
        catch(Exception e) {}
        
        if (number <= 1) {
            isPrime = 0;
        }
        else {
            for (int i = 2; i <= number/2; i++) {
                if (number % i == 0) {
                    isPrime = 0;
                    break;
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
