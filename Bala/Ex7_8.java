import java.util.Scanner;

class Ex7_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers: ");
        int m = sc.nextInt();

        int a = 0, b = 1, c, i = 1;
        while (i++ <= m) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}