import java.util.Scanner;

class Converter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price: ");
        double price = sc.nextDouble();

        System.out.println((int)(price * 100) + " paisa");
    }
}