import java.util.Scanner;
import java.util.Random;

public class GuessStarter {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int comp_guess = random.nextInt(100) + 1;

        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        int user_guess = in.nextInt();

        System.out.println("Your guess is: " + user_guess);
        System.out.println("The number I was thinking of is: " + comp_guess);

        if (user_guess == comp_guess) {
            System.out.println("You guessed it correctly!");
        }
        else {
            int off = (user_guess > comp_guess) ? (user_guess - comp_guess)
                        : (comp_guess - user_guess);
            System.out.println("You were off by: " + off);
        }
    }
}