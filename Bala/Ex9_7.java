import java.util.Scanner;
import java.util.Arrays;

class Ex9_7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] count = new int[5];
        int spBallot = 0;
        byte ballot, isOver = 0;

        do {
            System.out.println("Enter the ballot: ");
            ballot = sc.nextByte();
            ballot--;

            if (ballot >= 0 && ballot <= 4) {
                count[ballot]++;
            }
            else {
                spBallot++;
            }

            System.out.println("Want to quit? (1/0) ");
            isOver = sc.nextByte();

        } while(isOver != 1);

        System.out.println(Arrays.toString(count));
        System.out.println(spBallot);
    }
}