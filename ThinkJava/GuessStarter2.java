import java.util.Scanner;
import java.util.Random;

public class GuessStarter2 {

    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();


    static int[] getInput() {
        int [] inputs = new int[2];

        inputs[0] = random.nextInt(100) + 1;

        System.out.print("Type a number: ");
        inputs[1] = sc.nextInt();
    
        return inputs;
    }

   static void playGame() {
       int[] data = getInput();

       System.out.println("The number I was thinking of is: " + data[0]);
       System.out.println("Your guess is: " + data[1]);

       if (data[0] == data[1]) {
           System.out.println("You guessed it correctly!");
       }
       else {
           int off = (data[1] > data[0]) ? (data[1] - data[0])
                    : (data[0] - data[1]);
           System.out.println("You were off by: " + off);

           playGame();
        }
   }



    public static void main(String[] args) {
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");        

        playGame();
    }
}