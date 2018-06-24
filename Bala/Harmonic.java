import java.util.Scanner;

class Harmonic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        double res = 0.0;

        for (int i=1; i <= n; i++) {
            res = res +  (double)1/i;
        }

        System.out.println("Result = " + res);
    }
}