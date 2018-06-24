import java.util.Scanner;

class Ex9_13 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte count = 1;
        boolean isCorrect = false;
        String ans;

        do {
            System.out.println("Who is the inventor of Java? ");
            ans = sc.nextLine();
            
            if (ans.equalsIgnoreCase("james goosling")) {
                System.out.println("Good!");
                isCorrect = true;
            }
            else {
                if (count == 3) {
                    System.out.println("James Goosling");
                }
                else
                    System.out.println("Try again!");
                count++;
            }
        } while(!isCorrect && count <= 3);
    }
}