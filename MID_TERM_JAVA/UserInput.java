import java.io.*;

class UserInput {

    public static void main(String[] args) {
        DataInputStream br = new DataInputStream(System.in);
        int number = 0;
        System.out.print("Enter a number: ");

        try {
            number = Integer.parseInt(br.readLine());
        }
        catch(Exception e) {}

        int fact = 1;

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
        }
        System.out.println("Factorial = " + fact);
    }
}